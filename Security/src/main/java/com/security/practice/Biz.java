package com.security.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Biz {
	
	@Autowired
	private Dao dao;
	
	public Dto login(String id) {
		return dao.login(id);
	}

}
