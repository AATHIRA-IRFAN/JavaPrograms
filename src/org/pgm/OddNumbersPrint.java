package org.pgm;

public class OddNumbersPrint {
public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if (i%2==1) {
				System.out.println(i);	
			}
		}
		
		//for(int i=1;i<=10;i=i+2){
		//System.out.println(i);	
		//}
	}
	}
	//i      i<=10    i%2==1     i=i+1
	//i=1    1<=10t   1%2==1f    i=1+1 =2
	//i=2    2<=10t   2%2!=1f    i=2+1 =3
	//i=3    3<=10t   3%2==1t    i=3+1 =4
	//i=4    4<=10t   4%2!=1f    i=4+1 =5
	//i=5    5<=10t   5%2==1t    i=5+1 =6
	//i=6    6<=10t   6%2!=1f    i=6+1 =7
	//i=7    7<=10t   7%2==1t    i=7+1 =8
	//i=8    8<=10t   8%2!=1f    i=8+1 =9
	//i=9    9<=10t   9%2==1t    i=9+1 =10
	//i=10   10<=10t  10%2!=1f   i=10+1=11
	//i=11   11<=11f---------loop stop----
