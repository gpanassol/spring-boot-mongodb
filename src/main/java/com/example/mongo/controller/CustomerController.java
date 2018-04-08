package com.example.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.model.Customer;
import com.example.mongo.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	@RequestMapping("/customer")
	@ResponseBody
	public ResponseEntity<List<Customer>> getController() {
		List<Customer> customers = repository.findAllByName("Bob");
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
}
