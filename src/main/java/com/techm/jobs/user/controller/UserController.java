package com.techm.jobs.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techm.jobs.user.model.Organization;
import com.techm.jobs.user.model.User;
import com.techm.jobs.user.service.UserServiceImp;

@RestController
@RequestMapping(value = "/user")
public class UserController{
	
@Autowired
UserServiceImp userServiceImp;

@RequestMapping(value = "/signup", method = RequestMethod.POST)
public void addOrganizationDetails (@RequestBody Organization organization){
	
	
	userServiceImp.addOrganization(organization); 
	//return "Organization : "+org.getOrganizationName()+" has been added";
}

@RequestMapping(value = "/organization", method = RequestMethod.GET)
@ResponseBody
public List<Organization> getAllOrganization(){	 
	return userServiceImp.getOrganizations(); 
}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.POST)
public void addUser (@RequestBody User user){
	userServiceImp.addUser(user);
	
	}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.GET)
public List<User> getAllUser(){	 
	return userServiceImp.getUsers(); 
}

@ResponseBody
@RequestMapping(value = "/login", method = RequestMethod.PUT)
public String login(@RequestParam String userName, @RequestParam String password){	 
	return userServiceImp.login(userName, password); 
}
}
