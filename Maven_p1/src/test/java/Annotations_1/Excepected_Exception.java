package Annotations_1;

import org.testng.annotations.Test;

public class Excepected_Exception {
	
	
	@Test(expectedExceptions = NullPointerException.class)
	private void calculator() {
		
		int a = 10;
		System.out.println(a/0);
		System.out.println("Display The OutPut");

	}

}
