package com.revature;

import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementStatusDAO;
import com.revature.daos.ReimbursementTypeDAO;
import com.revature.daos.UserDAO;
import com.revature.models.Reimbursement;
import com.revature.models.ReimbursementStatus;
import com.revature.models.ReimbursementType;
import com.revature.models.User;

import com.revature.daos.UserRoleDAO;
import com.revature.models.UserRole;

public class Lanucher {

	private static UserDAO uDAO = new UserDAO();
	private static UserRoleDAO urDAO = new UserRoleDAO();
	private static ReimbursementStatusDAO rsDAO = new ReimbursementStatusDAO(); 
	private static ReimbursementTypeDAO rtDAO = new ReimbursementTypeDAO();
	private static ReimbursementDAO rDAO = new ReimbursementDAO();
	
	public static void main(String[] args) {
		
		//add a new user 
		//User u =new User();
		//u.setUser_first_name(null);
		
		//create the user object
//		User u1 = new User("Regina_Rich", "Rich2021", "Regina", "Rich", "Regina_Rich_@revature.com");
//		
//		User u2 = new User("John_Doe", "John2021", "John", "Doe", "John_Doe_@yahoo.com" );
//		
//		User u3 = new User("Mary_Jane", "Mary2021", "Mary", "Jane", "Mary_Jane_@gmail.com");
//		
//		User u4 = new User("Mike_Larry", "Mike2021", "Mike", "Larry", "Mike_Larry_@hotmail.com");
		
		//this doesnt work cant figure out how to set the ids
//			u1.setUser_role(new UserRole("Finance Manager"));
//			u2.setUser_role(new UserRole("Employee"));
//			u3.setUser_role(new UserRole("Employee"));
//			u4.setUser_role(new UserRole("Employee"));
		
//		//set user using the dao methods
		
//		uDAO.addUser(u1);
//		uDAO.addUser(u2);
//		uDAO.addUser(u3);
//		uDAO.addUser(u4);
		
		
		//create user role objects
//		UserRole ur1 = new UserRole("Finance Manager");
//		UserRole ur2 = new UserRole("Employee");
		
		//add roles
//		urDAO.addRole(ur1);
//		urDAO.addRole(ur2);
//		
//		ReimbursementType rt1 = new ReimbursementType("Food");
//		ReimbursementType rt2 = new ReimbursementType("Lodging");
//		ReimbursementType rt3 = new ReimbursementType("Travel");
//		ReimbursementType rt4 = new ReimbursementType("Other");
//		
//		rtDAO.addType(rt1);
//		rtDAO.addType(rt2);
//		rtDAO.addType(rt3);
//		rtDAO.addType(rt4);
		
		
//		ReimbursementStatus rs1 = new ReimbursementStatus("Pending");
//		ReimbursementStatus rs2 = new ReimbursementStatus("Approved");
//		ReimbursementStatus rs3 = new ReimbursementStatus("Denied");
		
//		rsDAO.addStatus(rs1);
//		rsDAO.addStatus(rs2);
//		rsDAO.addStatus(rs3);
		
//		Reimbursement r1 = new Reimbursement(2,  2021-07-01 18:10:25,   200,3, "Travel expenses to go to training in Georiga", 1 , 2021-07-01 17:10:25,2  );
//		Reimbursement r2 = new Reimbursement(3,  2021-07-01 17:10:25,   350, 2, "Hotel expenses to go to training in New York",  , 1);
//		Reimbursement r3 = new Reimbursement(4,  2021-07-02 16:10:25,   100, 1, "Food expenses for fourth of July party", 1 , 2021-07-03 16:10:25,3 );
//		
//		rDAO.addReimbursement(r1);
//		rDAO.addReimbursement(r2);
//		rDAO.addReimbursement(r3);
	}

}
