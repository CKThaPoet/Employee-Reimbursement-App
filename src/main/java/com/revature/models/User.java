package com.revature.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "user_role_id") //might be missing more here... still learning I think I got it probably 
private	UserRoles userRoles;	//might need to fix this... despite iam mighting changes on what I learned thus far... high possibility this is still wrong

@OneToMany (mappedBy="re_author",fetch = FetchType.EAGER)
private List<Reimbursement> reimbursements;

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intact 
}
