package Annotations_1;

import org.testng.annotations.Test;

public class Proirity_Concept {
	
	@Test (priority= -1)
	private void usernmae() {
		System.out.println("username");

	}
	
	@Test //default vaule = 0
	private void password() {
		System.out.println("Password");

	}
	
	@Test(priority= 1)
	private void login() {
		System.out.println("Login");

	}
	
	@Test(priority= 2)
	private void Seraching() {
		System.out.println("Searching");
		
	}

	


}
