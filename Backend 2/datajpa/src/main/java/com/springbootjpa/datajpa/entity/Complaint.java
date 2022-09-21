package com.springbootjpa.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers_complaints")
public class Complaint {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
	@Column(name = "full_name")
    private String fullName;
	
	
	@Column(name = "mobile_no")
    private String mobileNo;
	
	@Column(name = "subject")
    private String subject;
	
	@Column(name = "email_id")
	private String emailId;
	
	
	@Column(name = "message")
    private String message;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
