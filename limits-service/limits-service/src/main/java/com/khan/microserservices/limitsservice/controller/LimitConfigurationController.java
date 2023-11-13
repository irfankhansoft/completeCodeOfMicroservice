package com.khan.microserservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khan.microserservices.limitsservice.bean.LimitConfiguration;
import com.khan.microserservices.limitsservice.config.Configuration;

@RestController
public class LimitConfigurationController {
	

	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}
}
