package com.nttdata.pe;

import java.util.Optional;
import java.util.function.Function;

public class Associativity {
	
	public static void main(String[] args) {
		Function<Integer, Optional<Integer>> addOneToX 
			= x -> Optional.of(x + 1);
		Function<Integer, Optional<Integer>> addTwoToX 
			= x -> Optional.of(x + 2);
		Function<Integer, Optional<Integer>> addThreeToX 
			= x -> addOneToX.apply(x).flatMap(addTwoToX);
		
		System.out.println(Optional.of(5).flatMap(addOneToX).flatMap(addTwoToX)
			.equals(Optional.of(5).flatMap(addThreeToX)));
	}
	
}
