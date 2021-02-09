package com.cc.registration.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.registration.config.UserDetails;
import com.cc.registration.config.UserRepository;

@Service
public class CustomerDetailsService {

	@Autowired
	public UserRepository userRepository;
	
	public Map<String, String> registerCustomer(Map<String, String> request) {
		// logic goes here
		UserDetails n = new UserDetails();
		n.setName("Nitya");
		n.setEmail("m@g.c");
		userRepository.save(n);
		return new HashMap<String, String>();
	}

	public Map<String, String> retrieveCustomerDetails(Map<String, String> request) {
		// logic goes here
		return new HashMap<String, String>();
	}

}
