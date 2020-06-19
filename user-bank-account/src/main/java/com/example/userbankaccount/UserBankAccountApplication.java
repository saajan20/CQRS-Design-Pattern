package com.example.userbankaccount;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserBankAccountApplication {

	public static void main(String[] args) {
		
		System.out.println(String.valueOf(new Date()));
		SpringApplication.run(UserBankAccountApplication.class, args);
	}

}
