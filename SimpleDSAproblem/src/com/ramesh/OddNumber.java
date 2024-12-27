package com.ramesh;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		System.out.println("Odd number will print greater then 0 and less then that number");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		for(int i=1; i<=number ; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
