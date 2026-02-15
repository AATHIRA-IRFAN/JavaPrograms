package org.pgm;

public class PatternHalfPyramidProgram {
public static void main(String[] args) {
	for (int i = 1; i <=3; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}


//i=1      1<=3t     j=0    0<1t     *         j=0+1=1   
//                   j=1    1<1f---nextline--------------i=1+1=2

//i=2      2<=3t     j=0    0<2t     *         j=0+1=1
//                   j=1    1<2t     *         j=1+1=2
//                   j=2    2<2f---nextline--------------i=2+1=3

//i=2      3<=3t     j=0    0<2t     *         j=0+1=1
//                   j=1    1<2t     *         j=1+1=2
//                   j=2    2<3t     *         j=2+1=3
//                          3<3f---nextline--------------i=3+1=4
//i=4       4<=3f
