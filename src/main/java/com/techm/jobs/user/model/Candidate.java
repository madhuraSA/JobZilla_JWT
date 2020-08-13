package com.techm.jobs.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "candidate")
public class Candidate {

	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  @Column(name = "firstname")
	  private String firstname;
	  
	  @Column(name = "address")
	  private String address;
	  
	  @Column(name = "lastname")
	  private String lastname;
	  
	 @Column(name="salary")
	  private String salary;
	  
	  @Column(name="emailid")
	  private String emailid;
	  
	  @Column(name="company")
	  private String company;
	  
	  @Column(name= "mobileno")
	  private String mobileNo;
	  
	  @Column(name= "currentrole")
	  private String currentRole;
	  
	  @Column(name= "skillset")
	  private String skillSet;

public Candidate() {}

	public Candidate(long id, String firstname, String address, String lastname, String salary, String emailid,
			String company, String mobileNo, String currentRole, String skillSet) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.address = address;
		this.lastname = lastname;
		this.salary = salary;
		this.emailid = emailid;
		this.company = company;
		this.mobileNo = mobileNo;
		this.currentRole = currentRole;
		this.skillSet = skillSet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	 

}
