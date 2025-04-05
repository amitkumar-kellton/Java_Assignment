package assignment;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 1- Reverse a String: Write a program to reverse a given string.\n\n");

		Scanner scanner = new Scanner(System.in);

		String stringToBeReversed = scanner.nextLine();
		String reversedString = "";

		int i = stringToBeReversed.length() - 1;
		while (i >= 0) {
			reversedString += stringToBeReversed.charAt(i);
			i--;
		}

		System.out.println("\n" + reversedString);

		scanner.close();
	}

}
