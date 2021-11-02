package com.qa.main;

public class Factorial {
	
	// Normal Loop Solution
	public String factorial(int input) {
		int count = 1;
		int calc = input;
		while (calc > 1) {
			count++;
			if(calc%count != 0) {
				return "Number: "+input+", Factorial: None";
			} else {
				calc = calc/count;
			}
		}
		return "Number: "+input+", Factorial: "+count+"!";
	}
	// Normal Loop End
	
	// Tail Recursion Example
	public String factorialTailRecursion(int input) { // Takes in input and starts Tail Recursion
		if (factorialTailRecursion(input, 1).equals("None")) {
			return "Number: "+input+", Factorial: None";
		}
		return factorialTailRecursion(input, 1); // Gives the Sister Method it's initial count variable
	}
	public String factorialTailRecursion(int input, int count) {
		if (input == 1) { // If input is 1, it means factorisation has completed and we can return
			return "Number: "+factorise(count-1)+", Factorial: "+(count-1)+"!";
		} else if (input%count == 0) { // if input ISN'T 1 but CAN be divided by count
			return factorialTailRecursion(input/count,count+1);
		} else { // if input ISN'T 1 and CAN'T be divided by count
			return "None";
		}
	}
	// End Tail Recursion Example
	
	// Simple Method to Calculate a Factorial; Input: 5 Output: 120
	public int factorise(int value) {
		int output = 1;
		for (int i = 1; i <= value; i++) {
			output = output*i;
		}
		return output;
	}
}
