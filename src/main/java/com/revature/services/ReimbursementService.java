package com.revature.services;

import java.util.List;

import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementInterface;
import com.revature.daos.UserDAO;
import com.revature.daos.UserInterface;
import com.revature.models.Reimbursement;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*
public class ReimbursementService {

	//The service layer sits between the controller layer and the dao layer
		//we never want the web access layer (the servlets and controllers) to touch the database access layer
		//there are also time were we want to add more logic, like input validation, and the service is a great place for it
		

			//instantiate a DAO to use it's method
			private ReimbursementInterface rDAO = new ReimbursementDAO();
			
			//this one might not be correct ask for help after double checking
			//its prob suppose to be nothing in the body because of it being void 
			public void addReimbursement(Reimbursement reimbursement) {
				rDAO.addReimbursement(reimbursement);
			}
			
			public List<Reimbursement> getReimbursements(){
				return rDAO.getReimbursements();
			}
			
			public List<Reimbursement> selectReimByStatus() {
				return rDAO.selectReimByStatus();
			}
}
