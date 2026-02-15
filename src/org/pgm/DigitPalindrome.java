package org.pgm;

public class DigitPalindrome {
	public static void main(String[] args) {
		
		int num = 121;
		int n = num;
		int rem = 0;
		int res = 0;
		while(num>0)
		{
			rem = num%10;
			res = (res*10)+rem;
			num = num/10;
		}
	System.out.println("Reverse:"+res);	
	if (n==res) {
		System.out.println("Palindrome");	
	}
	else {
		System.out.println("Non-Palindrome");	
	}
	
	
	}
	}

	//121>0t        rem=121%10--1      res=0*10+1=1        num=121/10--12
	//12>0t         rem=12%10--2       res=1*10+2=12       num=12/10--1
	//1>0t          rem=1%10--1        res=12*10+1=121     num=1/10--0
