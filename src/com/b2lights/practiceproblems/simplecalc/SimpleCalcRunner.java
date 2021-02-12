package com.b2lights.practiceproblems.simplecalc;

import java.util.Scanner;

public class SimpleCalcRunner {

	public static void main(String[] args) {
		// variables
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		//get two number inputs
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		
		SimpleCalculations calc = new SimpleCalculations(num1, num2);
		
		//run calculations and print results
		System.out.println("Sum: " + calc.addNums());
		System.out.println("Difference: " + calc.subNums());
		System.out.println("Product: " + calc.multNums());
		System.out.println("Quotient: " + calc.divNums());
		

	}

}
