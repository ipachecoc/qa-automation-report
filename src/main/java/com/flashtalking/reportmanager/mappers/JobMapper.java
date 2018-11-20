package com.flashtalking.reportmanager.mappers;

import java.util.ArrayList;
import java.util.List;

import com.flashtalking.reportmanager.domain.Build;
import com.flashtalking.reportmanager.domain.Job;
import com.flashtalking.reportmanager.models.BuildModel;
import com.flashtalking.reportmanager.models.JobModel;

public class JobMapper {

	public static List<Job> jsonModelToEntity(List<com.flashtalking.reportmanager.models.JobModel> models) {
		List<Job> entities = new ArrayList<>();
		for (com.flashtalking.reportmanager.models.JobModel job : models) {
			Job entity = jsonModelToEntity(job);
			entities.add(entity);
		}

		return entities;
	}

	public static Job jsonModelToEntity(JobModel model) {
		List<Build> builds = MapBuilds(model.getBuilds());
		Job entity = new Job();
		//entity.setId(model.getId());
		entity.setName(model.getName());
		entity.setColor(ColorType.valueOf(model.getColor()));
		entity.setActive(true);
		entity.setBuilds(builds);

		return entity;
	}

	private static List<Build> MapBuilds(List<BuildModel> models) {
		List<Build> builds = BuildMapper.jsonModelToEntity(models);

		return builds;
	}
}
