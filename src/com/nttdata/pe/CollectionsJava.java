package com.nttdata.pe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsJava {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// Mapping
		// get list of unique squares
		/*List<Integer> squaresList = numbers.stream().map(i -> i * i)
				.distinct().collect(Collectors.toList());
		System.out.println(squaresList);*/
		
		//2
		List<Integer> squaresList = numbers.stream()
				.distinct()
				.map(i -> i * i)
				.collect(Collectors.toList());
		System.out.println(squaresList);

		// Filering
		// get list of non-empty strings
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> nonEmptyStrings = strings.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());
		System.out.println(nonEmptyStrings);

		// Reducing
		int sum = numbers.stream().reduce((num1, num2) -> num1 + num2).orElse(-1);
		System.out.println(sum);
	}

}
