package com.ramesh;

import java.util.Scanner;

public class VowelAndConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the string in which you want to check vowel and consonant");
		
		Scanner sc=  new Scanner(System.in);
		
		String str= sc.nextLine().toLowerCase();
		
		
		char[] strArr= str.toCharArray();
		
		int countVowel=0;
		int consonant=0;
		
		for(int i=0; i<=strArr.length-1; i++) {
			if(strArr[i]=='a' || strArr[i]=='e' ||strArr[i]=='i' ||strArr[i]=='o' ||strArr[i]=='u' ) {
				countVowel++;
			}
			else {
				consonant++;
			}
		}
		
		System.out.println("Vowel => "+ countVowel  +"  Consonant =>"+ consonant);
		

	}

}
