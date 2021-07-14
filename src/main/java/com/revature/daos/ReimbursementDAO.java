package com.revature.daos;

import java.util.List;

import com.revature.models.Reimbursement;

public class ReimbursementDAO {
	
	public void addReimbursement (int re_author , String re_submmited, int re_amount, int re_type_id, String re_description ) {
		
	}
	
	public Reimbursement selectReimByStatus(int re_id , String re_status) {
		return null;
	}
	
	//update reimbursements for the fianace mangers 

	public List<Reimbursement> viewReimbursements(int re_id, int re_author, String re_submmited, int re_amount, int re_type_id, String re_description, String re_resolver, String re_resolved, int re_status_id ){
		
		return null;
	}
}
