package com.nttdata.pe.aspects;

public class PureFunction {

	public static void main(String[] args) {
		int a, b;
		a = 1;
		b = 2;
		System.out.println(sum(a, b));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

}