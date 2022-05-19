package com.nttdata.pe.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FixLengthStream {

	public static void main(String[] args) {

		System.out.println("Stream.of():");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		stream.forEach(System.out::println);

		System.out.println("Collection.stream():");
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(numbers);
		list.stream().forEach(System.out::println);

		System.out.println("StreamBuilder.build():");
		Stream.Builder<Integer> streamBuilder = Stream.builder();
		streamBuilder.accept(1);
		streamBuilder.accept(2);
		streamBuilder.accept(3);
		streamBuilder.accept(4);
		streamBuilder.accept(5);
		streamBuilder.build().forEach(System.out::println);
	}

}
