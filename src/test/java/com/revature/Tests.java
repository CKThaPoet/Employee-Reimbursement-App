package com.revature;

import static org.junit.Assert.assertTrue;


import org.junit.Test;


import com.revature.services.LoginService;

public class Tests {
	
	LoginService ls = new LoginService();
	
	@Test
	public void testValidLogin() {
		System.out.println("Trying login testing");
	
	assertTrue(ls.login("Regina_Rich", "Rich2021"));
	
	}
}
