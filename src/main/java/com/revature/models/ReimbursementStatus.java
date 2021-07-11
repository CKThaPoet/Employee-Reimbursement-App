package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursementStatus")
public class ReimbursementStatus {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "re_status_id") //the name can be different here for the data bases I left it the same	
private int	re_status_id;

@Column(name = "role_status")
private String	re_status;

@Column(name = "role_status_fk")
private	int re_status_fk; //might need to fix this one

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intake 
}
