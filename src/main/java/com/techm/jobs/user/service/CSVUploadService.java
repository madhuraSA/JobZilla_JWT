package com.techm.jobs.user.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.techm.jobs.user.dao.CandidateRepository;
import com.techm.jobs.user.model.Candidate;
import com.techm.jobs.user.utility.CsvUtils;

@Service
public class CSVUploadService {

	@Autowired
	CandidateRepository candidateRepository;
	
	// It will Store Data to Database
	public void store(MultipartFile file){
		try {
			List<Candidate> candidates = CsvUtils.parseCsvFile(file.getInputStream());
    		// Save Candidates to DataBase 
    		candidateRepository.saveAll(candidates);
        } catch (IOException e) {
        	throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }
	
	}
	
	// Return All candidates from Database
	public List<Candidate> getAllCandidates() {
	    return candidateRepository.findAll();
	  }
}
