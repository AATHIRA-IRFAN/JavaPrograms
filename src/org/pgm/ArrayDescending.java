package org.pgm;

public class ArrayDescending {
	public static void main(String[] args) {
		int a[] = {10,30,20,50,40};
		System.out.println("Before sorting array");
		for (int i : a) {
		System.out.println(i);		
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int tem = a[i];
					a[i]=a[j];
					a[j]=tem;
		         }
			}
		}
		System.out.println("After sorting array");	
		for (int i : a) {
			System.out.println(i);
		}
	}
}
