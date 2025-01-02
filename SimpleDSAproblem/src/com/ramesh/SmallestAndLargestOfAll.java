package com.ramesh;

import java.util.Scanner;

public class SmallestAndLargestOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take input of length of array and array in which you want to find maximum and minimum 
		System.out.println("take of input of length of array");
		
		Scanner sc= new Scanner(System.in);
		
		int length = sc.nextInt();
		
		int[] arr= new int[length];
		
		for(int i=0; i<=length-1; i++ ) {
			
			arr[i]=sc.nextInt();
			
		}
		int max=0;
		int min=9999;
		
		  for (int i : arr) {
	            if (i > max) {
	                max = i;
	            }
	            if (i < min) {
	                min = i;
	            }
	        }
		
		System.out.println(min);
		System.out.println(max);
		

	}

}
