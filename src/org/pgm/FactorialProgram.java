package org.pgm;

public class FactorialProgram {
public static void main(String[] args) {
	int n = 5;
	int fact = 1;
	for (int i = 1; i <=n; i++) {
		fact=fact*i;
	}
	System.out.println("Factorial:"+fact);
	
}
}
//i      i<=n     fact= fact*i    i=i+1
//i=1    1<=5t    fact = 1*1=1    i=1+1 =2
//i=2    2<=5t    fact = 1*2=2    i=2+1 =3
//i=3    3<=5t    fact = 2*3=6    i=3+1 =4
//i=4    4<=5t    fact = 6*4=24   i=4+1 =5
//i=5    5<=5t    fact = 24*5=120 i=5+1 =6
//i=6    6<=5f--------loop stop---------