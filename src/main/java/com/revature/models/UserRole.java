package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRole {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "user_role_id") //the name can be different here for the data bases I left it the same	
private	int user_role_id ;


@Column(name = "user_role")
private String user_role;


public UserRole() {
	super();
	// TODO Auto-generated constructor stub
}


public UserRole(int user_role_id, String user_role) {
	super();
	this.user_role_id = user_role_id;
	this.user_role = user_role;
}


public UserRole(String user_role) {
	super();
	this.user_role = user_role;
}


@Override
public String toString() {
	return "UserRoles [user_role_id=" + user_role_id + ", user_role=" + user_role + "]";
}


@Override
public int hashCode() {
	return Objects.hash(user_role, user_role_id);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserRole other = (UserRole) obj;
	return Objects.equals(user_role, other.user_role) && user_role_id == other.user_role_id;
}


public int getUser_role_id() {
	return user_role_id;
}


public void setUser_role_id(int user_role_id) {
	this.user_role_id = user_role_id;
}


public String getUser_role() {
	return user_role;
}


public void setUser_role(String user_role) {
	this.user_role = user_role;
}



}
