package com.springbootjpa.datajpa.dto;

import java.io.Serializable;

import com.springbootjpa.datajpa.dto.common.ResponseEntity;

public class ComplaintsDTO implements ResponseEntity, Serializable {

	private static final long serialVersionUID = 3182889116010444832L;
	
	private Long id;
	private String fullName;
	private String mobileNo;
	private String subject;
	private String emailId;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
