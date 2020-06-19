package com.example.creditcardbillpayment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	
	@Id
	private String transaction_id;
	private String accountid;
	private String customerid;
	private String card_no;
	private double amount;
	private String createdby;
	private String createdon;
	private String transaction_status;
	
	public Transaction() {
	}
	
	
	public Transaction(String transaction_id, String accountid, String customerid, String card_no, double amount,
			String createdby, String createdon, String transaction_status) {
		
		this.transaction_id = transaction_id;
		this.accountid = accountid;
		this.customerid = customerid;
		this.card_no = card_no;
		this.amount = amount;
		this.createdby = createdby;
		this.createdon = createdon;
		this.transaction_status = transaction_status;
	}
	
	
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getCreatedon() {
		return createdon;
	}
	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}
	public String getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(String transaction_status) {
		this.transaction_status = transaction_status;
	}
	
	
	

}
