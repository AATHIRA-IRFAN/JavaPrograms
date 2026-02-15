package org.pgm;

public class UpperLowerSpecialCharCount {
	public static void main(String[] args) {
		String s = "JavaClass@123";
		int uppercount=0;
		int lowercount=0;
		int digitcount=0;
		int specialcount=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c>=65 && c<=90) {
				uppercount++;
			}
			else if (c>=97 && c<=122) {
				lowercount++;
			}
			else if (c>=48 && c<=57) {
				digitcount++;
			}
			else {
		        specialcount++;
			}
		}
		System.out.println("Uppercase Count:"+uppercount);
		System.out.println("Lowercase Count:"+lowercount);
		System.out.println("Numbers Count:"+digitcount);
		System.out.println("Special Character Count:"+specialcount);
	}
		
}
