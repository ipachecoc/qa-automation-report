package com.flashtalking.reportmanager.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flashtalking.reportmanager.domain.Build;
import com.flashtalking.reportmanager.domain.BuildReport;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.repositories.BuildRepository;
import com.flashtalking.reportmanager.repositories.JobRepository;

@Service
public class BuildService {
	private final BuildRepository repository;
	private final JobRepository jobRepository;
	
	@Autowired
	public BuildService(BuildRepository repository, JobRepository jobRepository) {
		this.repository = repository;
		this.jobRepository = jobRepository;
	}
	
	public Iterable<Build> getAll() {
		Iterable<Build> builds = repository.findAll();

		return builds;
	}
	
	public Iterable<Build> find() {
		Iterable<Build> builds = repository.findAll();

		return builds;
	}

	public Build save(Build build) {		
		Build response = repository.save(build);

		return response;
	}
	
	public Iterable<Build> saveAllBuilds(List<Job> jobs) {
		try {			
			List<Build> builds = new ArrayList<>();	
			Iterable<Job> allJobs = jobRepository.findAll();
			List<Job> listOfJobs = new ArrayList<>();
			allJobs.forEach(listOfJobs::add);
			for (Job requestJob : jobs) {				
				Job job = listOfJobs.stream()
					.filter(j -> requestJob.getName().equalsIgnoreCase(j.getName()))
					.findAny().get();				
				if(job.getBuilds()!= null && job.getBuilds().size() > 0) {						
					for (Build build : requestJob.getBuilds()) {					
						Build tempBuild = job.getBuilds().stream()
								.filter(b -> build.getName().equalsIgnoreCase(b.getName()))
								.findAny().orElse(null);	
						if(tempBuild == null) {
//							BuildReport buildReport = build.getBuildReport();
//							buildReport.setBuildId(build.getId());
//							buildReport.setBuild(build);						
							build.setJobId(job.getId());
							build.setJob(job);
							builds.add(build);	
						}
					}
					
				}else {					
					for (Build build : requestJob.getBuilds()) {						
						build.setJobId(job.getId());
						build.setJobId(job.getId());
						builds.add(build);
					}					
				}
			}			
			Iterable<Build> response = saveAll(builds);

			return response;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


	public Iterable<Build> saveAll(List<Build> builds) {
		Iterable<Build> allBuilds = repository.findAll();
		List<Build> listOfBuilds = new ArrayList<>();
		allBuilds.forEach(listOfBuilds::add);
		for (Build build : builds) {
			updateOrSave(listOfBuilds, build);
		}	
		Iterable<Build> response = repository.saveAll(listOfBuilds);

		return response;
	}

	private void updateOrSave(List<Build> builds, Build buildToUpdateOrSave) {
		boolean isNewBuild = true;
		for (Build build : builds) {			
			if (build.getName().equalsIgnoreCase(buildToUpdateOrSave.getName())) {				
				build.setDate(buildToUpdateOrSave.getDate());
				build.setDuration(buildToUpdateOrSave.getDuration());
				build.setResult(buildToUpdateOrSave.getResult());
				build.setJobId(buildToUpdateOrSave.getJobId());
//				build.setBuildReport(build.getBuildReport());				
				isNewBuild = false;
			}
		}
				
		builds.add(buildToUpdateOrSave);
		
	}
}
