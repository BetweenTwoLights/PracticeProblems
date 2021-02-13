package com.b2lights.practiceproblems.timeconvert;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		int seconds;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number of seconds to convert to"
				+ " hours and minutes: ");
		seconds = sc.nextInt();

		Conversions conv = new Conversions(seconds);
		
		conv.divTimer();
		
		System.out.println(conv.getHours() + " hours " 
				+ conv.getMinutes() + " minutes and "
				+ conv.getSeconds() + " seconds");
	}

}
