package com.nttdata.pe.functional.programming;

public class PureFunction {

	public static void main(String[] args) {
		int result = sum(2, 3);
		System.out.println(result);

		result = sum(2, 3);
		System.out.println(result);
	}

	static int sum(int a, int b) {
		return a + b;
	}

}
