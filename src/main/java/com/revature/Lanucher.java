package com.revature;

import com.revature.daos.ReimbursementTypeDAO;
import com.revature.daos.UserDAO;
import com.revature.models.ReimbursementType;
import com.revature.models.User;

import com.revature.daos.UserRoleDAO;
import com.revature.models.UserRole;

public class Lanucher {

	private static UserDAO uDAO = new UserDAO();
	private static UserRoleDAO rDAO = new UserRoleDAO();
	//private static ReimbursementStatusDAO rsDAO = new ReimbursementStatusDAO(); //will create this class at lunch today
	private static ReimbursementTypeDAO rtDAO = new ReimbursementTypeDAO();
	
	public static void main(String[] args) {
		
		//add a new user 
		//User u =new User();
		//u.setUser_first_name(null);
		
		//create the user object
//		User u1 = new User("Regina_Rich", "Rich2021", "Regina", "Rich", "Regina_Rich_@revature.com");
//		User u2 = new User("John_Doe", "John2021", "John", "Doe", "John_Doe_@yahoo.com");
//		User u3 = new User("Mary_Jane", "Mary2021", "Mary", "Jane", "Mary_Jane_@gmail.com");
//		User u4 = new User("Mike_Larry", "Mike2021", "Mike", "Larry", "Mike_Larry_@hotmail.com");
//		//set user using the dao methods
//		uDAO.addUser(u1);
//		uDAO.addUser(u2);
//		uDAO.addUser(u3);
//		uDAO.addUser(u4);
		
		
//		CatLover', 'John2021', 'John', 'Doe', 'John_Doe_@yahoo.com', ),
//		 ( , 'Doggypugs', 'Mary2021', 'Mary', 'Jane', 'Mary_Jane_@gmail.com', ),
//		 ( , 'NinjaTurtle', 'Mike2021', 'Mike', 'Larry', 'Mike_Larry_@hotmail.com', )
//		 ( , 'MoMoney', 'Rich2021', 'Regina', 'Rich', 'Regina_Rich_@revature.com', );
		
		//create user role objects
//		UserRole ur1 = new UserRole("Finance Manager");
//		UserRole ur2 = new UserRole("Employee");
		
		//add roles
//		rDAO.addRole(ur1);
//		rDAO.addRole(ur2);
		
		ReimbursementType rt1 = new ReimbursementType("Food");
		ReimbursementType rt2 = new ReimbursementType("Lodging");
		ReimbursementType rt3 = new ReimbursementType("Travel");
		ReimbursementType rt4 = new ReimbursementType("Other");
		rtDAO.addType(rt1);
		rtDAO.addType(rt2);
		rtDAO.addType(rt3);
		rtDAO.addType(rt4);
	}

}
