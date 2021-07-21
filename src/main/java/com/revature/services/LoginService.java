package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.daos.UserDAO;
import com.revature.daos.UserRoleDAO;
import com.revature.models.LoginDTO;
import com.revature.models.Reimbursement;
import com.revature.models.User;
import com.revature.models.UserRole;

public class LoginService {
	
	private LoginDTO logDTO = new LoginDTO();
	private UserDAO uDAO = new UserDAO();
	private UserRoleDAO urDAO = new UserRoleDAO();
	
public boolean login(String user_name, String user_password) {
		
		
		//validate the given username/password against some username/password in the database
	
		
		//get credentials from DAO
		List<User> allList = uDAO.getAllUser();
		List<User> userList = new ArrayList<>();
		
		userList = uDAO.getAllUser();
		
		//looping through the list of users
		for(int i = 0; i < userList.size(); i++) {
			if(user_name.equals(userList.get(i).getUser_name()) && user_password.equals(userList.get(i).getUser_password())) {
				return true;
			}
			
			
		}
		return false;
	}


//	//use if I can get it to work doubt it
//	public UserRole getRole(User user, Session roles) {
//		UserRole role = logDTO.getUser_role(user_name, user_role);
//		if(role!= null) {
//			return role;
//		}
//		return null;
//	}

}