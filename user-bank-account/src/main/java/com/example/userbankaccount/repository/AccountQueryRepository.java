package com.example.userbankaccount.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.userbankaccount.model.AccountCommandModel;
import com.example.userbankaccount.model.AccountQueryModel;

@Repository
public interface AccountQueryRepository extends CrudRepository<AccountQueryModel,String>{

	@Query("from AccountQueryModel where account_id=?1 and customer_id=?2")
	Optional<AccountQueryModel> findByAccountidAndCustomerid (String accountid,String customerid);
}