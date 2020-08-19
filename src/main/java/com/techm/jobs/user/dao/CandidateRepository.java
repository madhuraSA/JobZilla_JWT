package com.techm.jobs.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techm.jobs.user.model.Candidate;

public interface CandidateRepository  extends JpaRepository<Candidate, Integer>{

}
