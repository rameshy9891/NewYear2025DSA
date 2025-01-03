package com.ramesh;

import java.util.Scanner;

public class PrintCharactersOfAStringInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we have to print reverse string
		
		System.out.println("enter the length of character");
		
		Scanner sc= new Scanner(System.in);
		
		int length= sc.nextInt();
		
		sc.nextLine();
		
		String str= sc.nextLine();
		
		char[] strArray= str.toCharArray();
		
		for(int i=length-1; i>=0; i--) {
			
			System.out.println(strArray[i]);
		}

	}

}
