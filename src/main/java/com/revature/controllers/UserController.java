package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.User;
import com.revature.services.UserService;

//**MOST LIKELY INCORRECT DOUBLE CHECK
public class UserController {

	private UserService us = new UserService();
	private ObjectMapper om = new ObjectMapper();
	
	//errors fix
	public void getUser_Id(HttpServletResponse res) throws IOException {
		
		User u = us.getUser_Id(); //get the method from the service layer
		
		String json = om.writeValueAsString(u); //turn the list into a JSON String
		
		res.getWriter().print(json); //put the JSON into the response object
		
		res.setStatus(200); //override the default 404 error we set in the MasterServlet
	}	
	
	//errors fix
	public List<User> getAllUser(HttpServletResponse res) throws IOException{
		List<User> allUsers = us.getAllUser();
		
		String json = om.writeValueAsString(allUsers); //turn the list into a JSON String
		
		res.getWriter().print(json); //put the JSON into the response object
		
		res.setStatus(200); //override the default 404 error we set in the MasterServlet
	}
}
