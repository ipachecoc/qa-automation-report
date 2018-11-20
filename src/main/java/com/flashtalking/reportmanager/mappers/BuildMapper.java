package com.flashtalking.reportmanager.mappers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.flashtalking.reportmanager.domain.Build;
import com.flashtalking.reportmanager.domain.BuildReport;
import com.flashtalking.reportmanager.models.ActionModel;
import com.flashtalking.reportmanager.models.BuildModel;

public class BuildMapper {
	public static List<Build> jsonModelToEntity(List<BuildModel> models) {
		List<Build> entities = new ArrayList<>();
		for (BuildModel build : models) {
			Build entity = jsonModelToEntity(build);
			entities.add(entity);
		}

		return entities;
	}

	public static Build jsonModelToEntity(BuildModel model) {
		BuildReport buildReport = MapBuildReport(model.getActions());
		String result = model.getResult()!=null ? model.getResult() : "NONE";
		Build entity = new Build();
		//entity.setId(model.getId());
		entity.setName(model.getFullDisplayName());
		entity.setUrl(model.getUrl());
		entity.setDate(new Date(model.getTimestamp()));
		entity.setDuration(model.getDuration());
		entity.setResult(ResultType.valueOf(result));
		entity.setBuildReport(buildReport);

		return entity;
	}

	private static BuildReport MapBuildReport(List<ActionModel> models) {
		ActionModel model = models.get(8);
		BuildReport buildReport = BuildReportMapper.jsonModelToEntity(model);

		return buildReport;
	}
}