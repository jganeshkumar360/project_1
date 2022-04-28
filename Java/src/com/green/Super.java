package com.green;

public class Super extends Nova {
	
	int id=100;
	private void num () {
		System.out.println(super.id);
		System.out.println(this.id);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Super s = new Super();
		s.num();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
