package com.techm.jobs.user.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techm.jobs.user.dao.OrganizationRepository;
import com.techm.jobs.user.dao.UserRepository;
import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.ResponseModel;
import com.techm.jobs.user.model.User;

@Service

public class UserServiceImp implements UserService{
	@Autowired
	 private UserRepository userRepo;
	
	@Autowired
	 private OrganizationRepository organizationRepo;

	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public List<User> getUsers() {
		return userRepo.findAll();
	}
	
	public ResponseEntity<ResponseModel> addOrganization(Organization org) {
		ResponseModel response = new ResponseModel(); 
		Organization organization = organizationRepo.save(org);
		User user = new User();
		user.setUserName(org.getEmail());
		user.setPassword(org.getPassword());
		user.setUserRole("Owner");
		user.setOrgnaizationInd("Yes");
		userRepo.save(user);
		
		if(organization.getId() != null){
			new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
		}
		response.setResponseCode(HttpStatus.OK.toString());
		response.setResponseDescription("Signup Success");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
	}
		
	public ResponseEntity<ResponseModel> getOrganizations() {
		ResponseModel response = new ResponseModel();
		List<Organization> allOrganization = (List<Organization>)organizationRepo.findAll();
		if (allOrganization.isEmpty()) {
			response.setResponseCode(HttpStatus.NO_CONTENT.toString());
			response.setResponseDescription("Organization Details not present");
			return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
		}
		response.setResponseCode(HttpStatus.OK.toString());
		response.setResponseObject(allOrganization);
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
	}

	public ResponseEntity<ResponseModel> login(String userName, String password) {
		// TODO Auto-generated method stub
		ResponseModel response = new ResponseModel();
		User user=userRepo.findByUserName(userName);
		if(user!=null){
			response.setResponseCode(HttpStatus.OK.toString());
			response.setResponseDescription("Login Success");
			response.setResponseObject(user);
			return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
		}
		else {
			Organization organization=organizationRepo.findByEmail(userName);
			if(organization!=null){
			response.setResponseCode(HttpStatus.OK.toString());
			response.setResponseDescription("Login Success");
			response.setResponseObject("Owner");
			return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
			}
			else
			response.setResponseCode(HttpStatus.UNAUTHORIZED.toString());
			response.setResponseDescription("User not found, Please enter valide userName and Password");
			return new ResponseEntity<ResponseModel>(response, HttpStatus.UNAUTHORIZED);
		}
	}
}
