package com.example.creditcardbillpayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.creditcardbillpayment.model.billDTO;
import com.example.creditcardbillpayment.repository.transaction_repository;

@Service
public class transaction_service {

	@Autowired
	transaction_repository repo;
	
	public String getpaymentDone(billDTO details) {
		
		
		
		
		return null;
		
	}
	
}
