package com.flashtalking.reportmanager.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "actions", "duration", "fullDisplayName", "id", "result", "timestamp", "url" })
public class BuildModel {

	@JsonProperty("actions")
	private List<ActionModel> actions;
	@JsonProperty("fullDisplayName")
	private String fullDisplayName;
	@JsonProperty("id")
	private int id;
	@JsonProperty("url")
	private String url;
	@JsonProperty("result")
	private String result;
	@JsonProperty("timestamp")
	private long timestamp;
	@JsonProperty("duration")
	private long duration; 
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("result")
	public String getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(String result) {
		this.result = result;
	}

	@JsonProperty("duration")
	public long getDuration() {
		return duration;
	}

	@JsonProperty("duration")
	public void setDuration(long duration) {
		this.duration = duration;
	}

	@JsonProperty("fullDisplayName")	
	public String getFullDisplayName() {
		return fullDisplayName;
	}

	@JsonProperty("fullDisplayName")
	public void setFullDisplayName(String fullDisplayName) {
		this.fullDisplayName = fullDisplayName;
	}

	@JsonProperty("timestamp")
	public long getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}	

	@JsonProperty("actions")
	public List<ActionModel> getActions() {
		return actions;
	}

	@JsonProperty("actions")
	public void setActions(List<ActionModel> actions) {
		this.actions = actions;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
}
