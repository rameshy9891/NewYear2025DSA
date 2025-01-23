package com.ramesh;

import java.util.Scanner;

public class ReplaceVariableWithoutUsingAnyVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the input of both variable");
		
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();  //5
		
		int b= sc.nextInt(); //15
		
		System.out.print(a +" "+ b);
		
		System.out.println();
		
		a=a+b;  // 5+15 =20
		
		b=a-b;  // 20-15=5
		
		a=a-b;  //20-5=15
		
		System.out.print(a+" "+b);
		
		

	}

}
