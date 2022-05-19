package com.nttdata.pe.aspects;

import java.util.stream.IntStream;

public class Reducing {

	public static void main(String[] args) {
		// 1 * 2 * 3 * 4 = 24
		int product = IntStream.range(1, 5)
				.reduce((num1, num2) -> num1 * num2)
				.orElse(-1);
		System.out.println(product);
		
		// 1 + 2 + 3 + 4 = 10
		int sum = IntStream.range(1, 5).sum();		
		System.out.println(sum);
	}

}
