package com.ramesh;

import java.util.Scanner;

public class Pattern {
	
	/*  
	 *   ####
	 *   ####
	 *   ####    */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the number for simple pattern");
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		for(int i=0; i<=num-1; i++) {
			for(int j=0; j<=num-1;  j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
		

	}

}
