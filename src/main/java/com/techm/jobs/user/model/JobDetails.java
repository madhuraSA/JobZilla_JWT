package com.techm.jobs.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_details")
public class JobDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer jobId;
	private String jobTitle;
	private String employmentType;
	private String category;
	private String primarySkills;
	private String secondarySkills;
	private float experienceReq;
	private int noOfPositionsAvailable;
	private float annualSalaryFrom;
	private float annualSalaryTo;
	private int expectedWorkinghrs;
	private boolean visaRequired;
	private boolean mustHavePasport = true;
	private String jobCountry;
	private String jobState;
	private String jobCity;
	private String jobDescription;
	private String responsibilities;
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrimarySkills() {
		return primarySkills;
	}
	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}
	public String getSecondarySkills() {
		return secondarySkills;
	}
	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}
	public float getExperienceReq() {
		return experienceReq;
	}
	public void setExperienceReq(float experienceReq) {
		this.experienceReq = experienceReq;
	}
	public int getNoOfPositionsAvailable() {
		return noOfPositionsAvailable;
	}
	public void setNoOfPositionsAvailable(int noOfPositionsAvailable) {
		this.noOfPositionsAvailable = noOfPositionsAvailable;
	}
	public float getAnnualSalaryFrom() {
		return annualSalaryFrom;
	}
	public void setAnnualSalaryFrom(float annualSalaryFrom) {
		this.annualSalaryFrom = annualSalaryFrom;
	}
	public float getAnnualSalaryTo() {
		return annualSalaryTo;
	}
	public void setAnnualSalaryTo(float annualSalaryTo) {
		this.annualSalaryTo = annualSalaryTo;
	}
	public int getExpectedWorkinghrs() {
		return expectedWorkinghrs;
	}
	public void setExpectedWorkinghrs(int expectedWorkinghrs) {
		this.expectedWorkinghrs = expectedWorkinghrs;
	}
	public boolean isVisaRequired() {
		return visaRequired;
	}
	public void setVisaRequired(boolean visaRequired) {
		this.visaRequired = visaRequired;
	}
	public boolean isMustHavePasport() {
		return mustHavePasport;
	}
	public void setMustHavePasport(boolean mustHavePasport) {
		this.mustHavePasport = mustHavePasport;
	}
	public String getJobCountry() {
		return jobCountry;
	}
	public void setJobCountry(String jobCountry) {
		this.jobCountry = jobCountry;
	}
	public String getJobState() {
		return jobState;
	}
	public void setJobState(String jobState) {
		this.jobState = jobState;
	}
	public String getJobCity() {
		return jobCity;
	}
	public void setJobCity(String jobCity) {
		this.jobCity = jobCity;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	
	
	
}
