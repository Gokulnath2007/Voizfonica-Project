package com.springbootjpa.datajpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_login_session")
public class UserLoginSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "session_id")
	private String sessionId;

	@Column(name = "ip_address")
	private String ipAddress;

	@Column(name = "login_time_stamp")
	private LocalDateTime loginTimeStamp;

	@Column(name = "last_api_call")
	private LocalDateTime lastApiCall;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public LocalDateTime getLoginTimeStamp() {
		return loginTimeStamp;
	}

	public void setLoginTimeStamp(LocalDateTime loginTimeStamp) {
		this.loginTimeStamp = loginTimeStamp;
	}

	public LocalDateTime getLastApiCall() {
		return lastApiCall;
	}

	public void setLastApiCall(LocalDateTime lastApiCall) {
		this.lastApiCall = lastApiCall;
	}

}
