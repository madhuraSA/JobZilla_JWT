package com.techm.jobs.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CandidateEmploymentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer candidateId;
	private String companyName;
	private String role;
	private float totalNoOfYears;
	private String description;
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getTotalNoOfYears() {
		return totalNoOfYears;
	}
	public void setTotalNoOfYears(float totalNoOfYears) {
		this.totalNoOfYears = totalNoOfYears;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
