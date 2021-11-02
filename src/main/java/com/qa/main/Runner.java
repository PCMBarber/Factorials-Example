package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		Factorial app = new Factorial();
		
		System.out.println("Normal loop");
		System.out.println(app.factorial(120));
		System.out.println(app.factorial(150));
		System.out.println(app.factorial(3628800));
		System.out.println(app.factorial(479001600));
		System.out.println(app.factorial(6));
		System.out.println(app.factorial(18));
		
		System.out.println("Tail Recursion");
		System.out.println(app.factorialTailRecursion(120));
		System.out.println(app.factorialTailRecursion(150));
		System.out.println(app.factorialTailRecursion(3628800));
		System.out.println(app.factorialTailRecursion(479001600));
		System.out.println(app.factorialTailRecursion(6));
		System.out.println(app.factorialTailRecursion(18));
	}
}
