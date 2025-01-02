package com.ramesh;

import java.util.Scanner;

public class PrintCharactersofaString {
	
	public static void main(String[] args) {
		
		System.out.println("enter the lenght of the string ");
		
		Scanner sc= new Scanner(System.in);
		
		int length= sc.nextInt();
		sc.nextLine();
		
		String str= sc.nextLine();
		
		char[] strArray=str.toCharArray();
		
		for(char c: strArray) {
			System.out.println(c);
		}
	}

}
