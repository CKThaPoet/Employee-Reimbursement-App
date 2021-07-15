package com.revature.daos;


import java.util.List;

import com.revature.models.Reimbursement;


public interface ReimbursementInterface {
	
	public void addReimbursement (Reimbursement reimbursement );
	
	//need to fix here and in the DAO
//	public Reimbursement selectReimByStatus(Reimbursement reimbursement);
	
	
	//update reimbursements for the fianace mangers 

	public List<Reimbursement> getReimbursements(Reimbursement reimbursement);
}
