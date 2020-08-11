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
import com.techm.jobs.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController{
	
@Autowired
UserService userService;

@RequestMapping(value = "/signup", method = RequestMethod.POST)
public void addOrganizationDetails (@RequestBody Organization organization){
	
	
	userService.addOrganization(organization); 
	//return "Organization : "+org.getOrganizationName()+" has been added";
}

@RequestMapping(value = "/organization", method = RequestMethod.GET)
@ResponseBody
public List<Organization> getAllOrganization(){	 
	return userService.getOrganizations(); 
}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.POST)
public void addUser (@RequestBody User user){
		userService.addUser(user);
	
	}

@ResponseBody
@RequestMapping(value = "/user", method = RequestMethod.GET)
public List<User> getAllUser(){	 
	return userService.getUsers(); 
}

@ResponseBody
@RequestMapping(value = "/login", method = RequestMethod.PUT)
public String login(@RequestParam String userName, @RequestParam String password){	 
	return userService.login(userName, password); 
}
}
