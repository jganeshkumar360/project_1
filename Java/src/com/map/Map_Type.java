package com.map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Map_Type {
	
	public static void main(String[] args) {
		
	Set<Integer> d = new HashSet<Integer>();
	
	d.add(28);
	d.add(33);
	d.add(47);
	d.add(74);
	d.add(null);
	d.add(null);
	System.out.println("HashSet:"+d);
	
	 Set<Integer> ab = new LinkedHashSet<Integer>();
	
	ab.add(28);
	ab.add(33);
	ab.add(47);
	ab.add(74);
	ab.add(null);
	ab.add(null);
	System.out.println("LinkedHashSet:"+ab);
		
    Set<Integer> ga = new TreeSet<Integer>();
	
	ga.add(28);
	ga.add(33);
	ga.add(47);
	ga.add(74);
	
	try {
		ga.add(null);
		
	} catch (Exception e) {
		System.out.println("TreeSet:"+ga);

	
	
	System.out.println("HashSet:"+e);
		
	
	
	}
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
