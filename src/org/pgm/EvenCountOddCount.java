package org.pgm;

public class EvenCountOddCount {
public static void main(String[] args) {
	int evencount =0 ;
	int oddcount =0 ;
	for (int i = 0; i <=10; i++) {
		if (i%2==0) {
			evencount=evencount+1;	
		}
		else {
			oddcount=oddcount+1;	
		}
		}
	System.out.println("Even count:"+evencount);
	System.out.println("Odd count:"+oddcount);
}
}


	//i      i<=10    i%2==0     evencount=evencount+1   oddcount=oddcount+1
	//i=0    0<=10t   0%2==0t    evencount=0+1 =1 
	//i=1    1<=10t   1%2!=0f   					     oddcount=0+1 =1 
	//i=2    2<=10t   2%2==0t    evencount=1+1 =2
	//i=3    3<=10t   3%2!=0f   					     oddcount=1+1 =2 
	//i=4    4<=10t   4%2==0t    evencount=2+1 =3
	//i=5    5<=10t   5%2!=0f   					     oddcount=2+1 =3 
	//i=6    6<=10t   6%2==0t    evencount=3+1 =4
	//i=7    7<=10t   7%2!=0f    					     oddcount=3+1 =4 
	//i=8    8<=10t   8%2==0t    evencount=4+1 =5
	//i=9    9<=10t   9%2!=0f    					     oddcount=4+1 =5 
	//i=10   10<=10t  10%2==0t   evencount=5+1 =6
	//i=11   11<=11f---------loop stop----
