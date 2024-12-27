package com.ramesh;

import java.util.Scanner;

public class MinToMax {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the fist number");
		int num1= sc.nextInt();
		System.out.println("please enter the secound number");
		int num2= sc.nextInt();
		
		System.out.println("answer is :-");
		if(num1<num2) {
			for(int i=num1; i<num2; i++) {
				System.out.println(i);
			}
		}else {
			for(int i=num2; i<num1; i++) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
