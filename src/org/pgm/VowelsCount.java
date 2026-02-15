package org.pgm;

public class VowelsCount {
public static void main(String[] args) {
	String s = "welcome to java class";
	int b=0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
			b++;
		}
		else {
	
		}
	}
	System.out.println("Vowels Count:"+b);
}
	
		
}
