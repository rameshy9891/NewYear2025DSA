package com.ramesh;

import java.util.Scanner;

public class RameshSchoolHurray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Description :=
		 * you are provided an integer N
		 * For all number in range [1,N] including n you have to print a string as per the following rules
		 * 1- Print Ramesh School, if the number is multiple of both 5 and 7
		 * 2- Print Ramesh . if the number is a multiple of 7 only
		 * 3- print School , if the number is a multiple of 5 only.
		 * 4- Else in all other cases print Hurry*/
		
		System.out.println("enter the number here for input");
		Scanner sc= new Scanner(System.in);
		
		int number= sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println("Ramesh School");
			}
			else if(i%7== 0) {
				System.out.println("Ramesh");
			}
			else if(i%5==0) {
				System.out.println("School");
			}
			else {
				System.out.println("Hurry");
			}
		}
		
		System.out.println("all result good ");
		
		

	}

}
