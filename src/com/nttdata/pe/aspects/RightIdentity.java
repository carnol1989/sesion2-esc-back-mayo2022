package com.nttdata.pe.aspects;

import java.util.Optional;

public class RightIdentity {
	
	public static void main(String[] args) {
		System.out.println(Optional.of(5).flatMap(Optional::of)
				.equals(Optional.of(5)));
	}
	
}
