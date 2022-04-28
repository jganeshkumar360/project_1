package com.green;

public class If_Condition_Loop {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			System.out.println(i);

		}

		for (int i = 0; i < 5; i++) {

			for (int j = 1; j < i; j++) {

				System.out.println(j);

			}

			System.out.println("");
			
			
		}
	
	System.out.println("**********************************");
	
	int a = 10;
	while (a >= 5) { 
		System.out.println("Before ="+a);
		
		a--;
		
	System.out.println("After ="+a);
	}

	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	
	int i = 10;
	do { 
		
		System.out.println("Before="+i);
		
		i--;
		
		System.out.println("After ="+i);
	} 
	while(i>5);
		
	
	}
}






