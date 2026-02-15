package org.pgm;
public class StringReverseEachWord {
	public static void main(String[] args) {	
		String s= "welcome to java class";
		String res="";
		String[]a = s.split(" ");
		for (String x : a) {
			String rev="";
			for (int i = x.length()-1; i >=0; i--) {
				char b = x.charAt(i);
				rev=rev+b;
			}
			res=res+rev+" ";
		}
		System.out.println(res);
	}
}


//1st iteration     emoclew      res=emoclew
//2nd iteration     ot           res=emoclew ot
//3rd iteration     avaj         res=emocleew ot avaj