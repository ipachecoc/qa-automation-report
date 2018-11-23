package com.flashtalking.reportmanager.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.flashtalking.reportmanager.mappers.ResultType;

@Entity
@Table(name = "builds")
public class Build {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	private String url;
		
	@Enumerated(EnumType.STRING)
	@Column(name = "result", columnDefinition = "enum('NONE', 'FAILURE','UNSTABLE','STABLE', 'SUCCESS')")
	private ResultType result;
	
	@Column(columnDefinition = "BIGINT")
	private long duration;
	
	private Date date;

//	@ManyToOne
//	private Job job;

	@Embedded
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)	
	@JoinColumn(referencedColumnName="build_id")
	private BuildReport build_report;

	@Column(insertable = false, updatable = false)
	private int job_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ResultType getResult() {
		return result;
	}

	public void setResult(ResultType result) {
		this.result = result;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getJobId() {
		return job_id;
	}

	public void setJobId(int jobId) {
		this.job_id = jobId;
	}

	public BuildReport getBuildReport() {
		return build_report;
	}

	public void setBuildReport(BuildReport buildReport) {
		this.build_report = buildReport;
	}

//	public Job getJob() {
//		return job;
//	}
//
//	public void setJob(Job job) {
//		this.job = job;
//	}	
}
