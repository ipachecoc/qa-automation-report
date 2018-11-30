package com.flashtalking.reportmanager.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flashtalking.reportmanager.domain.Build;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.services.BuildService;
import com.flashtalking.reportmanager.services.JobService;

@RestController
@RequestMapping("job")
public class JobController {
	@Autowired
	private JobService service;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String index() {
		String response = "Error";
		try {
			Iterable<Job> jobs = service.getAll();
			jobs.forEach(job -> job.setBuilds(sortedIterator(job.getBuilds())));
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
			builds = sortedIterator(builds);
			ObjectMapper mapper = new ObjectMapper();

			response = mapper.writeValueAsString(builds);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return response;
	}

	private List<Build> sortedIterator(Iterable<Build> it) {
		List<Build> list = new ArrayList<Build>();
		it.forEach(list::add);

		Collections.sort(list, new Comparator<Build>() {
			@Override
			public int compare(Build b1, Build b2) {

				return b2.getName().compareToIgnoreCase(b1.getName());
			}
		});
		
		return list;
	}
}
