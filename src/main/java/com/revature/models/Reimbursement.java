package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "re_id") //the name can be different here for the data bases I left it the same	
private	int re_id;

@JoinColumn(name = "re_author")
private	 User re_author; //REFERENCES users (user_id), fix for relationship //might need to be fixed possible be an int

@Column(name = "re_submmited")
private	 String re_submmited; //date

@Column(name = "re_amount")
private	 int re_amount;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "re_type_id") //might be missing more here... still learning I think I got it probably
private	 ReimbursementType reimbursementType; //REFERENCES reimbursementType (re_type_id) fix this for the relationships

@Column(name = "re_description")
private	 String re_description;

@Column(name = "re_resolver")
private	String re_resolver; //REFERENCES users (user_id) fix this for the relationships

@Column(name = "re_resolved")
private	String re_resolved; //date

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "re_status_id") //might be missing more here... still learning I think I got it probably
private ReimbursementStatus reimbursementStatus; //may need to be changed

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intake 
}
