package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	//@Query("SELECT t FROM Customer t WHERE t.customerAddress = 'Pune'")
	@Query(name = "customerquery1")
	public Customer findBycustomerAddress();

}
