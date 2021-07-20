package com.revature.models;

import java.util.List;
import java.util.Objects;


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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators; // had to manually import

@Entity
@Table(name = "users")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "user_id") // had to add this annotation to use hibernate with jackson 
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

//many users have one role
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "user_role_id") //might be missing more here... still learning I think I got it probably 
private	UserRole user_role;	//might need to fix this... despite iam mighting changes on what I learned thus far... high possibility this is still wrong


//one user can have many reimbursements
//might need to correct this because of confusion 
@OneToMany (mappedBy="re_author",fetch = FetchType.EAGER)
private List<Reimbursement> reimbursements;


public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(int user_id, String user_name, String user_password, String user_first_name, String user_last_name,
		String user_email, UserRole user_role, List<Reimbursement> reimbursements) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_email = user_email;
	this.user_role = user_role;
	this.reimbursements = reimbursements;
}


public User(String user_name, String user_password, String user_first_name, String user_last_name, String user_email,
		UserRole user_role, List<Reimbursement> reimbursements) {
	super();
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_email = user_email;
	this.user_role = user_role;
	this.reimbursements = reimbursements;
}


public User(int user_id, String user_name, UserRole user_role, List<Reimbursement> reimbursements) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_role = user_role;
	this.reimbursements = reimbursements;
}


public User(String user_first_name, String user_last_name, UserRole user_role, List<Reimbursement> reimbursements) {
	super();
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_role = user_role;
	this.reimbursements = reimbursements;
}


public User(String user_name, String user_first_name, String user_last_name, UserRole user_role) {
	super();
	this.user_name = user_name;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_role = user_role;
}


public User(int user_id, String user_name, String user_password, String user_first_name, String user_last_name,
		String user_email, UserRole user_role) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_email = user_email;
	this.user_role = user_role;
}




public User(String user_name, String user_password, String user_first_name, String user_last_name, String user_email,
		UserRole user_role) {
	super();
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_email = user_email;
	this.user_role = user_role;
}



public User(String user_name, String user_password, String user_first_name, String user_last_name, String user_email) {
	super();
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_email = user_email;
}


@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
			+ ", user_first_name=" + user_first_name + ", user_last_name=" + user_last_name + ", user_email="
			+ user_email + ", user_role=" + user_role + ", reimbursements=" + reimbursements + "]";
}


@Override
public int hashCode() {
	return Objects.hash(reimbursements, user_email, user_first_name, user_id, user_last_name, user_name, user_password,
			user_role);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return Objects.equals(reimbursements, other.reimbursements) && Objects.equals(user_email, other.user_email)
			&& Objects.equals(user_first_name, other.user_first_name) && user_id == other.user_id
			&& Objects.equals(user_last_name, other.user_last_name) && Objects.equals(user_name, other.user_name)
			&& Objects.equals(user_password, other.user_password) && Objects.equals(user_role, other.user_role);
}


public int getUser_id() {
	return user_id;
}


public void setUser_id(int user_id) {
	this.user_id = user_id;
}


public String getUser_name() {
	return user_name;
}


public void setUser_name(String user_name) {
	this.user_name = user_name;
}


public String getUser_password() {
	return user_password;
}


public void setUser_password(String user_password) {
	this.user_password = user_password;
}


public String getUser_first_name() {
	return user_first_name;
}


public void setUser_first_name(String user_first_name) {
	this.user_first_name = user_first_name;
}


public String getUser_last_name() {
	return user_last_name;
}


public void setUser_last_name(String user_last_name) {
	this.user_last_name = user_last_name;
}


public String getUser_email() {
	return user_email;
}


public void setUser_email(String user_email) {
	this.user_email = user_email;
}


public UserRole getUser_role() {
	return user_role;
}


public void setUser_role(UserRole user_role) {
	this.user_role = user_role;
}


public List<Reimbursement> getReimbursements() {
	return reimbursements;
}


public void setReimbursements(List<Reimbursement> reimbursements) {
	this.reimbursements = reimbursements;
}

//will add constructors after iam sure the syntax is correct for hibernate and my relationships are intact 


}
