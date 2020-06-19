package com.example.userbankaccount.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.userbankaccount.model.AccountCommandModel;
import com.example.userbankaccount.model.Transaction_History;
import com.example.userbankaccount.model.UpdateDto;
import com.example.userbankaccount.repository.AccountCommandRepository;
import com.example.userbankaccount.repository.Transaction_repository;

@Service
public class AccountCommandService {

	@Autowired
	AccountCommandRepository repo;
	
	@Autowired
	Transaction_repository t_repo;
	
	public Optional<AccountCommandModel> getusercheck (String customerid,String accountid)
	{
		return repo.findByAccountidAndCustomerid(accountid, customerid);
	}
	
	public Iterable<AccountCommandModel> getallUsers()
	{
		return repo.findAll();
	}
	
	public Optional<AccountCommandModel> getuser(String accountid)
	{
		return repo.findById(accountid);
	}
   
	public void updatedetails(UpdateDto update, String accountid)
	{
		AccountCommandModel newone=repo.findById(accountid).orElseThrow(null);
		if((update.getRequest_type().compareTo("DEBIT"))==0)
		{
			newone.setAccountbalance(newone.getAccountbalance()-update.getAmount());
		    String dat=String.valueOf(new Date());
		    newone.setModifiedon(dat);
		    Transaction_History t=new Transaction_History(update.getTransaction_id(),dat);
		    repo.save(newone);
		    t_repo.save(t);
		}
	}
	
}
