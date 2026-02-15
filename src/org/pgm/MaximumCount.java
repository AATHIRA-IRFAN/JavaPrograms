package org.pgm;

public class MaximumCount {
public static void main(String[] args) {
	int a[]= {5,4,3,7,2,1};
	int max = a[0];
 for (int i = 0; i < a.length; i++) {
	if (a[i]>max) {
		max=a[i];
	}
}
 System.out.println(max);
}
}



//a[0]=5
//i=0      0<6t      a[0]5>6f                i=0+1=1
//i=1      1<6t      a[1]4>6f                i=1+1=2
//i=2      2<6t      a[2]3>6f                i=2+1=3
//i=3      3<6t      a[3]7>6f   max=a[3]=7   i=3+1=4
//i=4      4<6t      a[4]2>6f                i=4+1=5
//i=5      5<6t      a[5]1>6t                i=5+1=6
//i=6      6<6f---------loop stop-----------------
