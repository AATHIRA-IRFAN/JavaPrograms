package org.pgm;

public class EvenNumbersPrint {
	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			if (i%2==0) {
				System.out.println(i);	
			}
		}
		//for(int i=0;i<=10;i=i+2){
		//System.out.println(i);	
		//}
		
	}
	}
	//i      i<=10    i%2==0     i=i+1
	//i=0    0<=10t   0%2==0t    i=0+1 =1 
	//i=1    1<=10t   1%2!=0f    i=1+1 =2
	//i=2    2<=10t   2%2==0t    i=2+1 =3
	//i=3    3<=10t   3%2!=0f    i=3+1 =4
	//i=4    4<=10t   4%2==0t    i=4+1 =5
	//i=5    5<=10t   5%2!=0f    i=5+1 =6
	//i=6    6<=10t   6%2==0t    i=6+1 =7
	//i=7    7<=10t   7%2!=0f    i=7+1 =8
	//i=8    8<=10t   8%2==0t    i=8+1 =9
	//i=9    9<=10t   9%2!=0f    i=9+1 =10
	//i=10   10<=10t  10%2==0t   i=10+1=11
	//i=11   11<=11f---------loop stop----
