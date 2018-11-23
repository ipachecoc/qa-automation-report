package com.flashtalking.reportmanager.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "build_report")
public class BuildReport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int total_tests;

	private int failed_tests;

	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String xml;

	@Column(insertable = false, updatable = false)
	private int build_id;
	
//	@OneToOne()
//	@JoinColumn(name = "build_id", referencedColumnName="id")	
//	private Build build;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalTests() {
		return total_tests;
	}

	public void setTotalTests(int totalTests) {
		this.total_tests = totalTests;
	}

	public int getFailedTests() {
		return failed_tests;
	}

	public void setFailedTests(int failedTests) {
		this.failed_tests = failedTests;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public int getBuildId() {
		return build_id;
	}

	public void setBuildId(int buildId) {
		this.build_id = buildId;
	}
}
