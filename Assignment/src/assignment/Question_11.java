package assignment;

import java.util.Scanner;

public class Question_11 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 11: Remove All Whitespaces from a String: Write a program to remove all spaces from a given string.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();

		String result = "";

		int i = 0;
		while (i < stringToBeChecked.length()) {
			if (stringToBeChecked.charAt(i) != ' ') {
				result += stringToBeChecked.charAt(i);
			}
			i++;
		}
		System.out.println("\nThe string after removing whitespace is: " + result);

		scanner.close();
	}
}
