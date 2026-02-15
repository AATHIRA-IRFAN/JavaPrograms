package org.pgm;
public class FibonacciSeriesProgram {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	
	for (int i = 1; i <= 10; i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
}
}
//0
//1
//i=1      1<=10t      c=0+1=1       a=1   b=1    i=1+1=2
//i=2      2<=10t      c=1+1=2       a=1   b=2    i=2+1=3
//i=3      3<=10t      c=1+2=3       a=2   b=3    i=3+1=4
//i=4      4<=10t      c=2+3=5       a=3   b=5    i=4+1=5
//i=5      5<=10t      c=3+5=8       a=5   b=8    i=5+1=6
//i=6      6<=10t      c=5+8=13      a=8   b=13   i=6+1=7
//i=7      7<=10t      c=8+13=21     a=13  b=21   i=7+1=8
//i=8      8<=10t      c=13+21=34    a=21  b=34   i=8+1=9
//i=9      9<=10t      c=21+34=55    a=34  b=55   i=9+1=10
//i=10     10<=10t     c=34+55=89    a=55  b=89   i=10+1=11
//i=11     11<=10f  ------------loop stop-----------------

	
	
	
	

