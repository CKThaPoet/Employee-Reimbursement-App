package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;
import com.revature.services.UserService;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*
//view all reimbursements are in the user class
public class ReimbursementController {

	private ReimbursementService us = new ReimbursementService();
	private ObjectMapper om = new ObjectMapper();
	
	public void getReimbursements(HttpServletResponse res) throws IOException {
		
		public List<Reimbursement> reimbursements re_all = us.getReimbursements(); //get the method from the dao method
		
		String json = om.writeValueAsString(re_all); //turn the list into a JSON String
		
		res.getWriter().print(json); //put the JSON into the response object
		
		res.setStatus(200); //override the default 404 error we set in the MasterServlet
	}	
}
