package com.security.practice;

public class Dto {
	
	private String id;
	private String pw;
	private String name;
	private String addr;
	private String email;
	private String phone;
	
	public Dto() {
		super();
	}
	
	public Dto(String id, String pw, String name, String addr, String email, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
