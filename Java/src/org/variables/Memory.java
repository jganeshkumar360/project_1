package org.variables;

public class Memory {

	public static void main(String[] args) {
		
		System.out.println("********************IMMUTABLE**********************");
		
		String  s = "Mobiles";
		System.out.println(System.identityHashCode(s));
		
		
		String s1 = "Mobiles";
		System.out.println(System.identityHashCode(s1));
		
		s=s+s1;
		System.out.println("concadinate:"+System.identityHashCode(s));
		
		
		System.out.println("*********************Mutable***********************");
		
				
		StringBuffer b = new StringBuffer("Mobiles");
		System.out.println(System.identityHashCode(b));
		
		
		StringBuffer b1 = new StringBuffer("Mobile");
		System.out.println(System.identityHashCode(b1));
		
		StringBuffer b2 = new StringBuffer("Mobiles");
		System.out.println("Append :"+System.identityHashCode(b2));
		
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
