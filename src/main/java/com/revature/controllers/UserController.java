package com.revature.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.services.UserService;

//**MOST LIKELY INCORRECT DOUBLE CHECK
public class UserController {

	private UserService us = new UserService();
	private ObjectMapper om = new ObjectMapper();
	
	public void getUser_Id(HttpServletResponse res) throws IOException {
		
		User u = us.getUser_Id(int user_id); //get the method from the dao method
		
		String json = om.writeValueAsString(u); //turn the list into a JSON String
		
		res.getWriter().print(json); //put the JSON into the response object
		
		res.setStatus(200); //override the default 404 error we set in the MasterServlet
	}	
}
