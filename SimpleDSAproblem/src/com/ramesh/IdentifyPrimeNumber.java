package com.ramesh;

import java.util.Scanner;

public class IdentifyPrimeNumber {
	public static void main(String[] args) {
		System.out.println("please enter the number which number do you want to check is it prime or not");
		
		Scanner sc= new Scanner(System.in);
		
		int number= sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("yes prime number :="+ number);
		}
		else {
			System.out.println("No it is not a prime number :="+ number);
		}
	}

}
