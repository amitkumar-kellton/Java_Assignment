package assignment;

import java.util.Scanner;

public class Question_17 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 17: Remove Substring from a String: Write a program to remove a given substring from a string.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();
		String substringToBeRemoved = scanner.nextLine();


		int i = 0;
		while (i < stringToBeChecked.length()) {
			int j = 0;
			while (j < stringToBeChecked.length()) {
				if (substringToBeRemoved.charAt(i) == substringToBeRemoved.charAt(j)) {
					
				}
				j++;
			}

			i++;
		}

		scanner.close();
	}
}
