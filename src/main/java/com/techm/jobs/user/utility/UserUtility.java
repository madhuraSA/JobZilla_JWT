package com.techm.jobs.user.utility;

import com.techm.jobs.user.model.User;

public class UserUtility {

	public static void updateExistingUser(User exixtingUser, User userUpdate) {
		// TODO Auto-generated method stub
		if(userUpdate.getUserName() != null)
		{
			exixtingUser.setUserName(userUpdate.getUserName());	
		}
		if(userUpdate.getPassword() != null)
		{
			exixtingUser.setPassword(userUpdate.getPassword());	
		}
		if(userUpdate.getUserRole() != null)
		{
			exixtingUser.setUserRole(userUpdate.getUserRole());	
		}
		if(userUpdate.getOrgnaizationId() != null)
		{
			exixtingUser.setOrgnaizationId(userUpdate.getOrgnaizationId());	
		}
		
		
	}

}
