package com.techm.jobs.user.service;

import java.util.List;

import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.User;

public interface UserService {

	public void addUser(User user);
	public void addOrganization(Organization org);
	public List<Organization> getOrganizations();
	public List<User> getUsers();
	public String login(String userName, String password);
	
}
