package com.klymchuk.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.klymchuk.entities.Address;

@RestController
public class AddressController {
	
	@RequestMapping(value = "/address",
					method = RequestMethod.GET,
					produces = "application/json")
	
	public Address getAddress() {
		Address address = new Address();
		address.setStreet("FL");
		address.setState("154 FL");
		
		return address;
	}

}
