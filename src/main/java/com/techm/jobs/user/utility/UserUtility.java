package com.techm.jobs.user.utility;

import com.techm.jobs.user.model.User;

public class UserUtility {

	public static void updateExistingUser(User existingUser, User userUpdate) {
		// TODO Auto-generated method stub
		if(userUpdate.getUserName() != null)
		{
			existingUser.setUserName(userUpdate.getUserName());	
		}
		if(userUpdate.getPassword() != null)
		{
			existingUser.setPassword(userUpdate.getPassword());	
		}
		if(userUpdate.getUserRole() != null)
		{
			existingUser.setUserRole(userUpdate.getUserRole());	
		}
		if(userUpdate.getEmail() != null)
		{
			existingUser.setEmail(userUpdate.getEmail());
		}
		if(userUpdate.getContactNumber() != null)
		{
			existingUser.setContactNumber(userUpdate.getContactNumber());
		}
		if(userUpdate.getOrgnaizationId() != null)
		{
			existingUser.setOrgnaizationId(userUpdate.getOrgnaizationId());	
		}
		if(userUpdate.getSupervisorId() != null)
		{
			existingUser.setSupervisorId(userUpdate.getSupervisorId());	
		}
		
	}

}
