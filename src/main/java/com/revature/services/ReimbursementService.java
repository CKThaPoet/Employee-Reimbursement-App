package com.revature.services;

import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementInterface;
import com.revature.daos.UserDAO;
import com.revature.daos.UserInterface;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*
public class ReimbursementService {

	//The service layer sits between the controller layer and the dao layer
		//we never want the web access layer (the servlets and controllers) to touch the database access layer
		//there are also time were we want to add more logic, like input validation, and the service is a great place for it
		

			//instantiate an UserDAO to use it's method
			private ReimbursementInterface uDAO = new ReimbursementDAO();
}
