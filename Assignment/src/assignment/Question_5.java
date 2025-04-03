package assignment;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 5: Find First Non-repeated Character: Write a program to find the first non-repeated character in a string.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();

		char firstNonRepeatedChar = 0;

		int i = 0;
		while (i < stringToBeChecked.length()) {
			char currentChar = stringToBeChecked.charAt(i);
			int count = 0;

			int j = 0;
			while (j < stringToBeChecked.length()) {
				if (currentChar == stringToBeChecked.charAt(j)) {
					count++;
				}
				j++;
			}

			if (count == 1) {
				firstNonRepeatedChar = currentChar;
				System.out.println("\nThe first non-repeated character is: " + firstNonRepeatedChar);
				break;
			}

			i++;
		}

		scanner.close();
	}
}
