package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.User;
import com.revature.models.UserRole;
import com.revature.utils.HibernateUtil;

public class UserDAO implements UserInterface{

	@Override
	public void addUser(User user) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		
		ses.save(user); //use save method to insert into the data base it's a method for Insert fucntionality
		
		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
	
	
//	@Override
//	public void updateUser(User user) {
//		Session ses = HibernateUtil.getSession();
//		
//		ses.merge(user); //this will update the entire book record in the database, if it exists
//		
//		
//		//update() would throw an error if the book object already existed in Hibernate's cache
//		//hence why  merge() is safer
//		
//		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
//	}
	
	@Override
	public User getUsers_Id(int user_id) {
		Session ses = HibernateUtil.getSession();
		User uID = ses.get(User.class, user_id);
		HibernateUtil.closeSession();
		return uID;
	}

	@Override
	public boolean removeUser(int user_id) {
		Session ses = HibernateUtil.getSession();
		User userGone = getUsers_Id(user_id); 
		
			ses.delete(userGone);
			HibernateUtil.closeSession();
			return true;
		}
	
	@Override 
	public User getByUserName(String user_name)
	{
		Session ses = HibernateUtil.getSession();
		//simlar to the select by status method
		List<User> userList = ses.createQuery("from User").list();
		
		User user = new User();
		for(User u: userList)
		{
			if(u.getUser_name().compareTo(user_name) == 0)
			{
				user = u;
			}
		}
		
		return user;
	}


	@Override
	public List<User> getAllUser() {
		Session ses = HibernateUtil.getSession();
		
		List<User> userList = ses.createQuery("from User").list();
		
		HibernateUtil.closeSession();
		
		return userList;
	} 
	
	
}
