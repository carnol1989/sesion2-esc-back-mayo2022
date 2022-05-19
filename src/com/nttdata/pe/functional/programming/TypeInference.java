package com.nttdata.pe.functional.programming;

import java.util.Arrays;

public class TypeInference {

	public static void main(String[] args) {
		String[] names = { "Raja", "Jai", "Adithya", "Surya", "Chaitanya", "Ravi", "Krishna" };
		Arrays.sort(names, (s1, s2) -> { // Lambda Expression
			return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
		});
		for (String str : names) {
			System.out.println(str);
		}
	}

}
