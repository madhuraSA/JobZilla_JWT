package com.techm.jobs.user.model;

public enum UserRolesEnum {

	OWNER("owner"), SUPER_ADMIN("super_admin"), ADMIN("admin"), OPERATIONS("operations"), CANDIDATE_ROLE("candidate_role");
	private String role;

	private UserRolesEnum(String role){
		this.role = role;
	}
	
}
