package org.pgm;

public class ReverseTheDigits {
public static void main(String[] args) {
	
	int num = 12345;
	int rem = 0;
	int res = 0;
	while(num>0)
	{
		rem = num%10;
		res = (res*10)+rem;
		num = num/10;
	}
System.out.println("Reverse:"+res);	
}
}


//12345>0t      rem=12345%10--5    res=0*10+5=5            num=12345/10--1234 
//1234>0t       rem=1234%10--4     res=5*10+4=54           num=1234/10--123
//123>0t        rem=123%10--3      res=54*10+3=543         num=123/10--12
//12>0t         rem=12%10--2       res=543*10+2=5432       num=12/10--1
//1>0t          rem=1%10--1        res=5432*10+1=54321     num=1/10--0