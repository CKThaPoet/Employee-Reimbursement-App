package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Reimbursement;
import com.revature.models.ReimbursementType;

import com.revature.utils.HibernateUtil;

public class ReimbursementTypeDAO {
	
	public void addType(ReimbursementType reimbursementtype) {
		//open a new hibernate session
		Session ses = HibernateUtil.getSession();
		
		//this is to insert the new role into the table by using the save method
		ses.save(reimbursementtype);
		
		//now close the hibernate session
		HibernateUtil.closeSession();

}
	
	public ReimbursementType getReType(int id) {
		//open a new sesssion
		Session ses = HibernateUtil.getSession();
		//get the type code based on the id
		ReimbursementType type = ses.get(ReimbursementType.class, id);
		//close the session
//		ses.close();
		HibernateUtil.closeSession();
		//return the type object
		return type;
	}
	
	
	public List<ReimbursementType> getAllReType() 
	{
		//open a new session
		Session ses = HibernateUtil.getSession();
		//geta list of typees
		List<ReimbursementType> TList = ses.createQuery("from ReimbursementType").list();
		//close the session
		HibernateUtil.closeSession();
		//rethrn the list of typees
		return TList;
	}

	
	public void insertType(Reimbursement newT) 
	{
		//open a new session
		Session ses = HibernateUtil.getSession();
		//insert the new type into the table
		ses.save(newT);
		//close the session
		HibernateUtil.closeSession();
	}
}