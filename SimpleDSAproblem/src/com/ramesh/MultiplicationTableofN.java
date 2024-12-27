package com.ramesh;

import java.util.Scanner;

public class MultiplicationTableofN {
	
	public static void main(String[] args) {
		System.out.println("Enter the number which you want multiplication");
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(number*i);
		}
		sc.close();
	}

}
