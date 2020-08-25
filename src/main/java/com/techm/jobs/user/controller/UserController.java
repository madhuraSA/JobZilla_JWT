package com.techm.jobs.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techm.jobs.user.model.Email;
import com.techm.jobs.user.model.EmailNotification;
import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.ResponseModel;
import com.techm.jobs.user.model.User;
import com.techm.jobs.user.service.NotificationService;
import com.techm.jobs.user.service.UserServiceImp;
import com.techm.jobs.user.utility.EmailUtility;

@RestController
@RequestMapping(value = "/user")
public class UserController{
	
@Autowired
UserServiceImp userServiceImp;

@Autowired
EmailUtility emailUtility;

@Autowired
NotificationService notificationService;

@RequestMapping(value = "/signup", method = RequestMethod.POST)
public ResponseEntity<ResponseModel> addOrganizationDetails (@RequestBody Organization organization){
	return  userServiceImp.addOrganization(organization); 
}

@RequestMapping(value = "/allorganizations", method = RequestMethod.GET)
@ResponseBody
public ResponseEntity<ResponseModel> getAllOrganization(){	 
	return userServiceImp.getOrganizations(); 
}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.POST)
public ResponseEntity<ResponseModel> addUser(@RequestBody User user){
	return userServiceImp.addUser(user);
}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.GET)
public ResponseEntity<ResponseModel> getUserById(@RequestParam Integer userId){
	return userServiceImp.getUserById(userId);
}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.PUT)
public ResponseEntity<ResponseModel> updateUser(@RequestBody User user){
	return userServiceImp.updateUser(user);
}

@ResponseBody
@RequestMapping(value = "/userById", method = RequestMethod.DELETE)
public ResponseEntity<ResponseModel> deleteUserById(@RequestParam Integer userId){
	return userServiceImp.deleteUserById(userId);
}

@ResponseBody
@RequestMapping(value = "/multipleUsersById", method = RequestMethod.DELETE)
public ResponseEntity<ResponseModel> deleteMultipleUsersById (@RequestBody List<Integer> userIds){
	return userServiceImp.deleteMultipleUsersById(userIds);
}

@ResponseBody
@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
public ResponseEntity<ResponseModel> getAllUser(){	 
	return userServiceImp.getUsers(); 
}

@ResponseBody
@RequestMapping(value = "/searchUser", method = RequestMethod.GET)
public ResponseEntity<ResponseModel> searchUser(@RequestParam String searchParameter){	 
	return userServiceImp.searchUser(searchParameter); 
}

@ResponseBody
@RequestMapping(value = "/login", method = RequestMethod.GET)
public ResponseEntity<ResponseModel> login(@RequestParam String userName, @RequestParam String password){	 
	return userServiceImp.login(userName, password); 
}

@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
public void sendEmail (@RequestBody Email email) {
	emailUtility.sendEmail(email);
	
}

@ResponseBody
@RequestMapping(value = "/notificationSetting", method = RequestMethod.POST)
public void notificationSetting (@RequestBody EmailNotification emailNotification) {
	notificationService.updatecandidateId(emailNotification);
}
}
