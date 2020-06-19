package com.example.userbankaccount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountQueryModel {
	
	@Id
	private String account_id;
	private String account_type;
	private double  account_balance;
	private String customer_id;
	private String created_by;
	private String created_on;
	private String modified_by;
	private String modified_on;
	
	
	

	public AccountQueryModel() {
		
	}


	public AccountQueryModel(String account_id, String account_type, double account_balance, String customer_id,
			String created_by, String created_on, String modified_by, String modified_on) {
		
		this.account_id = account_id;
		this.account_type = account_type;
		this.account_balance = account_balance;
		this.customer_id = customer_id;
		this.created_by = created_by;
		this.created_on = created_on;
		this.modified_by = modified_by;
		this.modified_on = modified_on;
	}


	public String getAccount_id() {
		return account_id;
	}


	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}


	public String getAccount_type() {
		return account_type;
	}


	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}


	public double getAccount_balance() {
		return account_balance;
	}


	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public String getCreated_by() {
		return created_by;
	}


	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}


	public String getCreated_on() {
		return created_on;
	}


	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}


	public String getModified_by() {
		return modified_by;
	}


	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}


	public String getModified_on() {
		return modified_on;
	}


	public void setModified_on(String modified_on) {
		this.modified_on = modified_on;
	}
	
	
	
}

