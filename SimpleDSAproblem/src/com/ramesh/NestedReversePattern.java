package com.ramesh;

import java.util.Scanner;

public class NestedReversePattern {
	
	// input - 4  
	/*
	 * 4 3 2 1
	 * 4 3 2 1
	 * 4 3 2 1
	 * 4 3 2 1
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the input of n");
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=n; j>=1; j--) {
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
		

	}

}
