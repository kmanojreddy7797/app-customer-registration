package com.cc.registration.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.registration.service.CustomerDetailsService;

@RestController
public class CustomerDetailsApis {
	
	@Autowired
	public CustomerDetailsService customerDetailsService;
	
	@RequestMapping("/registerCustomer")
	public Map<String,String> registerCustomer(Map<String,String> request) {
		customerDetailsService.registerCustomer(request);
		return new HashMap<String,String>();
	}
	
	@RequestMapping("/retrieveCustomerDetails")
	public Map<String,String> retrieveCustomerDetails(Map<String,String> request) {
		
		return new HashMap<String,String>();
	}
	
}