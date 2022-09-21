package com.springbootjpa.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plans")
public class Plans {

	@Id
	private Long planId;

	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "price")
	private double price;
	
	@Column(name = "validity")
	private String validity;

	@Column(name = "sms_offers")
	private String smsOffers;
	

	@Column(name = "common_offers")
	private String commonOffers;

	@Column(name = "ist_offers")
	private String istOffers;

	@Column(name = "data_offers")
	private String dataOffers;

	
	
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

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	

}
