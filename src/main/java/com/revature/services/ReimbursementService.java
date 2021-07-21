package com.revature.services;

import java.util.List;

import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementInterface;
import com.revature.daos.ReimbursementStatusDAO;
import com.revature.daos.UserDAO;
import com.revature.daos.UserInterface;
import com.revature.models.Reimbursement;
import com.revature.models.ReimbursementStatus;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*
public class ReimbursementService {

	//The service layer sits between the controller layer and the dao layer
		//we never want the web access layer (the servlets and controllers) to touch the database access layer
		//there are also time were we want to add more logic, like input validation, and the service is a great place for it
		

			//instantiate a DAO to use it's method
			private ReimbursementDAO rDAO = new ReimbursementDAO();
			private ReimbursementStatusDAO rsDAO = new ReimbursementStatusDAO();
			
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
			
			public Reimbursement getReById(int id) {
				return rDAO.getReById(id);
		}
			
			//forgot to make some function to approve the reimbursements :( and of course aim ahave to make one to denie them as well
			public boolean approveReimbursement(int id){
				Reimbursement selectedR = rDAO.getReById(1);
				boolean success = false;
				//check if the reimbursement is approved or denied
				if((selectedR.getReimbursement_status().getRe_status_id()  == 2) || (selectedR.getReimbursement_status().getRe_status_id()  == 3))
				{
					//reimbursement was already completed, do nothing to it
				}
				else//else it is waiting for decision by the fianace manger
				{
					
					//get a status object of approval
					ReimbursementStatus status = rsDAO.getStatus(2);
					selectedR.setReimbursement_status(status);
					
					//NEED TO DOUBLE CHECK THIS... IAM STIL STRUGGLING WITH IT
					
					//set the reimbursement status to approved
					//selectedR.setRe_status(status);
					
					//push the reimbursement to the Database
					rDAO.updateRe(selectedR);
					success = true;
				}
				return success;
}
			//if I did the approve one okay this should be fine it  is just the reverese 
			public boolean denyReimbursement(int id) 
			{
				Reimbursement selectedR = rDAO.getReById(1);
				boolean success = false;
				//check if the reimbursment is approved or denied
				if((selectedR.getReimbursement_status().getRe_status_id()  == 2) || (selectedR.getReimbursement_status().getRe_status_id()  == 3))
				{
					//reimbursement was already completed, do nothing to it
				}
				else//else it is waiting for decision by the fianace manger
				{
					
					//get a status object of approval
					ReimbursementStatus status = rsDAO.getStatus(3);
					
					//set the ticket's status to approved
					selectedR.setReimbursement_status(status);
					
					//push the ticket to the DB
					rDAO.updateRe(selectedR);
					success = true;
				}

				
				return success;
			}
}