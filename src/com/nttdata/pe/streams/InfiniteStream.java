package com.nttdata.pe.streams;

import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		// create a stream of numbers which are multiple of 3
		Stream<Integer> numbers = Stream.iterate(0, n -> n + 3);

		numbers.limit(10).forEach(System.out::println);
	}

}
