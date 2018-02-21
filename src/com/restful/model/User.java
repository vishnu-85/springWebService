package com.restful.model;

public class User {
	
	private int userid;
	
	
	private String email;
	
	
	private String pass;
	
	public User(){
		
	}
	public User(int userid, String email, String pass){
	
		this.userid = userid;
		this.email = email;
		this.pass = pass;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
