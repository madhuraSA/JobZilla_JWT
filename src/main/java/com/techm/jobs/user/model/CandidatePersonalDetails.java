package com.techm.jobs.user.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate_personal_details")
public class CandidatePersonalDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer candidateId;
	private Date dob;
	private String address;
	private String passportId;
	private String gender;
	private String maritalStatus;
	private boolean workPermit;
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassportId() {
		return passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public boolean isWorkPermit() {
		return workPermit;
	}
	public void setWorkPermit(boolean workPermit) {
		this.workPermit = workPermit;
	}
	
	
	
}
