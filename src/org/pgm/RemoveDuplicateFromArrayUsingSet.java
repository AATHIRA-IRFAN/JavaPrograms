package org.pgm;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromArrayUsingSet {
public static void main(String[] args) {
		
		int [] a = {10,20,50,30,40,40,30,50};
		
		Set <Integer> s = new TreeSet<Integer>();
		
		for (Integer x : a) {
			s.add(x);
		}
 
		System.out.println(s);
	
	
	
	
	
	}
}
