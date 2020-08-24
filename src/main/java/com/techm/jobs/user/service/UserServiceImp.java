package com.techm.jobs.user.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techm.jobs.user.dao.OrganizationRepository;
import com.techm.jobs.user.dao.UserRepository;
import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.ResponseModel;
import com.techm.jobs.user.model.User;
import com.techm.jobs.user.utility.UserUtility;

@Service

public class UserServiceImp implements UserService{
	@Autowired
	 private UserRepository userRepo;
	
	@Autowired
	 private OrganizationRepository organizationRepo;

	public ResponseEntity<ResponseModel> addUser(User user) {
		ResponseModel response = new ResponseModel(); 
		User addedUser = userRepo.save(user);
		if(addedUser.getId() != null){
			new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
		}
		response.setResponseCode(HttpStatus.OK.toString());
		response.setResponseDescription("User Added Successfully");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);	
	}
	
	public ResponseEntity<ResponseModel> getUserById(Integer id) {
		// TODO Auto-generated method stub
		ResponseModel response = new ResponseModel();
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()){
		//if(user.get().getId() != null){
			response.setResponseCode(HttpStatus.OK.toString());
			response.setResponseObject(user);
			return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);	
		}
		response = new ResponseModel(HttpStatus.PRECONDITION_FAILED.toString(), "Please insert valide user id , User details not found");
		//return new ResponseEntity<ResponseModel>(response, HttpStatus.PRECONDITION_FAILED);
		return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
	}
	
	public ResponseEntity<ResponseModel> updateUser(User user) {
		// TODO Auto-generated method stub
		ResponseModel response = new ResponseModel();
		Optional<User> userForUpdate = null;
		if(user.getId()!= null){
			userForUpdate = userRepo.findById(user.getId());
			if(userForUpdate.get().getId() != null){
				UserUtility.updateExistingUser(userForUpdate.get() , user);
				User updatedUser =  userRepo.save(userForUpdate.get());
				response = new ResponseModel(HttpStatus.OK.toString(), "User updated", updatedUser);
				return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);	
			}
		}
		response = new ResponseModel(HttpStatus.PRECONDITION_FAILED.toString(), "Please insert valide user id , User details not found");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.PRECONDITION_FAILED);
	}
	
	public ResponseEntity<ResponseModel> deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		ResponseModel response = new ResponseModel();
		try{
		if(userId != null){
		userRepo.deleteById(userId);
		response = new ResponseModel(HttpStatus.OK.toString(), "User Deleted");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
		}
		}catch(Exception e){
			
		}
		response.setResponseCode(HttpStatus.NO_CONTENT.toString());
		response.setResponseDescription("Please provide valide user id");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
	}

	public ResponseEntity<ResponseModel> deleteMultipleUsersById(List<Integer> userIds) {
		// TODO Auto-generated method stub
		ResponseModel response = new ResponseModel();
		
		if (userIds.isEmpty()) {
			response.setResponseCode(HttpStatus.NO_CONTENT.toString());
			response.setResponseDescription("Please provide valide list of ids");
			return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
		}
		userRepo.deleteMultipleUsersById(userIds);
		response = new ResponseModel(HttpStatus.OK.toString(), "Users Deleted");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseModel> getUsers() {
		ResponseModel response = new ResponseModel();
		List<User> allusers = (List<User>)userRepo.findAll();
		if (allusers.isEmpty()) {
			response.setResponseCode(HttpStatus.NO_CONTENT.toString());
			response.setResponseDescription("User Details not present");
			return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
		}
		response.setResponseCode(HttpStatus.OK.toString());
		response.setResponseObject(allusers);
		return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseModel> addOrganization(Organization org) {
		ResponseModel response = new ResponseModel(); 
		Organization organization = organizationRepo.save(org);
		User user = new User();
		user.setUserName(org.getEmail());
		user.setPassword(org.getPassword());
		user.setUserRole("Owner");
		user.setOrgnaizationId(organization.getId());
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

	public ResponseEntity<ResponseModel> searchUser(String searchParameter) {
		// TODO Auto-generated method stub
		ResponseModel response = new ResponseModel();
		if(searchParameter != null || !searchParameter.equals("") ){
			List<User> searchList =userRepo.searchUser(searchParameter);
			if(!searchList.isEmpty()){
			response.setResponseCode(HttpStatus.OK.toString());
			response.setResponseObject(searchList);
			return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
			}
			response.setResponseCode(HttpStatus.NO_CONTENT.toString());
			response.setResponseDescription("No one matching record found");
			return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
		}
		response.setResponseCode(HttpStatus.NO_CONTENT.toString());
		response.setResponseDescription("Please insert valide input");
		return new ResponseEntity<ResponseModel>(response, HttpStatus.NO_CONTENT);
	}
	
}
