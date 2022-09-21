package com.springbootjpa.datajpa.common;

public enum CategoryEnum {
	
	
	PREPAID(1001L,"Prepaid"),
	POSTPAID(1002L,"Postpaid"),
	DONGLE(1003L,"Dongle");
	
	private Long code;
	private String type;

	CategoryEnum(Long code, String type) {
		this.code=code;
		this.type=type;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
