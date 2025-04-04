package assignment;

import java.util.Scanner;

public class Question_19 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 19: String Equality (Case-insensitive): Write a program to compare two strings without considering their case.\n\n");

		Scanner scanner = new Scanner(System.in);
		String firstStringToBeChecked = scanner.nextLine();
		String secondStringToBeChecked = scanner.nextLine();

		if (firstStringToBeChecked.length() != secondStringToBeChecked.length()) {
			System.out.println("\nThe first string is shorter than the second string.");
		}
		if (firstStringToBeChecked.equalsIgnoreCase(secondStringToBeChecked)) {
			System.out.println("\nThe two strings are same.");

		} else {
			System.out.println("\nThe two strings are not same.");
		}

		scanner.close();
	}
}
