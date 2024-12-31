package com.ramesh;

import java.util.Scanner;

public class DivisionTask {
	
	public static void main(String[] args) {
		
		/*you are given a number N
		 * let's say you derive a variable x which is equal to the floor of a number you get when 32 is devided by N
		 * * in case x is 0 , print Too Low
		 * in case it is not possible to generate a valid number , print -1
		 * in all other cases , print x.*/
		
		/* hint- when 32 is divided by 4 , answer is 8 . Floor value of 8 is 8 so x is 8
		 * 
		 *  when 32 is divided by 3, answer is 10.66 . Floor value of 10.66 is 10 . So x is 10.*/
		
		System.out.println("enter the number");
		
		Scanner sc= new Scanner(System.in);
		
		int fixNumberWhichwewantToDivide= sc.nextInt();
		
		int number=sc.nextInt();
		int res=0;
		
		res=fixNumberWhichwewantToDivide/number;
		
		if(res<0) {
			System.out.println("-1");
			
		}
		else if(res==0) {
			System.out.println("Too Low");
		}
		else {
			System.out.println(res);
		}
		
	}

}
