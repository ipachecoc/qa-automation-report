package com.flashtalking.reportmanager.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.mappers.JobMapper;
import com.flashtalking.reportmanager.models.JenkinsReportModel;
import com.flashtalking.reportmanager.models.JobModel;

@Component
public class ScheduledTasks {
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private final RestTemplate restTemplate;
	private final JobService service;
	private final BuildService buildService;

	@Autowired
	public ScheduledTasks(RestTemplate restTemplate, JobService service, BuildService buildService) {
		this.restTemplate = restTemplate;
		this.service = service;
		this.buildService = buildService;
	}

	@Scheduled(fixedDelay = 60000)
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
		String response = apiResponse();
	}
	
	public String apiResponse() {
		String url = "http://dev-jenkins.spongecell.net/view/QA - Full Regression/api/json?tree=jobs[name,color,builds[id,fullDisplayName,result,url,timestamp,duration,actions[failCount,totalCount]]]";
		ResponseEntity<JenkinsReportModel> report = getJobsInformation(url);
		List<JobModel> models = report.getBody().getJobs();
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<Job> jobs = JobMapper.jsonModelToEntity(models);
			log.info("API Response{}", mapper.writeValueAsString(jobs));
			service.saveAll(jobs);
			log.info("First completed");
			buildService.saveAllBuilds(jobs);
			log.info("Save completed");
			Iterable<Job> response = service.getAll();			

			String jsonResponse = mapper.writeValueAsString(response);
			return jsonResponse;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "Error";
	}

	private ResponseEntity<JenkinsReportModel> getJobsInformation(String url) {
		ResponseEntity<JenkinsReportModel> report = null;
		log.info("Getting jobs information");
		try {
			TimeUnit.SECONDS.sleep(3);
			HttpHeaders httpHeaders = createHeaders();
			report = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<Object>(httpHeaders),
					JenkinsReportModel.class);
		} catch (InterruptedException ex) {

		} catch (RestClientException ex) {
			return getJobsInformation(url);
		}
		log.info("Finished of getting jobs information");

		return report;
	}

	private HttpHeaders createHeaders() {
		HttpHeaders headers = new HttpHeaders() {
			{
				set("Authorization", "Basic aXBhY2hlY29jOmY4Y2EyOGY0MzYxYzMwZDA2NTAzODk1MDBhYzJjOTM5");
				set("Content-Type", "application/json");
				set("Accept", "application/json");
			}
		};

		return headers;
	}
}