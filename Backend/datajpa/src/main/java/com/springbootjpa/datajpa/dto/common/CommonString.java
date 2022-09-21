package com.springbootjpa.datajpa.dto.common;

public class CommonString implements ResponseEntity {

	private Long id;
	private String stringValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public CommonString() {
		
	}
	
	public CommonString(Long id, String stringValue) {
		this.id = id;
		this.stringValue = stringValue;
	}

	
}
