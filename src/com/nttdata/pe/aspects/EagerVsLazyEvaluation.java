package com.nttdata.pe.aspects;

import java.util.function.Supplier;

public class EagerVsLazyEvaluation {

	public static void main(String[] args) {
		String queryString = "password=test";
		System.out.println(checkInEagerWay(hasName(queryString), hasPassword(queryString)));
		System.out.println(checkInLazyWay(() -> hasName(queryString), () -> hasPassword(queryString)));
	}

	private static boolean hasName(String queryString) {
		System.out.println("Checking name: ");
		return queryString.contains("name");
	}

	private static boolean hasPassword(String queryString) {
		System.out.println("Checking password: ");
		return queryString.contains("password");
	}

	private static String checkInEagerWay(boolean result1, boolean result2) {
		return (result1 && result2) ? "all conditions passed" : "failed.";
	}

	private static String checkInLazyWay(Supplier<Boolean> result1, Supplier<Boolean> result2) {
		return (result1.get() && result2.get()) ? "all conditions passed" : "failed.";
	}

}