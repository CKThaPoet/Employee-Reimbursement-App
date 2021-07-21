package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators; // had to manually import

@Entity
@Table(name = "reimbursement_status")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "re_status_id") // had to add this annotation to use hibernate with jackson 
public class ReimbursementStatus {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type

@Column(name = "re_status_id") //the name can be different here for the data bases I left it the same	
private int	re_status_id;

@Column(name = "re_status")
private String	re_status;


public ReimbursementStatus() {
	super();
	// TODO Auto-generated constructor stub
}


public ReimbursementStatus(int re_status_id, String re_status) {
	super();
	this.re_status_id = re_status_id;
	this.re_status = re_status;
}


public ReimbursementStatus(String re_status) {
	super();
	this.re_status = re_status;
}


@Override
public String toString() {
	return "ReimbursementStatus [re_status_id=" + re_status_id + ", re_status=" + re_status + "]";
}


@Override
public int hashCode() {
	return Objects.hash(re_status, re_status_id);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ReimbursementStatus other = (ReimbursementStatus) obj;
	return Objects.equals(re_status, other.re_status) && re_status_id == other.re_status_id;
}


public int getRe_status_id() {
	return re_status_id;
}


public void setRe_status_id(int re_status_id) {
	this.re_status_id = re_status_id;
}


public String getRe_status() {
	return re_status;
}


public void setRe_status(String re_status) {
	this.re_status = re_status;
}



}
