package org.pgm;

public class StringOccurence {
	public static void main(String[] args) {

		String a = "Java Class Java Session";
		String b = "Java";
		int count = 0;

		String[] s = a.split(" ");
		for (String x : s) {
			
			if (b.equals(x)) {
				count++;
			}
		}
		
		System.out.println("Java Count :"+count);

	}
}
