package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "re_id") //the name can be different here for the data bases I left it the same	
private	int re_id;

@Column(name = "re_id")
private	 String re_author; //REFERENCES users (user_id), fix for relationship //might need to be fixed possible be an int

@Column(name = "re_submmited")
private	 String re_submmited; //date

@Column(name = "re_amount")
private	 int re_amount;

@Column(name = "re_type_fk")
private	 int re_type_fk; //REFERENCES reimbursementType (re_type_id) fix this for the relationships

@Column(name = "re_description")
private	 String re_description;

@Column(name = "re_resolver")
private	String re_resolver; //REFERENCES users (user_id) fix this for the relationships

@Column(name = "re_resolved")
private	String re_resolved; //date

@Column(name = "re_status_fk")
private int	 re_status_fk; //may need to be changed

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intake 
}
