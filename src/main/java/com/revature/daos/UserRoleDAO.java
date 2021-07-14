package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.UserRole;
import com.revature.utils.HibernateUtil;

public class UserRoleDAO implements UserRoleDAOInterface {

	@Override
	public UserRole getUser_role_id(int re_id) {
				//use this to start a new hibernate sesssion
				Session ses = HibernateUtil.getSession();
				
				//get the role  based on the id for the role by using the get method
				UserRole role = ses.get(UserRole.class, re_id);
				
				//close the hibernate session
				HibernateUtil.closeSession();
				//return the role object
				return role;
	}

	@Override
	public List<UserRole> getAllRole() {
				//use this to start a new hibernate sesssion
				Session ses = HibernateUtil.getSession();
				
				//getting the list of roles with a query
				List<UserRole> roleList = ses.createQuery("from UserRole").list();
				
				//close the hibernate session
				HibernateUtil.closeSession();
				
				//return the list of roles from data base
				return roleList;
	}

	@Override
	public void addRole(UserRole newRole) {
				//open a new hibernate session
				Session ses = HibernateUtil.getSession();
				
				//this is to insert the new role into the table by using the save method
				ses.save(newRole);
				
				//now close the hibernate session
				HibernateUtil.closeSession();
		
	}

	@Override
	public void updateRole(UserRole user_role) {
				//open a new hibernate session
				Session ses = HibernateUtil.getSession();
				
				//update the role in the table by using merge method
				ses.merge(user_role);
				
				//close the hibernate session
				HibernateUtil.closeSession();
	}

	@Override
	public void deleteRole(UserRole user_role) {
		//open a hibernate session
		Session ses = HibernateUtil.getSession();
		
		//remove theuser_role int the tableby using the delete method
		ses.delete(user_role);
		
		//close the hibernate session
		HibernateUtil.closeSession();
		
	}

	
}
