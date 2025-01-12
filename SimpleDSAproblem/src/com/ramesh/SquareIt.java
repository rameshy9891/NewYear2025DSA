package com.ramesh;

import java.util.Scanner;

public class SquareIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number which number do you want to square it");
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int res=0;
		
		res= num*num;
		
		System.out.println(res);

	}

}
