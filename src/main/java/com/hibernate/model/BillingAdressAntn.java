package com.hibernate.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BillingAdressAntn implements Serializable{
	private String street;
	private String city;

	public BillingAdressAntn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillingAdressAntn(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
