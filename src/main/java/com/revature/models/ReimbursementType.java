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
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "re_type_id") // had to add this annotation to use hibernate with jackson 
@Table(name = "reimbursement_type")
public class ReimbursementType {

@Id //this makes a field the primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our primary key a serial data type
@Column(name = "re_type_id") //the name can be different here for the data bases I left it the same
private	int re_type_id;

@Column(name = "re_type")
private	String re_type; //might need to fix this is also one to one

public ReimbursementType() {
	super();
	// TODO Auto-generated constructor stub
}

public ReimbursementType(int re_type_id, String re_type) {
	super();
	this.re_type_id = re_type_id;
	this.re_type = re_type;
}

public ReimbursementType(String re_type) {
	super();
	this.re_type = re_type;
}

@Override
public String toString() {
	return "ReimbursementType [re_type_id=" + re_type_id + ", re_type=" + re_type + "]";
}

@Override
public int hashCode() {
	return Objects.hash(re_type, re_type_id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ReimbursementType other = (ReimbursementType) obj;
	return Objects.equals(re_type, other.re_type) && re_type_id == other.re_type_id;
}

public int getRe_type_id() {
	return re_type_id;
}

public void setRe_type_id(int re_type_id) {
	this.re_type_id = re_type_id;
}

public String getRe_type() {
	return re_type;
}

public void setRe_type(String re_type) {
	this.re_type = re_type;
}


}
