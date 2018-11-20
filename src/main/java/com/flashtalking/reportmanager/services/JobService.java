package com.flashtalking.reportmanager.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flashtalking.reportmanager.domain.Build;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.repositories.BuildRepository;
import com.flashtalking.reportmanager.repositories.JobRepository;

@Service
public class JobService {	
	private JobRepository repository;	

	@Autowired
	public JobService(JobRepository repository) {
		this.repository = repository;				
	}

	public Iterable<Job> getAll() {
		Iterable<Job> jobs = repository.findAll();

		return jobs;
	}

	public Job getById(Long id) {
		Job job = repository.findById(id).get();

		return job;
	}
	
	public Job save(Job job) {		
		Job response = repository.save(job);

		return response;
	}

	public Iterable<Job> saveAll(List<Job> jobs) {
		Iterable<Job> allJobs = repository.findAll();
		List<Job> listOfJobs = new ArrayList<>();
		allJobs.forEach(listOfJobs::add);
		for (Job job : jobs) {
			updateOrSave(listOfJobs, job);
		}
		
		Iterable<Job> response = repository.saveAll(listOfJobs);
		

		return response;
	}

	private void updateOrSave(List<Job> jobs, Job jobToUpdate) {
		boolean isNewJob = true;
		for (Job job : jobs) {
			if (job.getName().equalsIgnoreCase(jobToUpdate.getName())) {
				job.setActive(jobToUpdate.isActive());
				job.setColor(jobToUpdate.getColor());				
				isNewJob = false;
				break;
			}
		}
		if (isNewJob) {			
			jobs.add(jobToUpdate);
		}
	}
}
