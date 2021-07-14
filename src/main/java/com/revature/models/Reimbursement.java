package com.revature.models;

import javax.persistence.CascadeType;
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
@Table(name = "reimbursements")
public class Reimbursement {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "re_id") //the name can be different here for the data bases I left it the same	
private	int re_id;

//many authors  have one user id
@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name = "user_id")
private	 String re_author; //REFERENCES users (user_id), fix for relationship //might need to be fixed possible be an int

@Column(name = "re_submmited")
private	 String re_submmited; //date

@Column(name = "re_amount")
private	 int re_amount;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "re_type_id") //might be missing more here... still learning I think I got it probably
private	 ReimbursementType reimbursement_type; //REFERENCES reimbursementType (re_type_id) fix this for the relationships

@Column(name = "re_description")
private	 String re_description;

//many  reimbursements can be resloved by one  user_id (many reimbursements can be resolved by one user)***************ASK BEN AGAIN LOL
@Column(name = "re_resolver")
private	String re_resolver; //REFERENCES users (user_id) fix this for the relationships

@Column(name = "re_resolved")
private	String re_resolved; //date

//many reimbursements have one status id
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "re_status_id") //might be missing more here... still learning I think I got it probably
private ReimbursementStatus reimbursement_status; //may need to be changed

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intake 
}
