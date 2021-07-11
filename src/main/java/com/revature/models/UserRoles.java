package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userRoles")
public class UserRoles {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "user_role_id") //the name can be different here for the data bases I left it the same	
private	int user_role_id ;

@Column(name = "user_role")
@OneToMany(mappedBy="user_role_fk", fetch = FetchType.EAGER) //mapping might be wrong double check
private	String user_role;

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intact
}
