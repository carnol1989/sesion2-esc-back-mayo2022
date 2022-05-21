package com.nttdata.pe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjercicioSesion2 {

	public static void main(String[] args) {
		System.out.println(countLowerCaseLetters("aaBcDDeF"));
		System.out.println(mostLowerCase(new ArrayList<String>() {
			{
				add("aabbCC");
				add("aaBBCC");
				add("aaBcDDeFg");
			}
		}));
	}

	public static long countLowerCaseLetters(String str) {
		return str.chars().filter(Character::isLowerCase).count();
	}

	public static String mostLowerCase(List<String> listStr) {
		listStr.stream()
			.max(Comparator.comparingLong(EjercicioSesion2::countLowerCaseLetters));
		return listStr.stream()
					.max(Comparator.comparingLong(EjercicioSesion2::countLowerCaseLetters)).get();
	}

}
