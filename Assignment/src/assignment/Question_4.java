package assignment;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 4: Remove Duplicates from a String: Write a program to remove duplicate characters from a string.\n\n");

		Scanner scanner = new Scanner(System.in);

		String stringToBeChecked = scanner.nextLine();
		String result = "";

		int i = 0;
		while (i < stringToBeChecked.length()) {
			boolean duplicate = false;
			int j = 0;
			while (j < i) {
				if (stringToBeChecked.charAt(i) == stringToBeChecked.charAt(j)) {
					duplicate = true;
					break;
				}
				j++;
			}
			if (!duplicate) {
				result += stringToBeChecked.charAt(i);
			}
			i++;
		}

		System.out.println("\nThe string after removing duplicates is: " + result);

		scanner.close();
	}

}
