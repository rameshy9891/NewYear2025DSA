package com.ramesh;

import java.util.Scanner;

public class SubstringUnderCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check substring with same corecter start and end with same charater
		
		//like - ababa- a,aba,ababa,b,bab,a,aba,b,a- 9 is the output
		
		System.out.println("enter the string as a input");
		
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		int n= str.length();
		
		int count=0;
		
		for(int i=0; i<=n-1; i++) {
			
			
			
			for(int j=i; j<=n-1; j++) {
				
				
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
					
				
			
			}
		}
		
		System.out.println(count);

	}

}
