package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;
import com.revature.services.UserService;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*


public class ReimbursementController {

	private ReimbursementService rs = new ReimbursementService();
	private ObjectMapper om = new ObjectMapper(); //import Jackson databind use object mapper  so we can work with JSON
	
	//view all reimbursements are in the user class
	public void getReimbursements(HttpServletResponse res) throws IOException {
		
		List<Reimbursement>  re_all = rs.getReimbursements(); //get the method from the dao method
		
		String json = om.writeValueAsString(re_all); //turn the list into a JSON String
		
		res.getWriter().print(json); //put the JSON into the response object
		
		res.setStatus(200); //override the default 404 error we set in the MasterServlet
	}	
	
	//missing info in the body will fix later
	public void addReimbursement(HttpServletResponse res) throws IOException {
		
	}
	
	//fix this have errors
	public List<Reimbursement> selectReimByStatus(HttpServletResponse res) throws IOException {
		
		List<Reimbursement> pending = rs.selectReimByStatus();
		String pstatus = null;

		pstatus = om.writeValueAsString(pending);
		
		res.getWriter().print(pstatus);
		res.setStatus(200);
	}
}
