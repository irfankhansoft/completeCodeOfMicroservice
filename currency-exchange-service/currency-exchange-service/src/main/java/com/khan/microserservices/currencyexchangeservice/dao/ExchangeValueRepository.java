package com.khan.microserservices.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khan.microserservices.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	//this method will give the implementation of given below method
	//this is the magic of Spring data JPA, 
	//Once you provide method defination live given below you will get the implementation automaticaly
	ExchangeValue findByFromAndTo(String from, String to);
}
