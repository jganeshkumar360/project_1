package com.green;

public class String_Basic_Keywords {

	public static void main(String[] args) {
		
		
	String g = "Happy New Year"	;
			int i = g.length();
			System.out.println("lenth:"+i);
			
			
			
		 boolean equals = g.equals("Happy new Year");
		 System.out.println("equals:"+equals);
		 
		 
		boolean equalsIgnoreCase = g.equalsIgnoreCase("happy new year");
		System.out.println("equalsignorecase:"+equalsIgnoreCase);
		
		String d = g.toUpperCase();
		System.out.println("touppercase:"+d);
		
		String a = g.toLowerCase();
		System.out.println("tolowercase:"+a);

		boolean startsWith = g.startsWith("Happy");
		System.out.println("startswith:"+startsWith);
		
		boolean endsWith = g.endsWith("year");
		System.out.println("endswith:"+endsWith);
		
		
		int indexOf = g.indexOf("H");
		System.out.println("indexof:"+indexOf);
		
	    int indexOf0 = g.indexOf("a");
		System.out.println("indexof:"+indexOf0);
		
		
		int indexOf1 = g.indexOf("p");
		System.out.println("indexof:"+indexOf1);
		
		
		int indexOf2 = g.indexOf("y");
		System.out.println("indexof:"+indexOf2);
		
		
		int indexOf3 = g.indexOf("N");
		System.out.println("indexof:"+indexOf3);
		
		
		int indexOf4 = g.indexOf("e");
		System.out.println("indexof:"+indexOf4);
		
		
		int indexOf5 = g.indexOf("w");
		System.out.println("indexof:"+indexOf5);
		
		int indexOf6 = g.indexOf("Y");
		System.out.println("indexof:"+indexOf6);
		
		int indexOf7 = g.indexOf("e");
		System.out.println("indexof:"+indexOf7);
		
		int indexOf8 = g.indexOf("r");
		System.out.println("indexof:"+indexOf8);
		
		int lastIndexOf = g.lastIndexOf("r");
		System.out.println("lastindexof:"+lastIndexOf);
		
		char charAt = g.charAt(4);
		System.out.println("charat:"+charAt);
		
		String substring = g.substring(1, 12);
		System.out.println("substring:"+substring);
		
		boolean contains = g.contains("Year");
		System.out.println("contains:"+contains);
		
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
