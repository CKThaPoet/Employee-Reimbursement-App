package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.daos.UserInterface;
import com.revature.models.User;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*
public class UserService {

	//The service layer sits between the controller layer and the dao layer
	//we never want the web access layer (the servlets and controllers) to touch the database access layer
	//there are also time were we want to add more logic, like input validation, and the service is a great place for it
	

		//instantiate an UserDAO to use it's method
		private UserInterface uDAO = new UserDAO();
		
		//create a method that sends the DAO data up to the controller (this method will be called by the controller)
		public void addUser(User user) {
			return uDAO.addUser();
		}
		//literally all we're doing here is calling the method of the dao
		
		public void updateUser(User user) {
			return uDAO.updateUser(User user);
		}
		
		public User getUser_Id(int user_id) {
			return uDAO.getUser_Id(int user_id);
		}
		
		public boolean removeUser(int user_id) {
			return uDAO.removeUser(user_id);
		}
}
