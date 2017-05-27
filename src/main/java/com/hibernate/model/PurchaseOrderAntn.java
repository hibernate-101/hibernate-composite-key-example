package com.hibernate.model;

import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE_ORDERS")
public class PurchaseOrderAntn {

	@Column(name = "ITEMNAME")
	private String itemName;
	@EmbeddedId
	BillingAdressAntn billingAddress;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BillingAdressAntn getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAdressAntn billingAddress) {
		this.billingAddress = billingAddress;
	}

}
