package com.nttdata.pe.functional.programming;

import java.util.function.Function;

public class ReturningFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> addOne = adder(1);
		Function<Integer, Integer> addOne2 = y -> y + 1;
		Function<Integer, Integer> addTwo = adder(2);
		Function<Integer, Integer> addThree = adder(3);

		// result = 4 + 1 = 5
		Integer result = addOne.apply(4);
		System.out.println(result);
		
		result = addOne2.apply(4);
		System.out.println(result);

		// result = 4 + 2 = 6
		result = addTwo.apply(4);
		System.out.println(result);

		// result = 4 + 3 = 7
		result = addThree.apply(4);
		System.out.println(result);
	}

	// adder - High Order Function
	// returns a function as lambda expression
	static Function<Integer, Integer> adder(Integer x) {
		return y -> y + x;
	}

}
