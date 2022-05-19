package com.nttdata.pe.aspects;

public class TailRecursion {

	public static void main(String[] args) {
		printUsingTailRecursion(5);
	}

	public static void printUsingTailRecursion(int n) {
		if (n == 0)
			return;
		else
			System.out.println(n);
		printUsingTailRecursion(n - 1);
	}

}