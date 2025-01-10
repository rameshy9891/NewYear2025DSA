package com.ramesh;

import java.util.Scanner;

public class PrintThePatternN {
	
	/*  n*n 
	 * 1 2 3 
	 * 4 5 6
	 * 7 8 9  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("please enter the input");
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		
		

	}

}
