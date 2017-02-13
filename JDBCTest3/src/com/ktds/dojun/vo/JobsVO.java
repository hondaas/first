package com.ktds.dojun.vo;

import com.ktds.dojun.daosupport.annotation.Types;

public class JobsVO {
	
	@Types
	private String jobId;
	@Types
	private String jobTitle;
	@Types
	private int maxSalary;
	@Types
	private int minSalary;
	
	
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
	public int getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}
	

}
