package com.ramesh;

import java.util.Scanner;

public class MaximumInTheArray {
	public static void main(String[] args) {
		
		System.out.println("please enter the length of array");
		
		Scanner sc = new Scanner(System.in);
		
		int length= sc.nextInt();
	    
		int[] array= new int[length];
		
		System.out.println("please enter the array");
		
		for(int i=0; i<length; i++) {
			array[i]= sc.nextInt();
		}
		
		int maxnumber=0;
		
		for(int j=0; j<length; j++) {
			if(maxnumber<array[j]) {
				maxnumber=array[j];
			}
		}
		
		System.out.println("maximum number is:=" + maxnumber);
		
		sc.close();
	}

}
