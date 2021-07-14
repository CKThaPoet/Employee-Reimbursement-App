package com.revature.models;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
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

//many authors  have one user id
@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name = "user_id")
private	 int re_author; //REFERENCES users (user_id), fix for relationship //might need to be fixed possible be an int
//had author as string changed it to match user id table	
@Column(name = "re_submmited")
private	 LocalDateTime re_submmited; //date i changed from string to local datetime

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

public Reimbursement() {
	super();
	// TODO Auto-generated constructor stub
}



public Reimbursement(int re_id, int re_author, LocalDateTime re_submmited, int re_amount,
		ReimbursementType reimbursement_type, String re_description, String re_resolver, String re_resolved,
		ReimbursementStatus reimbursement_status) {
	super();
	this.re_id = re_id;
	this.re_author = re_author;
	this.re_submmited = re_submmited;
	this.re_amount = re_amount;
	this.reimbursement_type = reimbursement_type;
	this.re_description = re_description;
	this.re_resolver = re_resolver;
	this.re_resolved = re_resolved;
	this.reimbursement_status = reimbursement_status;
}



public Reimbursement(int re_author, LocalDateTime re_submmited, int re_amount, ReimbursementType reimbursement_type,
		String re_description, String re_resolver, String re_resolved, ReimbursementStatus reimbursement_status) {
	super();
	this.re_author = re_author;
	this.re_submmited = re_submmited;
	this.re_amount = re_amount;
	this.reimbursement_type = reimbursement_type;
	this.re_description = re_description;
	this.re_resolver = re_resolver;
	this.re_resolved = re_resolved;
	this.reimbursement_status = reimbursement_status;
}



@Override
public String toString() {
	return "Reimbursement [re_id=" + re_id + ", re_author=" + re_author + ", re_submmited=" + re_submmited
			+ ", re_amount=" + re_amount + ", reimbursement_type=" + reimbursement_type + ", re_description="
			+ re_description + ", re_resolver=" + re_resolver + ", re_resolved=" + re_resolved
			+ ", reimbursement_status=" + reimbursement_status + "]";
}



@Override
public int hashCode() {
	return Objects.hash(re_amount, re_author, re_description, re_id, re_resolved, re_resolver, re_submmited,
			reimbursement_status, reimbursement_type);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Reimbursement other = (Reimbursement) obj;
	return re_amount == other.re_amount && Objects.equals(re_author, other.re_author)
			&& Objects.equals(re_description, other.re_description) && re_id == other.re_id
			&& Objects.equals(re_resolved, other.re_resolved) && Objects.equals(re_resolver, other.re_resolver)
			&& Objects.equals(re_submmited, other.re_submmited)
			&& Objects.equals(reimbursement_status, other.reimbursement_status)
			&& Objects.equals(reimbursement_type, other.reimbursement_type);
}



public int getRe_id() {
	return re_id;
}



public void setRe_id(int re_id) {
	this.re_id = re_id;
}



public int getRe_author() {
	return re_author;
}



public void setRe_author(int re_author) {
	this.re_author = re_author;
}



public LocalDateTime getRe_submmited() {
	return re_submmited;
}



public void setRe_submmited(LocalDateTime re_submmited) {
	this.re_submmited = re_submmited;
}



public int getRe_amount() {
	return re_amount;
}



public void setRe_amount(int re_amount) {
	this.re_amount = re_amount;
}



public ReimbursementType getReimbursement_type() {
	return reimbursement_type;
}



public void setReimbursement_type(ReimbursementType reimbursement_type) {
	this.reimbursement_type = reimbursement_type;
}



public String getRe_description() {
	return re_description;
}



public void setRe_description(String re_description) {
	this.re_description = re_description;
}



public String getRe_resolver() {
	return re_resolver;
}



public void setRe_resolver(String re_resolver) {
	this.re_resolver = re_resolver;
}



public String getRe_resolved() {
	return re_resolved;
}



public void setRe_resolved(String re_resolved) {
	this.re_resolved = re_resolved;
}



public ReimbursementStatus getReimbursement_status() {
	return reimbursement_status;
}



public void setReimbursement_status(ReimbursementStatus reimbursement_status) {
	this.reimbursement_status = reimbursement_status;
}



}
