package com.revature.services;

public class LoginService {

public boolean login(String user_name, String user_password) {
		
		
		//validate the given username/password against some username/password in the database
		
		if(user_name.equals(" ") && user_password.equals(" ")) {
			return true;
		}
	else {
		return false;
	}
}
}