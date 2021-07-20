package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.ReimbursementStatus;
import com.revature.utils.HibernateUtil;

public class ReimbursementStatusDAO {

	public void addStatus(ReimbursementStatus reimbursementstatus) {
		//open a new hibernate session
		Session ses = HibernateUtil.getSession();
		
		//this is to insert the new role into the table by using the save method
		ses.save(reimbursementstatus);
		
		//now close the hibernate session
		HibernateUtil.closeSession();
	}
		
		//need a method to change or update the reimbursement status :) thanks Mark
		public void updateRe(ReimbursementStatus reimbursementstatus) {
			//open a new hibernate session
			Session ses = HibernateUtil.getSession();
			
			//this is to insert the new role into the table by using the save method
			ses.merge(reimbursementstatus);
			
			//now close the hibernate session
			HibernateUtil.closeSession();

		}
		
		public ReimbursementStatus getStatus(int id) 
		{
			//open a new sesssion
			Session ses = HibernateUtil.getSession();
			//get the status code based on the id
			ReimbursementStatus status = ses.get(ReimbursementStatus.class, id);
			//close the session
//			ses.close();
			HibernateUtil.closeSession();
			//return the status object
			return status;
}
}
