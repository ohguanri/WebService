package com.demo.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.model.User;

@Path("login")
public class LoginRestful {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)		// to return as JSON
	@Path("/showUsers")
	public ArrayList<User> listUsers(){
		ArrayList<User> users = new ArrayList<>();
		
		User user1 = new User();
		user1.setUserName("admin");
		user1.setPassword("admin");
		
		users.add(user1);
		
		return users;
	}
	
	@POST
	@Path("/authenticate")
	public boolean authenticate(String userName, String password) {
		
		if (userName.equals("admin")  && password.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
}
