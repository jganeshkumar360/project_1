package Annotations_1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameetrized_Test {
	
	@Test
	@Parameters({ "username", "password"})
	private void Credentials(String username, String password) {
		
		System.out.println("Username :" + username);
		
		System.out.println("Password :" + password);
	

	}
	

}
