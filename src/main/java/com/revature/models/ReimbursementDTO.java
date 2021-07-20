package com.revature.models;

public class ReimbursementDTO {

		private String reimbursementId;
		private String user_name;
		private String amount;
		private String type;
		private String des;
		
		public ReimbursementDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ReimbursementDTO(String reimbursementId, String user_name, String amount, String type, String des) {
			super();
			this.reimbursementId = reimbursementId;
			this.user_name = user_name;
			this.amount = amount;
			this.type = type;
			this.des = des;
		}

		public ReimbursementDTO(String user_name, String amount, String type, String des) {
			super();
			this.user_name = user_name;
			this.amount = amount;
			this.type = type;
			this.des = des;
		}

		@Override
		public String toString() {
			return "ReimbursementDTO [reimbursementId=" + reimbursementId + ", user_name=" + user_name + ", amount="
					+ amount + ", type=" + type + ", des=" + des + "]";
		}

		public String getReimbursementId() {
			return reimbursementId;
		}

		public void setReimbursementId(String reimbursementId) {
			this.reimbursementId = reimbursementId;
		}

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDes() {
			return des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		
		

		
	}

