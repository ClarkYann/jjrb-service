package com.zerocode.jjrb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerocode.jjrb.dao.testDao;

@Service
public class testService {
@Autowired
 testDao testdao;
	public String ll(String ll) {
		return testdao.ll(ll);
		
		
	}

}
