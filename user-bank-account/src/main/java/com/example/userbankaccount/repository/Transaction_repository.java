package com.example.userbankaccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userbankaccount.model.Transaction_History;

@Repository
public interface Transaction_repository extends JpaRepository<Transaction_History, String> {
	
	

}
