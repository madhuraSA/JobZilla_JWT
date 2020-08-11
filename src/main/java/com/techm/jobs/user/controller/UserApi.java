package com.techm.jobs.user.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//@Api(value = "/jobzilla/user")
public interface UserApi {
	
	/*@ApiOperation(value = "Add Organization", nickname = "signUp", notes = "", tags = {
			"SignUp", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 405, message = "Invalid input") })
	@RequestMapping(value = "/jobzilla/user/signup", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public String addOrganizationDetails(
			@ApiParam(value = "SignUp to add new organization details", required = true) @Valid @RequestBody Organization body);
	*/
}
