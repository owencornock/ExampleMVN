package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		

			Maths maths = new Maths();
			
			try {
				maths.multiply(64, 4);
			} catch (MultiplyByFiveException e) {
				
				e.printStackTrace();
			}
	
			try {
				maths.divide(10, 20);
			} catch (DivideByBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
