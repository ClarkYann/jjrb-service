package com.zerocode.jjrb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zerocode.jjrb.service.testService;
@RestController
public class jjrbcontroller2 {

	@Autowired
	testService testservice;
	
	
	@RequestMapping(value="/ls/{ll}", method=RequestMethod.GET)
	public String ls(@PathVariable("ll") String ll){
		return testservice.ll(ll);
		
		
	}
	
}
