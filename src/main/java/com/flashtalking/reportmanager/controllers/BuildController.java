package com.flashtalking.reportmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.services.BuildService;
import com.flashtalking.reportmanager.services.JobService;

@RestController
@RequestMapping("job/{id}")
public class BuildController {
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
}
