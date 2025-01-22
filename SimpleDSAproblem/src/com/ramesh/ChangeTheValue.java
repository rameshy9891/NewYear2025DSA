package com.ramesh;

import java.util.Scanner;

public class ChangeTheValue {
	
	public static void main(String[] args) {
		
		System.out.println("enter the input of two value ");
		
		Scanner sc= new Scanner(System.in);
		
		int num1= sc.nextInt();
		
		int num2= sc.nextInt();
		
		System.out.print(num1 +" -- "+num2);
		
		
		int temp= num1;
		num1=num2;
		num2=temp;
		
		System.out.print(num1 +" -- "+num2);
		
	}

}
