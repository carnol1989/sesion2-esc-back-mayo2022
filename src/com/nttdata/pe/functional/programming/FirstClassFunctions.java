package com.nttdata.pe.functional.programming;

@FunctionalInterface
interface Calculator<X, Y> {
	public X compute(X a, Y b);
}

public class FirstClassFunctions {

	public static void main(String[] args) {
		// Assign a function to a variable
		Calculator<Integer, Integer> calculator = (a, b) -> a * b;

		// call a function using function variable
		System.out.println(calculator.compute(2, 3));

		// Pass the function as a parameter
		printResult(calculator, 3, 3);

		// Get the function as a return result
		Calculator<Integer, Integer> calculator1 = getCalculator();
		System.out.println(calculator1.compute(4, 3));
	}

	// Function as a parameter
	static void printResult(Calculator<Integer, Integer> calculator, Integer a, Integer b) {
		System.out.println(calculator.compute(a, b));
	}

	// Function as return value
	static Calculator<Integer, Integer> getCalculator() {
		Calculator<Integer, Integer> calculator = (a, b) -> a * b;
		return calculator;
	}

}
