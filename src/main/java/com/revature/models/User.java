package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "user_id") //the name can be different here for the data bases I left it the same	
private	int user_id;

@Column(name = "user_name")
private	String user_name;  //UNIQUE

@Column(name = "user_password")
private	String user_password;

@Column(name = "user_first_name")
private	String user_first_name;

@Column(name = "user_last_name")
private	String user_last_name;

@Column(name = "user_email")
private	String user_email; //UNIQUE

@Column(name = "user_role_fk") //might be missing more here
private	User user_role_fk;	//might need to fix this

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intact 
}
