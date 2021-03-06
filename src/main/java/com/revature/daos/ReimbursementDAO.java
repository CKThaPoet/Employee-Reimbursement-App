package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
	//using the list of reimbursement then getters to get in id and if it has the id for pending return using a for loop
	
	
	//fix this iam not using the session
	@Override
	public List<Reimbursement> selectReimByStatus() {
		Session ses = HibernateUtil.getSession();
		
		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
		//probably should do it this way
	//  List<Reimbursement> allList = ses.createQuery("FROM Reimbursement where reimbursement_status = 1 ").list(); //at the end, we turn the Query object into a List
		
		//used method from get all reimbursements
		List<Reimbursement> allList = getReimbursements();
		
		//make a new list
		List<Reimbursement> returnList = new ArrayList<>();		
		
		//use for loop to go through list 
		for (Reimbursement r : allList)
		{
			//so if the reimbursement status id is 1 which is my pending  are the same, add to this returned list
			if(r.getReimbursement_status().getRe_status_id() == 1)
			{
				returnList.add(r);
			}
		HibernateUtil.closeSession();
		
		}
		return returnList; //remember, return ends the method, so we close the Session, then return

	}
	
	@Override
    public boolean removeReim(int re_id) {
		//get hibernate session
		Session ses = HibernateUtil.getSession();
		
		//use get method to get reimbursement id
		Reimbursement rGone = ses.get(Reimbursement.class,re_id);
        
		//use delete method
		ses.delete(rGone);
		HibernateUtil.closeSession();
		return true;
        
	}
	//probably should be in the dao of the class this is actually in models this is actually in the user class so probably should be in the user dao
	//parameter needs to be empty because the user doesnt need to give anything for this method in order for it
	//to complete what it needs to do because what is going on is only in this block scope
	//it can be here
	@Override
	public List<Reimbursement> getReimbursements() {
		Session ses = HibernateUtil.getSession();
		
		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
			
		List<Reimbursement> allList = ses.createQuery("FROM Reimbursement").list(); //at the end, we turn the Query object into a List
		
		HibernateUtil.closeSession();
		//for (Reimbursement r : allList) {
            //not needed in this case to print only  the loop  all reimbursements if you are only getting one item or select items from the list
        
		return allList;
	}
	
	
	public Reimbursement getReById(int id) {
		Session ses = HibernateUtil.getSession();
		
		Reimbursement rId = ses.get(Reimbursement.class, id);
		
		HibernateUtil.closeSession();
		
		return rId;

}
	//mark  said I need a method to update the reimbursements
	public void updateRe(Reimbursement reimbursement)
	{
		Session ses = HibernateUtil.getSession();
		//I have to use transactions had to get help havent used this much
		Transaction tx = ses.beginTransaction();
		if(!tx.isActive())
		{
			tx.begin();
		}
		System.out.println("*MERGE*CHANGES*");
		ses.merge(reimbursement);
		System.out.println("*MERGE*CHANGES*");
		tx.commit();
		HibernateUtil.closeSession();
	}
	
}