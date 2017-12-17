package com.demo.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "user")
public class User {
	
	private String userName;
	private String password;
	
	
	
	@XmlElement(name = "userName")		// to return as JSON
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@XmlElement(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
