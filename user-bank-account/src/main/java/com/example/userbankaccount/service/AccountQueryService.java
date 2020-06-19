package com.example.userbankaccount.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userbankaccount.model.AccountCommandModel;
import com.example.userbankaccount.model.AccountQueryModel;
import com.example.userbankaccount.repository.AccountQueryRepository;

@Service
public class AccountQueryService {
	
	@Autowired
	AccountQueryRepository repo;
	
	public Optional<AccountQueryModel> getusercheck (String customerid,String accountid)
	{
		return repo.findByAccountidAndCustomerid(accountid, customerid);
	}
	
	public Iterable<AccountQueryModel> getallUsers()
	{
		return repo.findAll();
	}

}
