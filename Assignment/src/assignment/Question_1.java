package assignment;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 1- Reverse a String: Write a program to reverse a given string.\n\n");

		Scanner scanner = new Scanner(System.in);

		String stringToBeReversed = scanner.nextLine();
		String reversedString = "";

		for (int i = stringToBeReversed.length() - 1; i >= 0; i--) {
			reversedString += stringToBeReversed.charAt(i);
		}

		System.out.println("\n" + reversedString);

		scanner.close();
	}

}
