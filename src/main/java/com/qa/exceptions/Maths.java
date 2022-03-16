package com.qa.exceptions;

import java.util.Scanner;

public class Maths {
	
	Scanner scanner = new Scanner(System.in);
	
	public void multiply(int a, int b) throws MultiplyByFiveException {
		
		int result;
		
		if (a == 5 || b == 5) {
			throw new MultiplyByFiveException("You can't multiply by 5");
		}
		
		result = a * b;
		
		System.out.println(result);
	}
		public void divide() throws DivideByBException {
			try {
			
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double result;	
			
		if (a < b) {
			throw new DivideByBException("B is larger than A");
		}
			} catch {Input
		
				
				result = a / b;
		
		System.out.println(result);
	}
}
