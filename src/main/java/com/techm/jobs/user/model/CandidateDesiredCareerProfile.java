package com.techm.jobs.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CandidateDesiredCareerProfile {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer candidateId;
	private String employmentType;
	private String preferredLoc;
	private String preferredShift;
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getPreferredLoc() {
		return preferredLoc;
	}
	public void setPreferredLoc(String preferredLoc) {
		this.preferredLoc = preferredLoc;
	}
	public String getPreferredShift() {
		return preferredShift;
	}
	public void setPreferredShift(String preferredShift) {
		this.preferredShift = preferredShift;
	}
	
	

}
