package com.revature.daos;

import java.util.List;

import com.revature.models.UserRole;

public interface UserRoleInterface {
//if I want CRUD for the roles
	
	//might do a get role by id most likely will have to change models though
	public UserRole getUser_role_id(int user_role_id);
	
	//to just get the role might not need this
	//public UserRole getUser_role(String user_role);
	
	//might need to get all role dont see why I would need it for this project but just in case id most likely will have to change models though
	public List<UserRole> getAllRole();
	
	//insert a new role to the DB
	public void addRole(UserRole userrole);
	
	//if I wanted to update or change  a role in the database
	public void updateRole(UserRole user_role);
	
	//delete a role I guess if I mess up or something
	public void deleteRole(UserRole user_role);
}
