package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.LoginController;
import com.revature.controllers.ReimbursementController;
import com.revature.controllers.UserController;

//this is the front controller - ALL requests that come in will have to hit this first.
	public class MasterServlet extends HttpServlet {

		private ReimbursementController rc = new ReimbursementController();
		private LoginController lc = new LoginController();
		private UserController uc = new UserController();
		
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			res.setContentType("application/json"); //set the content of our response object to be JSON
			
			//by default, Tomcat will send back a successful status code (200) if a request gets handled.
			//since we have a master servlet that takes all requests, this means all requests will get hendled.
			//this can lead to problems - we don't want a 200 if the request isn't handled correctly
			//thus, by default, we'll set the status code to 404, and change it in our code upon success.
			res.setStatus(404);
			
			
			//Now we want to write some code that will determine where requests get sent.
			
			String URI = req.getRequestURI().replace("/P1-Chani-Kinsler/", "");
			//getting the request URI, and stripping out the base URL
			//so we'll just be left with the endpoint (e.g. "reimbursements", "login") to use in a switch
			
			switch(URI) {
			
			case "reimbursements": //adding functionality to make the user have to log in before accessing all avengers
			//need to correct the methoda in the controller
					rc.getReimbursements(res); //doGet all reimbursements
				break;
				
			case "login": 
				
				lc.login(req, res);
				break;
				
				//need a case for adding reimbursements
			case "addReimbursements":
				rc.addReimbursement(res);
				
				//need a case for filter by status
			case "pendingStatus":
				rc.selectReimByStatus(res);
			
				//user controller get all user method
			case "allUsers":
				uc.getAllUser(res);
				
				//need the controller and service set up for this reimbursement dao so I can add case here
			}
			
		}
		
		
		
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			doGet(req, res);
			//this sends every POST request to the doGet method
			//there is one switch statement in this Servlet.
			//and we'll differentiate get from post in the controllers instead of the servlet.
			
			//I will have to double check but I think I need this in here like it is in doGEt
			res.setContentType("application/json");
			res.setStatus(404);
			String URI = req.getRequestURI().replace("/P1-Chani-Kinsler/", "");
		}
}
