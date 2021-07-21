package com.revature.models;

import java.util.Objects;

public class UserDTO {

	private	String user_first_name;
	
	private	String user_last_name;
	
	private	UserRole user_role;	
	
	private	String user_name; 
	
	private	String user_email;

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String user_first_name, String user_last_name, UserRole user_role, String user_name,
			String user_email) {
		super();
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_role = user_role;
		this.user_name = user_name;
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "UserDTO [user_first_name=" + user_first_name + ", user_last_name=" + user_last_name + ", user_role="
				+ user_role + ", user_name=" + user_name + ", user_email=" + user_email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(user_email, user_first_name, user_last_name, user_name, user_role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(user_email, other.user_email) && Objects.equals(user_first_name, other.user_first_name)
				&& Objects.equals(user_last_name, other.user_last_name) && Objects.equals(user_name, other.user_name)
				&& Objects.equals(user_role, other.user_role);
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

	public UserRole getUser_role() {
		return user_role;
	}

	public void setUser_role(UserRole user_role) {
		this.user_role = user_role;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	} 
	
}
