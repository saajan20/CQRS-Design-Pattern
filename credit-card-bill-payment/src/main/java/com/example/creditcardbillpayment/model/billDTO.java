package com.example.creditcardbillpayment.model;

public class billDTO {
	
	private String customer_id;
	private String account_id;
	private double amount;
	private String card_no;
	
	
	
	
	public billDTO() {
		
	}




	public billDTO(String customer_id, String account_id, double amount, String card_no) {
		
		this.customer_id = customer_id;
		this.account_id = account_id;
		this.amount = amount;
		this.card_no = card_no;
	}




	public String getCustomer_id() {
		return customer_id;
	}




	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}




	public String getAccount_id() {
		return account_id;
	}




	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}




	public double getAmount() {
		return amount;
	}




	public void setAmount(double amount) {
		this.amount = amount;
	}




	public String getCard_no() {
		return card_no;
	}




	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	


}
