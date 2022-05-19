package com.nttdata.pe.functional.programming;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		String url = "www.google.com";
		System.out.println(encodedAddress(url));
	}

	public static String encodedAddress(String... address) {
		return Arrays.stream(address)
				.map(wrapper(s -> URLEncoder.encode(s, "UTF-8")))
				.collect(Collectors.joining(","));
	}

	private static <T, R, E extends Exception> Function<T, R> wrapper(FunctionWithThrows<T, R, E> fe) {
		return arg -> {
			try {
				return fe.apply(arg);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
}

@FunctionalInterface
interface FunctionWithThrows<T, R, E extends Exception> {
	R apply(T t) throws E;
}