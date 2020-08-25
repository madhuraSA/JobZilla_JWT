package com.techm.jobs.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.techm.jobs.user.dao.EmailnotificationRepository;
import com.techm.jobs.user.model.EmailNotification;
import com.techm.jobs.user.model.ResponseModel;

@Service
public class NotificationService {

	@Autowired
	private static EmailnotificationRepository emailnotificationRepo;

	public ResponseEntity<ResponseModel> updatecandidateId(EmailNotification emailNotification) {
		EmailNotification notificationData = emailnotificationRepo
				.findByCandidateId(emailNotification.getCandidateId());
		
		if (notificationData != null) {
			emailnotificationRepo.save(emailNotification);
			ResponseModel response = new ResponseModel();
			EmailNotification repObj = notificationData;
			response.setResponseObject(repObj);
			response.setResponseCode(HttpStatus.OK.toString());
			return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
		} else {

			ResponseModel response = new ResponseModel(HttpStatus.CREATED.toString(),
					"Candidate info created for  " + emailNotification.getCandidateId());
			emailnotificationRepo.save(emailNotification);

			return new ResponseEntity<ResponseModel>(response, HttpStatus.CREATED);
		}
	}

}
