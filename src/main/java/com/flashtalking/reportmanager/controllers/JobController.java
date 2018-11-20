package com.flashtalking.reportmanager.controllers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flashtalking.reportmanager.domain.Build;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.mappers.JobMapper;
import com.flashtalking.reportmanager.models.JenkinsReportModel;
import com.flashtalking.reportmanager.models.JobModel;
import com.flashtalking.reportmanager.services.BuildService;
import com.flashtalking.reportmanager.services.JobService;

@RestController
@RequestMapping("job")
public class JobController {	
	@Autowired
	private JobService service;
	
	@Autowired
	private BuildService buildService;


	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String index() {
		String response = "Error";
		try {
			Iterable<Job> jobs = service.getAll();
			ObjectMapper mapper = new ObjectMapper();

			response = mapper.writeValueAsString(jobs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return response;
	}	
	
	@RequestMapping(value = "/{id}/builds", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String builds(@PathVariable Long id) {
		String response = "Error";
		try {
			Job job = service.getById(id);
			Iterable<Build> builds = job.getBuilds();
			ObjectMapper mapper = new ObjectMapper();

			response = mapper.writeValueAsString(builds);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return response;
	}
}
