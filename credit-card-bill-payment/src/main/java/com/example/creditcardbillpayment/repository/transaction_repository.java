package com.example.creditcardbillpayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.creditcardbillpayment.model.Transaction;


public interface transaction_repository extends JpaRepository<Transaction,String> {
	
}
