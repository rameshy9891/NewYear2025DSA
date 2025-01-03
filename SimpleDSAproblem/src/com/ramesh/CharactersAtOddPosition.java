package com.ramesh;

import java.util.Scanner;

public class CharactersAtOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// odd position means -> if we string or char[] array like - ramesh 1 , 3 ,5 we have to print 
		// result- aeh;
		
		System.out.println("enter the string which you want to character print in odd position");
		
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		
		char[] strArry=str.toCharArray();
		
		
		for(int i=0; i<=strArry.length-1; i++) {
			
			if(i%2==1) {
				
			
			System.out.println(strArry[i]);
			}
		}

	}

}
