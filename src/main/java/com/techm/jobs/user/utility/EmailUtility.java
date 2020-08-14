package com.techm.jobs.user.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.techm.jobs.user.model.Email;
import com.techm.jobs.user.model.EmailConfiguration;

public class EmailUtility {
	@Autowired
	EmailConfiguration emailConfig;
	
	public void sendEmail (Email email) {
		
		
		//-- Create a mail sender
		
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(emailConfig.getHost());
		mailSender.setPort(emailConfig.getPort());
		mailSender.setUsername(emailConfig.getUsername());
		mailSender.setPassword(emailConfig.getPassword());
		
		
		//-- Create email instance
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("madhura123@gmail.com");
		mailMessage.setTo(email.getEmail());
		mailMessage.setSubject("New mail from " + email.getEmail());
		mailMessage.setText("Welcome to this amazing email application... :) " + " Hello... "+email.getName()+" !");
		
		//-- Send message
		mailSender.send(mailMessage);
	}
}
