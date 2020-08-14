package com.techm.jobs.user.model;

import com.sun.istack.NotNull;

public class Email {

	
	@NotNull
	private String email;
	@NotNull
	private String name;
	@NotNull
	private String company;
	
	private String content;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
