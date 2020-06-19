package com.example.userbankaccount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction_History {

	@Id
	private String transaction_id;
	private String date;
	
	
	public Transaction_History() {
	
	}

	public Transaction_History(String transaction_id, String date) {
		this.transaction_id = transaction_id;
		this.date = date;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
