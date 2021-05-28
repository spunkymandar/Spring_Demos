package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerAppApplication implements CommandLineRunner{
	
	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Customer c1=new Customer();
		//c1.setCustomerId(102);
//		c1.setCustomerName("John Doe");
//		c1.setCustomerAddress("Pune");
//		
//		customerRepository.save(c1);
//		System.out.println("Object is saved");
		
		List<Customer> customerList=customerRepository.findAll();
		
		for(Customer customer:customerList) {
			System.out.println(customer);
		}
		
		//System.out.println(customerRepository.findById(1));
		
		Optional<Customer> c=customerRepository.findById(101);
		
		if(!c.isPresent())
			System.out.println("customer not found");
		else
			System.out.println(c);
		
		
		
	//	Customer mycust=customerRepository.findBycustomerAddress("Mumbai");
		Customer mycust=customerRepository.findBycustomerAddress("Pune");
		
		System.out.println(mycust);
		
		
		

	}
}