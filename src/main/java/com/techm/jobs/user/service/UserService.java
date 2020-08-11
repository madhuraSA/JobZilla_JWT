package com.techm.jobs.user.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.jobs.user.dao.OrganizationRepository;
import com.techm.jobs.user.dao.UserRepository;
import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.User;

@Service

public class UserService {
	@Autowired
	 private UserRepository userRepo;
	
	@Autowired
	 private OrganizationRepository organizationRepo;

	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public void addOrganization(Organization org) {
		organizationRepo.save(org);
	}
	public List<Organization> getOrganizations() {
		return organizationRepo.findAll();
	}
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	public String login(String userName, String password) {
		// TODO Auto-generated method stub
		User user=userRepo.findByUserName(userName);
		if(user!=null)
			return user.getUserRole();
		else {
			Organization organization=organizationRepo.findByEmail(userName);
			if(organization!=null)
				return "Owner";
			else
				return null;
		}
	}
}
