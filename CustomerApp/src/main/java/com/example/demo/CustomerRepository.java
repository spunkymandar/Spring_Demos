package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	@Query("SELECT t FROM Customer t WHERE t.customerAddress = ?1")
	//@Query("select u from User u where u.firstname = ?#{#customer.firstname}")
	public Customer findBycustomerAddress(String address);

}
