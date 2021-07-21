package com.revature.models;

import java.util.Objects;

public class SubmitDTO {
	
	private String userid;
	private String first_name;
	private String last_name;
	private String type;
	private String amount;
	private String description;
	
	public SubmitDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubmitDTO(String userid, String first_name, String last_name, String type, String amount,
			String description) {
		super();
		this.userid = userid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.type = type;
		this.amount = amount;
		this.description = description;
	}

	public SubmitDTO(String first_name, String last_name, String type, String amount, String description) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.type = type;
		this.amount = amount;
		this.description = description;
	}

	@Override
	public String toString() {
		return "SubmitDTO [userid=" + userid + ", first_name=" + first_name + ", last_name=" + last_name + ", type="
				+ type + ", amount=" + amount + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, description, first_name, last_name, type, userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubmitDTO other = (SubmitDTO) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(description, other.description)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(type, other.type) && Objects.equals(userid, other.userid);
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	

}
