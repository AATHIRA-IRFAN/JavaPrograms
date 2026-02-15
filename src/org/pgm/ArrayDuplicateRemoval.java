package org.pgm;

import java.util.ArrayList;
import java.util.List;

public class ArrayDuplicateRemoval {
public static void main(String[] args) {
	int a[]= {10,20,30,20,30,40};
	List<Integer> l = new ArrayList<>();
	for (Integer x : a) {
		if(!l.contains(x)) {
			l.add(x);
		}
	}
		
	System.out.println(l);
		
}
}
