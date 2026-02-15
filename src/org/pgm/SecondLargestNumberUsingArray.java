package org.pgm;

public class SecondLargestNumberUsingArray {
public static void main(String[] args) {
	int a[] = {10,20,40,70,60};
	int largest, secondLargest;
	   if (a[0] > a[1]) {
	       largest = a[0];
	       secondLargest = a[1];
	        } 
	   else {
	        largest = a[1];
	        secondLargest = a[0];
	        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > largest) {
            secondLargest = largest;
              largest = a[i];
              } 
        else if (a[i] > secondLargest && a[i] != largest) {
	        secondLargest = a[i];
	            }
	        }
	     System.out.println(secondLargest);
}
}



//2<5     a[2]40>20t      secondLar=20   largest=40   i=2+1=3
//3<5     a[3]70>40       secondLar=40   largest=70   i=3+1=4
//4<5     a[4]60>70 ---- else if(a[4]60>40t && !a[4]60=lajrgest->t  
                                                     //secondLar=a[4]60
