package com.techm.jobs.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.techm.jobs.user.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{
	public Organization findByEmail(String email);
}
