package com.example.userbankaccount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountCommandModel {
	
	@Id
	private String accountid;
	private String accounttype;
	private double  accountbalance;
	private String customerid;
	private String createdby;
	private String createdon;
	private String modifiedby;
	private String modifiedon;
	
	
	public AccountCommandModel() {
		
	}


	public AccountCommandModel(String accountid, String accounttype, double accountbalance, String customerid,
			String createdby, String createdon, String modifiedby, String modifiedon) {
		
		this.accountid = accountid;
		this.accounttype = accounttype;
		this.accountbalance = accountbalance;
		this.customerid = customerid;
		this.createdby = createdby;
		this.createdon = createdon;
		this.modifiedby = modifiedby;
		this.modifiedon = modifiedon;
	}


	public String getAccountid() {
		return accountid;
	}


	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}


	public String getAccounttype() {
		return accounttype;
	}


	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}


	public double getAccountbalance() {
		return accountbalance;
	}


	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}


	public String getCustomerid() {
		return customerid;
	}


	public void setCustomerid(String customerid) {
		this.customerid = customerid;
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


	public String getModifiedby() {
		return modifiedby;
	}


	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}


	public String getModifiedon() {
		return modifiedon;
	}


	public void setModifiedon(String modifiedon) {
		this.modifiedon = modifiedon;
	}


	
	
}
