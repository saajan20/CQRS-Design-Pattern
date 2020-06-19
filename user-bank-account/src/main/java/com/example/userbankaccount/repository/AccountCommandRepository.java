package com.example.userbankaccount.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.userbankaccount.model.AccountCommandModel;

@Repository
public interface AccountCommandRepository extends CrudRepository <AccountCommandModel, String> {

	
	
	@Query("from AccountCommandModel where accountid=?1 and customerid=?2")
	Optional<AccountCommandModel> findByAccountidAndCustomerid (String accountid,String customerid);
	
	
	
	
}


