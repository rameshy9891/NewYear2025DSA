package com.ramesh;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class DetectPalindrome {
	
	//input-naman- output-naman - palidrome
	//input- aman- output-nama - not palidrome

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("pass a input which you want to check palidrome");
		
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		char[] strArr= str.toCharArray();
		
		String reverseString= checkIfstring(str);
		
		
		
		for(int i=0; i<=reverseString.length()-1; i++) {
			System.out.print(reverseString.charAt(i));
		}
		
		if(reverseString.equals(str)) {
			System.out.print("  =>yes it is palidrome");
		}
		else {
			System.out.println("  =>no it is not a palidrome");
		}

	}

	private static String checkIfstring(String str) {
		// TODO Auto-generated method stub
		String reverseStr="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr=reverseStr+str.charAt(i);
		}
		return reverseStr;
	}

}
