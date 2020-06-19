package com.example.userbankaccount.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.userbankaccount.model.AccountCommandModel;
//import com.example.userbankaccount.model.AccountCommandModel;
import com.example.userbankaccount.model.AccountQueryModel;
import com.example.userbankaccount.repository.AccountQueryRepository;
//import com.example.userbankaccount.service.AccountCommandService;
import com.example.userbankaccount.service.AccountQueryService;

@RestController
public class AccountQueryController {

	@Autowired
	AccountQueryRepository repo;
	
	@Autowired
	AccountQueryService serve;
	
	@GetMapping("/customers/{customerid}/accounts_details/{accountid}")
	public Optional<AccountQueryModel> getuser (@PathVariable String customerid,@PathVariable String accountid) {
	
		return serve.getusercheck(customerid, accountid);
	}
	
	@KafkaListener(topics = "account")
	public void listen(AccountCommandModel message) {
		AccountQueryModel update = new AccountQueryModel(message.getAccountid(), message.getAccounttype(), message.getAccountbalance(), message.getCustomerid(), message.getCreatedby(), message.getCreatedon(), message.getModifiedby(), message.getModifiedon());
		repo.save(update);
	    System.out.println("Received Messasge in group foo: " + message);
	}
}
