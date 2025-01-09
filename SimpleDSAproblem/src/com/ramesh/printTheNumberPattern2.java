package com.ramesh;

import java.util.Scanner;

public class printTheNumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			// TODO Auto-generated method stub
			
			System.out.println("enter the number input");
			
			Scanner  sc= new Scanner(System.in);
			
			int numb= sc.nextInt();
			
			for(int i=1; i<=numb; i++ ) {
				for(int j=i; j<=numb; j++) {
					
					System.out.print("# ");
				}
				
				System.out.println();
			}


	}

}
