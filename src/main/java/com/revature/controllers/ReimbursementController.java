package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementStatusDAO;
import com.revature.daos.ReimbursementTypeDAO;
import com.revature.daos.UserDAO;
import com.revature.models.Reimbursement;
import com.revature.models.ReimbursementDTO;
import com.revature.models.ReimbursementStatus;
import com.revature.models.ReimbursementType;
import com.revature.models.User;
import com.revature.services.ReimbursementService;
import com.revature.services.UserService;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*


public class ReimbursementController {

	private ReimbursementService rs = new ReimbursementService();
	private ReimbursementStatusDAO sDAO = new ReimbursementStatusDAO();
	ReimbursementTypeDAO tDAO = new ReimbursementTypeDAO();
	private UserDAO uDAO = new UserDAO();
	private ReimbursementDTO reimDTO = new ReimbursementDTO();
	
	private ObjectMapper om = new ObjectMapper(); //import Jackson databind use object mapper  so we can work with JSON
	
	//view all reimbursements are in the user class
	public void getReimbursements(HttpServletResponse res) throws IOException {
		
		List<Reimbursement>  re_all = rs.getReimbursements(); //get the method from the dao method
		
		//this is most likely the issue
		String json = om.writeValueAsString(re_all); //turn the list into a JSON String
		
		res.getWriter().print(json); //put the JSON into the response object
		
		res.setStatus(200); //override the default 404 error we set in the MasterServlet
	}	
	
	//missing info in the body will fix later
	public void addReimbursement(HttpServletResponse res) throws IOException {
		//turning into java from json double check in the p1 demo and login
		
		
		
	}
	
	//fix this have errors
	public void selectReimByStatus(HttpServletResponse res) throws IOException {
		
		List<Reimbursement> pending = rs.selectReimByStatus();
		

		String pstatus = om.writeValueAsString(pending);
		
		res.getWriter().print(pstatus);
		res.setStatus(200);
		
		
	}
	
	public void addReimbursement(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		BufferedReader reader = request.getReader();
		StringBuilder sb = new StringBuilder();
		//read the contents of the bufferedReader into a String
		String readL = reader.readLine();
		
		while(readL != null)
		{
			//add the contents of line to the stringbulder
			sb.append(readL);
			//assign line to the next line of data in the reader
			readL = reader.readLine();
		}
		//ObjectMapper only works with Strings using it with string builders
		String body = new String(sb);
		
		//use the ObjectMapper to read the JSON into the DTO
		ReimbursementDTO rDTO = om.readValue(body, ReimbursementDTO.class);
		
		
		User user = uDAO.getByUserName(reimDTO.getUser_name());
		
		ReimbursementStatus status = sDAO.getStatus(1);
		
		ReimbursementType type =tDAO.getReType(Integer.parseInt(rDTO.getType()));
		
		Reimbursement r = new Reimbursement(user,Integer.parseInt(reimDTO.getAmount()), type , reimDTO.getDes(),  null, status );
		
		rs.addReimbursement(r);
		
	}
}
