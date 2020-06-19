package com.example.userbankaccount.model;

public class UpdateDto {
	
	
	private String request_type;
	private double amount;
	private String transaction_id;
	
	
	public UpdateDto() {
	
	}
	
	public UpdateDto(String request_type, double amount, String transaction_id) {

		this.request_type = request_type;
		this.amount = amount;
		this.transaction_id = transaction_id;
	}


	public String getRequest_type() {
		return request_type;
	}
	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	

}
