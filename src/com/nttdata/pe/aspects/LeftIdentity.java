package com.nttdata.pe.aspects;

import java.util.Optional;
import java.util.function.Function;

public class LeftIdentity {

	public static void main(String[] args) {
	      Function<Integer, Optional<Integer>> addOneToX 
	      	= x -> Optional.of(x + 1);
	      System.out.println(Optional.of(5).flatMap(addOneToX)
	         .equals(addOneToX.apply(5)));
	   }

}
