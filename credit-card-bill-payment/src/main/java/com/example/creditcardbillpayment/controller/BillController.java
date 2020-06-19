package com.example.creditcardbillpayment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.creditcardbillpayment.model.AccountCommandModel;
import com.example.creditcardbillpayment.model.UpdateDto;
import com.example.creditcardbillpayment.model.billDTO;
import com.example.creditcardbillpayment.repository.transaction_repository;
import com.example.creditcardbillpayment.service.transaction_service;

@RestController
public class BillController {
	
	@Autowired
	transaction_service serve;
	
	@Autowired
	transaction_repository repo;
	
	@Autowired
	private KafkaTemplate<String,AccountCommandModel> kafkaTemplate;
	
	RestTemplate rest = new RestTemplate();
	 
	@Value(value = "${initial.transactionid}")
	private String t;
	
	@GetMapping("/")
	public String billPayment() {
		
		 long size=repo.count();
		 long i=Long.parseLong(t.trim());
		 return String.valueOf(size+i);
	}
	
	@GetMapping("/bill-payment")
	public void payment() {
		
		UpdateDto data = new UpdateDto("DEBIT",6796.78, "102585");
		rest.put("http://localhost:8082/accounts/1837440", data);	
		AccountCommandModel update= rest.getForObject("http://localhost:8082/customers/100/accounts/1837440", AccountCommandModel.class);
		System.out.println(update);
		
		
		kafkaTemplate.send("account",update);
	}

}
