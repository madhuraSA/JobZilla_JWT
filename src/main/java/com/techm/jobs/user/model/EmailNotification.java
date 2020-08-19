package com.techm.jobs.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="email_notification")
public class EmailNotification {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer notificationId;
	private boolean allowNotification = true;
	private boolean successfulJobPost = true;
	private boolean newApplicationOnPostedJobs = true;
	private boolean interviewAcceptedDeclined = true;
	private boolean offerAcceptedDeclined = true;
	private boolean newMatchesAlert = true;
	public Integer getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}
	public boolean isAllowNotification() {
		return allowNotification;
	}
	public void setAllowNotification(boolean allowNotification) {
		this.allowNotification = allowNotification;
	}
	public boolean isSuccessfulJobPost() {
		return successfulJobPost;
	}
	public void setSuccessfulJobPost(boolean successfulJobPost) {
		this.successfulJobPost = successfulJobPost;
	}
	public boolean isNewApplicationOnPostedJobs() {
		return newApplicationOnPostedJobs;
	}
	public void setNewApplicationOnPostedJobs(boolean newApplicationOnPostedJobs) {
		this.newApplicationOnPostedJobs = newApplicationOnPostedJobs;
	}
	public boolean isInterviewAcceptedDeclined() {
		return interviewAcceptedDeclined;
	}
	public void setInterviewAcceptedDeclined(boolean interviewAcceptedDeclined) {
		this.interviewAcceptedDeclined = interviewAcceptedDeclined;
	}
	public boolean isOfferAcceptedDeclined() {
		return offerAcceptedDeclined;
	}
	public void setOfferAcceptedDeclined(boolean offerAcceptedDeclined) {
		this.offerAcceptedDeclined = offerAcceptedDeclined;
	}
	public boolean isNewMatchesAlert() {
		return newMatchesAlert;
	}
	public void setNewMatchesAlert(boolean newMatchesAlert) {
		this.newMatchesAlert = newMatchesAlert;
	}
	
	
}
