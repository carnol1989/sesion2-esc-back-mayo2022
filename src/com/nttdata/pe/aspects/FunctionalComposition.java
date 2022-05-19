package com.nttdata.pe.aspects;

import java.util.function.Predicate;

public class FunctionalComposition {

	public static void main(String[] args) {
		Predicate<String> hasName = text -> text.contains("name");
		Predicate<String> hasPassword = text -> text.contains("password");
		Predicate<String> hasBothNameAndPassword = hasName.and(hasPassword);
		String queryString = "name=test;password=test";
		System.out.println(hasBothNameAndPassword.test(queryString));
	}

}