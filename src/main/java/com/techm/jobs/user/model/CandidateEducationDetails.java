package com.techm.jobs.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="candidate_education_details")
public class CandidateEducationDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer candidateId;
	private String degree;
	private String specialization;
	private String passingOutYear;
	private String university;
	private String courseType;
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getPassingOutYear() {
		return passingOutYear;
	}
	public void setPassingOutYear(String passingOutYear) {
		this.passingOutYear = passingOutYear;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	
	
	
}
