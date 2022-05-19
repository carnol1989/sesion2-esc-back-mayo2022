package com.nttdata.pe.aspects;

public class HeadRecursion {

	public static void main(String[] args) {
		printUsingHeadRecursion(5);
	}

	public static void printUsingHeadRecursion(int n) {
		if (n == 0)
			return;
		else
			printUsingHeadRecursion(n - 1);
		System.out.println(n);
	}

}
