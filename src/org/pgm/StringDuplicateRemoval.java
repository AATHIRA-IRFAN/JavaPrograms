package org.pgm;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicateRemoval {
	public static void main(String[] args) {
			
String s="HelloJava";
String res="";
Set<Character> s1 = new LinkedHashSet<>();
for (int i = 0; i < s.length(); i++) {
	char a = s.charAt(i);
	s1.add(a);
}
	for (Character c : s1) {
		res=res+c;
	}
	
	System.out.println("Duplicate removed: "+res);
	}
}
