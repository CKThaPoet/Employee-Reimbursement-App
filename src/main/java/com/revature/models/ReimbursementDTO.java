package com.revature.models;

import java.util.Objects;

public class ReimbursementDTO {

		private String reimbursementId;
		private String user_name;
		private String amount;
		private String type;
		private String description;
		private String manger;
		private String Status;
		
		public ReimbursementDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ReimbursementDTO(String reimbursementId, String user_name, String amount, String type,
				String description, String manger, String status) {
			super();
			this.reimbursementId = reimbursementId;
			this.user_name = user_name;
			this.amount = amount;
			this.type = type;
			this.description = description;
			this.manger = manger;
			Status = status;
		}

		@Override
		public String toString() {
			return "ReimbursementDTO [reimbursementId=" + reimbursementId + ", user_name=" + user_name + ", amount="
					+ amount + ", type=" + type + ", description=" + description + ", manger=" + manger + ", Status="
					+ Status + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(Status, amount, description, manger, reimbursementId, type, user_name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ReimbursementDTO other = (ReimbursementDTO) obj;
			return Objects.equals(Status, other.Status) && Objects.equals(amount, other.amount)
					&& Objects.equals(description, other.description) && Objects.equals(manger, other.manger)
					&& Objects.equals(reimbursementId, other.reimbursementId) && Objects.equals(type, other.type)
					&& Objects.equals(user_name, other.user_name);
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

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getManger() {
			return manger;
		}

		public void setManger(String manger) {
			this.manger = manger;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}

		
}