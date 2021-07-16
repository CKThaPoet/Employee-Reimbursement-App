package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Reimbursement;
import com.revature.utils.HibernateUtil;

public class ReimbursementDAO implements ReimbursementInterface {

	@Override
	public void addReimbursement(Reimbursement reimbursement) {
		//Open a hibernate Session object so that we can connect to the database
				Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
				
				ses.save(reimbursement); //use save method to insert into the data base it's a method for Insert fucntionality
				
				HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
//	*NEED TO FIX THIS ONE*
//	@Override
//	public Reimbursement selectReimByStatus(Reimbursement reimbursement) {
//Session ses = HibernateUtil.getSession();
//		
//Reimbursement status = ses.get(Reimbursement.class, reimbursement); //get() gets an object straight from the DB, skips the cache 
//		//here we're saying "Create a new Author object by getting the Author from the DB that has this id"
//		
//		HibernateUtil.closeSession();
//		
//		return status; //remember, return ends the method, so we close the Session, then return
//		
//	}

	@Override
	public List<Reimbursement> getReimbursements(Reimbursement reimbursement) {
		Session ses = HibernateUtil.getSession();
		
		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
		
		List<Reimbursement> allList = ses.createQuery("FROM Reimbursement").list(); //at the end, we turn the Query object into a List
		
		
		HibernateUtil.closeSession();
		
		return allList;
	}

}
