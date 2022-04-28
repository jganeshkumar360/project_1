package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Types1 {
	
	
	public static void main(String[] args) {
		
		Map <Integer,String> g = new HashMap<Integer,String> ();
		
		
		g.put(1, "ishu");
		g.put(2, "54");
		g.put(2, "83");
		g.put(3, "null");
		g.put(4, "null");
		g.put(null, "Basker");
		g.put(null, "Manju");
		
		System.out.println("HashMap:"+g);
		
		int size = g.size();
		System.out.println("size:"+size);
		
		Set<Integer> Keyset = g.keySet();
		System.out.println("Keyset:"+Keyset);
		
		Collection<String> values = g.values();
		System.out.println("Values:"+ values);
		
		boolean containsKey = g.containsKey(3);
		System.out.println("containskey:"+containsKey);
		
		@SuppressWarnings("unused")
		boolean containsvalue = g.containsValue("manju");
		System.out.println("containskey:"+containsKey);
		
		Set <Entry <Integer,String>> EntrySet = g.entrySet(); 
		System.out.println("entryset;"+EntrySet);
		for(Entry<Integer,String> k:EntrySet){
		System.out.println(k);
		}
	Map <Integer,String> T = new Hashtable<Integer, String>();
	
	T.put (1, "ishu");
	T.put (2, "54");
	T.put (2, "83");
	 System.out.println("hashtable"+T);
	}
	

}
