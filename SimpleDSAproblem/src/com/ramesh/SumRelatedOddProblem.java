package com.ramesh;

import java.util.Scanner;

public class SumRelatedOddProblem {
	
	/* you are given a number n, you need to find sum of all the odd number s which are then equal to n*/
	
	// sample input 4 sample output 4
	// sample input 3 sample output 4
	
	//hint=> number less than or equal to 4 are:= [1 2 3 4]
	// Even Number less than or equal to 4 are , [1 3] , whose sum is = 1 + 3= 4 
	
	public static void main(String[] args) {
		
		System.out.println("plese enter the number which number below and equal odd number sum you want");
		
		Scanner sc = new Scanner(System.in);
		
		int number= sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=number; i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
