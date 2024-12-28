package com.ramesh;

import java.util.Scanner;

public class EvenSumBelowN {

	public static void main(String[] args) {
		System.out.println("please enter the number below that number you want even number sum");
		
		Scanner sc = new Scanner(System.in);
		
		int number= sc.nextInt();
	int sum=0;
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("your total sum is:-"+sum);
		sc.close();
	}
}
