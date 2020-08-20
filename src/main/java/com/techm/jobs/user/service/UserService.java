package com.techm.jobs.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.ResponseModel;
import com.techm.jobs.user.model.User;

public interface UserService {

	public ResponseEntity<ResponseModel> addUser(User user);
	public ResponseEntity<ResponseModel> getUserById(Integer id);
	public ResponseEntity<ResponseModel> updateUser(User user);
	public ResponseEntity<ResponseModel> deleteUserById(Integer userId);
	public ResponseEntity<ResponseModel> deleteMultipleUsersById(List<Integer> userIds);
	public ResponseEntity<ResponseModel> getUsers();
	public ResponseEntity<ResponseModel> searchUser(String searchParameter);
	public ResponseEntity<ResponseModel> addOrganization(Organization org);
	public ResponseEntity<ResponseModel> getOrganizations();
	public ResponseEntity<ResponseModel> login(String userName, String password);
	
}
