package com.nttdata.pe.aspects;

import java.util.function.Function;

public class FunctionalComposition2 {

	public static void main(String[] args) {
		Function<Integer, Integer> multiply = t -> t * 3;
		Function<Integer, Integer> add = t -> t + 3;
		Function<Integer, Integer> FirstMultiplyThenAdd = multiply.compose(add);
		Function<Integer, Integer> FirstAddThenMultiply = multiply.andThen(add);
		System.out.println(FirstMultiplyThenAdd.apply(3));
		System.out.println(FirstAddThenMultiply.apply(3));
	}

}