package com.revature.models;

//Data Transfer Object. A DTO  a model of some data coming from the client.
//The servlet will parse a JSON object sent by the user, containing their username and password, 
//which gets sent to the controller to be turned into a Java object
//The username and password will be put into this DTO as fields, which will get checked/validated by the service layer
//The DTO is not stored in the database. It's purely for data transfer... Data Transfer Object

public class LoginDTO {
//username and password sent in by the user stored in these variables
public	String user_name;

public	String user_password;

//two constructors one with no args and a second one with the variables  so we can instantiate LoginDTO objects
public LoginDTO() {
	super();
	// TODO Auto-generated constructor stub
}


public LoginDTO(String user_name, String user_password) {
	super();
	this.user_name = user_name;
	this.user_password = user_password;
}


}
