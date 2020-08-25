package com.techm.jobs.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techm.jobs.user.model.EmailNotification;

@Repository
public interface EmailnotificationRepository extends JpaRepository<EmailNotification, Integer>{

	public EmailNotification findByCandidateId(Integer candidateId);
}
