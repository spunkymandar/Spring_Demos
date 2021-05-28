package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(value = "/customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping(value = "/custoemrs/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id) {
		Optional<Customer> customer = customerRepository.findById(id);
		return customer;
	}
}
