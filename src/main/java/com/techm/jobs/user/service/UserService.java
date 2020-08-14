package com.techm.jobs.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.ResponseModel;
import com.techm.jobs.user.model.User;

public interface UserService {

	public void addUser(User user);
	public ResponseEntity<ResponseModel> addOrganization(Organization org);
	public ResponseEntity<ResponseModel> getOrganizations();
	public List<User> getUsers();
	public ResponseEntity<ResponseModel> login(String userName, String password);
	
}
