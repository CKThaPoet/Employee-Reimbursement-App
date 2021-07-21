package com.revature.services;

import java.util.List;

import com.revature.daos.UserDAO;
import com.revature.daos.UserInterface;
import com.revature.daos.UserRoleDAO;
import com.revature.daos.UserRoleInterface;
import com.revature.models.User;

//*MOST LIKELY NOT CORRECT DOUBLE CHECK*

//iam gonna add DAO's from the user and user role class here
public class UserService {

	//The service layer sits between the controller layer and the dao layer
	//we never want the web access layer (the servlets and controllers) to touch the database access layer
	//there are also time were we want to add more logic, like input validation, and the service is a great place for it
	

		//instantiate an UserDAO to use it's method
		private UserDAO uDAO = new UserDAO();
		
		
		private UserRoleDAO urDAO = new UserRoleDAO();
		
		//error fix this
		//create a method that sends the DAO data up to the controller (this method will be called by the controller)
		public User addUser() {
			return uDAO.addUser();
		}
		//literally all we're doing here is calling the method of the dao
		
//		public updateUser(User user) {
//			return uDAO.updateUser(user);
//		}
//		
		public User getUsers_Id(int user_id) {
			return uDAO.getUsers_Id(user_id);
		}
		
		public boolean removeUser(int user_id) {
			return uDAO.removeUser(user_id);
		}
		
		//iam adding this from the user role dao
		public List<User> getAllUser(){
			return urDAO.getAllUser();
		}
		public User getByUserName(String user_name) {
			return uDAO.getByUserName(user_name);
		}
}
