package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursementType")
public class ReimbursementType {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "re_type_id") //the name can be different here for the data bases I left it the same
private	int re_type_id;

@Column(name = "re_type")
private	String re_type; //might need to fix this is also one to one

//one status can be assigned to many reimbursements

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intact 
}
