package com.flashtalking.reportmanager.mappers;

import java.util.ArrayList;
import java.util.List;

import com.flashtalking.reportmanager.domain.BuildReport;
import com.flashtalking.reportmanager.models.ActionModel;

public class BuildReportMapper {
	public static List<BuildReport> jsonModelToEntity(List<ActionModel> models) {
		List<BuildReport> entities = new ArrayList<>();
		for (ActionModel model : models) {
			BuildReport entity = jsonModelToEntity(model);			
			entities.add(entity);
		}

		return entities;
	}

	public static BuildReport jsonModelToEntity(ActionModel model) {
		BuildReport entity = new BuildReport();
		entity.setFailedTests(model.getFailCount());
		entity.setTotalTests(model.getTotalCount());

		return entity;
	}
}
