package com.techm.jobs.user.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="candidate_certificates")
public class CandidateCertificates {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer candidateId;
	private int certificationId;
	private String issueingOrg;
	private Date issueingDate;
	private Date exprirationDate;
	private String credentialId;
	private String credentialURL;
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public Integer getCertificationId() {
		return certificationId;
	}
	public void setCertificationId(Integer certificationId) {
		this.certificationId = certificationId;
	}
	public String getIssueingOrg() {
		return issueingOrg;
	}
	public void setIssueingOrg(String issueingOrg) {
		this.issueingOrg = issueingOrg;
	}
	public Date getIssueingDate() {
		return issueingDate;
	}
	public void setIssueingDate(Date issueingDate) {
		this.issueingDate = issueingDate;
	}
	public Date getExprirationDate() {
		return exprirationDate;
	}
	public void setExprirationDate(Date exprirationDate) {
		this.exprirationDate = exprirationDate;
	}
	public String getCredentialId() {
		return credentialId;
	}
	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}
	public String getCredentialURL() {
		return credentialURL;
	}
	public void setCredentialURL(String credentialURL) {
		this.credentialURL = credentialURL;
	}
	public CandidateCertificates() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
