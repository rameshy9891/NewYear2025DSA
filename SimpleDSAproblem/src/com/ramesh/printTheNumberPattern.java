package com.ramesh;

import java.util.Scanner;

public class printTheNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number input");
		
		Scanner  sc= new Scanner(System.in);
		
		int numb= sc.nextInt();
		
		for(int i=1; i<=numb; i++ ) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}

}
