package com.ramesh;

import java.util.Scanner;

public class StringPrint2 {
	
	public static void main(String[] args) {
		
		System.out.println("enter the string");
		
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		for(int i=0; i<=str.length()-1; i++) {
			System.out.print(str.charAt(i));
		}
	}

}
