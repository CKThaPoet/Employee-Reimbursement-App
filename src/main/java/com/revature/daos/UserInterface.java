package com.revature.daos;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.models.User;

public interface UserInterface {
	
	public void addUser(User user);
	
	//public void updateUser(User user);
	
	public User getUsers_Id(int user_id);
	
	public boolean removeUser(int user_id);
	
	public List<User> getAllUser();
	
	public User getByUserName(String user_name);
	
}
