package com.techm.jobs.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techm.jobs.user.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUserName(String userName);
	
	

}
