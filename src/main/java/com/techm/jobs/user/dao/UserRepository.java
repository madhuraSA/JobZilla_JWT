package com.techm.jobs.user.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techm.jobs.user.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUserName(String userName);
	
	@Transactional
	@Modifying
	@Query("delete from User u where u.id in ?1")
	public void deleteMultipleUsersById(List<Integer> userIds);

	@Transactional
	@Modifying
	@Query("select u from User u where u.userName like %?1% or u.email like %?1% or u.contactNumber like %?1%") //or u.userRole like ?1%")
	public List<User> searchUser(String searchParameter);

	@Transactional
	@Modifying
	@Query("select u from User u where u.orgnaizationId = ?1") 
	public List<User> findAllUsersbyOrgnaizationId(Integer orgnaizationId);

	@Transactional
	@Modifying
	@Query("select u from User u where u.supervisorId = ?1 and u.orgnaizationId = ?2") 
	public List<User> findAllUsersbySupervisorIdAndOrganizationId(Integer supervisorId, Integer orgnaizationId);
}
