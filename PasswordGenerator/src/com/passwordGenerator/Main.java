package com.passwordGenerator;

import java.util.Scanner;

public class Main {

	public static char randomCharacter() {

		/*
		 * 0 to 9 => 48 to 57 in ASCII A to Z => 65 to 90 in ASCII a to z => 97 to 122
		 * in ASCII special char => 33 to 47 in ASCII
		 */

		// Generate characters
		int random = (int) (Math.random() * 68);
		// break up numbers into numbers,lowercase letters,Uppercase

		if (random <= 9) {
			// Number
			int asc = random + 48;
			return (char) (asc);
		} else if (random <= 35) {
			// Uppercase Letter
			int asc = random + 55;
			return (char) (asc);
		} 
		else {
			// Lowercase Letter
			int asc = random + 61;
			return (char) (asc);
		}
	}

	public static void printPasswords(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Random Password You Want To Generate? ");
		int total = sc.nextInt();

		System.out.println("Enter Required Character : ");
		int length = sc.nextInt();

		// For store random passwords
		String[] randomPasswords = new String[total];

		for (int i = 0; i < total; i++) {
			// Generate one random password

			String randomPassword = "";
			for (int j = 0; j < length; j++) {
				// Generate one random character
				randomPassword += randomCharacter();
			}
			// add random password to the array
			randomPasswords[i] = randomPassword;
		}

		// Print Our Array Of Passwords
		printPasswords(randomPasswords);

		sc.close();
	}
}
