package assignment;

import java.util.Scanner;

public class Question_12 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 12: Replace All Occurrences of a Character: Write a program to replace all occurrences of a specific character in a string with another character.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();
		char characterToBeReplaced = scanner.next().charAt(0);
		char replacementCharacter = scanner.next().charAt(0);

		String result = "";

		int i = 0;
		while (i < stringToBeChecked.length()) {
			if (stringToBeChecked.charAt(i) == characterToBeReplaced) {
				result += replacementCharacter;
			} else {
				result += stringToBeChecked.charAt(i);
			}
			i++;
		}
		System.out.println("\nThe string after removing " + characterToBeReplaced + " character: " + result);

		scanner.close();
	}
}
