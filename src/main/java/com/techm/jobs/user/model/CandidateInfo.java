package com.techm.jobs.user.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CandidateInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer candidateId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;
	private String about;
	private float currentCTC;
	private float expectedCTC;
	private Blob candidateImage;
	private CandidateSkills candidateSkills;
	private CandidateEmploymentDetails candidateEmploymentDetails;
	private CandidateLanguages candidateLanguages;
	private CandidateEducationDetails candidateEducationDetails;
	private CandidatePersonalDetails candidatePersonalDetails;
	private CandidateDesiredCareerProfile candidateDesiredCareerProfile;
	
	
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public float getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(float currentCTC) {
		this.currentCTC = currentCTC;
	}
	public float getExpectedCTC() {
		return expectedCTC;
	}
	public void setExpectedCTC(float expectedCTC) {
		this.expectedCTC = expectedCTC;
	}
	public Blob getCandidateImage() {
		return candidateImage;
	}
	public void setCandidateImage(Blob candidateImage) {
		this.candidateImage = candidateImage;
	}
	public CandidateSkills getCandidateSkills() {
		return candidateSkills;
	}
	public void setCandidateSkills(CandidateSkills candidateSkills) {
		this.candidateSkills = candidateSkills;
	}
	public CandidateEmploymentDetails getCandidateEmploymentDetails() {
		return candidateEmploymentDetails;
	}
	public void setCandidateEmploymentDetails(CandidateEmploymentDetails candidateEmploymentDetails) {
		this.candidateEmploymentDetails = candidateEmploymentDetails;
	}
	public CandidateLanguages getCandidateLanguages() {
		return candidateLanguages;
	}
	public void setCandidateLanguages(CandidateLanguages candidateLanguages) {
		this.candidateLanguages = candidateLanguages;
	}
	public CandidateEducationDetails getCandidateEducationDetails() {
		return candidateEducationDetails;
	}
	public void setCandidateEducationDetails(CandidateEducationDetails candidateEducationDetails) {
		this.candidateEducationDetails = candidateEducationDetails;
	}
	public CandidatePersonalDetails getCandidatePersonalDetails() {
		return candidatePersonalDetails;
	}
	public void setCandidatePersonalDetails(CandidatePersonalDetails candidatePersonalDetails) {
		this.candidatePersonalDetails = candidatePersonalDetails;
	}
	public CandidateDesiredCareerProfile getCandidateDesiredCareerProfile() {
		return candidateDesiredCareerProfile;
	}
	public void setCandidateDesiredCareerProfile(CandidateDesiredCareerProfile candidateDesiredCareerProfile) {
		this.candidateDesiredCareerProfile = candidateDesiredCareerProfile;
	}
	
	
	
	
	
}
