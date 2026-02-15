package org.pgm;

public class StringReverse {
public static void main(String[] args) {
	String s = "Python";
	String res = "";
	for (int i = s.length()-1; i >=0; i--) {
		char c= s.charAt(i);
		res=res+c;
	}
	System.out.println("String:"+s);
	System.out.println("String Reverse:"+res);
	
}
}


//i=6-1=5     5>=0t       c=n    res=""+n             i=5-1=4
//            4>=0t       c=o    res=n+o              i=4-1=3
//            3>=0t       c=h    res=n+o+h            i=3-1=2
//            2>=0t       c=t    res=n+o+h+t          i=2-1=1
//            1>=0t       c=y    res=n+o+h+t+y        i=1-1=0
//            0>=0t       c=p    res=n+o+h+t+y+p      i=0-1=-1
//            -1>=0f       -----------loop stop--------------