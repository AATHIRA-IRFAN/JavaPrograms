package org.pgm;

public class SumOfArrayProgram {
	public static void main(String[] args) {
		
		
		int sum = 0;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i <10; i++) {
			sum=sum+a[i];	
			}
			
			System.out.println("Sum:"+sum);
			}
			}
			
			
			
			//i      i<10     sum=sum+a[i]      i++
			//i=0    0<10t    sum=0+1 =1     i=0+1=1
			//i=1    1<10t    sum=1+2 =3	  i=1+1=2		    
			//i=2    2<10t    sum=3+3 =3     i=2+1=3	
			//i=3    3<10t    sum=6+4 =10	  i=3+1=4				
			//i=4    4<10t    sum=10+5 =15   i=4+1=5	
			//i=5    5<10t    sum=15+6 =21	  i=5+1=6				
			//i=6    6<10t    sum=21+7 =28   i=6+1=7	
			//i=7    7<10t    sum=28+8 =36	  i=7+1=8				 
			//i=8    8<10t    sum=36+9 =45   i=8+1=9	
			//i=9    9<10t    sum=45+10 =55  i=9+1=10				
			//i=10   10<10t   ---------loop stop----
			
			
			
