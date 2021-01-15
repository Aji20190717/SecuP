package com.security.practice;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	public Dto login(String id) {
		
		Dto dto = new Dto();
		
		if(id.equals("user")) {
			dto.setId(id);
			dto.setAddr("서울시 강남구");
			dto.setEmail("user@kh.com");
			dto.setName("유저");
			dto.setPhone("010-0000-0000");
		} else if (id.equals("admin")) {
			dto.setId(id);
			dto.setAddr("KH정보교육원");
			dto.setEmail("admin@kh.com");
			dto.setName("관리자");
			dto.setPhone("010-9999-9999");
		}
		
		return dto;
	}

}
