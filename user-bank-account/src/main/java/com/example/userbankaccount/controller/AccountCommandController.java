package com.example.userbankaccount.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userbankaccount.model.AccountCommandModel;
import com.example.userbankaccount.model.UpdateDto;
import com.example.userbankaccount.service.AccountCommandService;

@RestController
public class AccountCommandController {

	@Autowired
	AccountCommandService serve;
	
	@GetMapping("/customers/{customerid}/accounts/{accountid}")
	public Optional<AccountCommandModel> getuser (@PathVariable String customerid,@PathVariable String accountid) {
	
		return serve.getusercheck(customerid, accountid);
	}
	 
	@GetMapping("/")
	public Iterable<AccountCommandModel> getallUsers()
	{
		return serve.getallUsers();
	}
	
	@PutMapping("/accounts/{accountid}")
	public void Updateuser(@RequestBody UpdateDto update,@PathVariable String accountid)
	{
		System.out.println(update.getAmount()+" "+update.getRequest_type()+" "+update.getTransaction_id());
		serve.updatedetails(update, accountid);          		
	}
	
	
	
}
