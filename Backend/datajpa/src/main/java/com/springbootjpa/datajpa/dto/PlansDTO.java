package com.springbootjpa.datajpa.dto;

import java.io.Serializable;

import com.springbootjpa.datajpa.dto.common.ResponseEntity;

public class PlansDTO  implements ResponseEntity, Serializable{

	private static final long serialVersionUID = 3182889116010444832L;
	private Long planId;
	private String validity;
	private Long categoryId;
	private double price;
	private String smsOffers;
	private String commonOffers;
	private String istOffers;
	private String dataOffers;
	private String categoryName;
	
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCommonOffers() {
		return commonOffers;
	}
	public void setCommonOffers(String commonOffers) {
		this.commonOffers = commonOffers;
	}
	public String getIstOffers() {
		return istOffers;
	}
	public void setIstOffers(String istOffers) {
		this.istOffers = istOffers;
	}
	public String getDataOffers() {
		return dataOffers;
	}
	public void setDataOffers(String dataOffers) {
		this.dataOffers = dataOffers;
	}
	public String getSmsOffers() {
		return smsOffers;
	}
	public void setSmsOffers(String smsOffers) {
		this.smsOffers = smsOffers;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

}
