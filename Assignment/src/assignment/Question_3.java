package assignment;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		int count = 0;

		System.out.println(
				"\nQuestion 3- Count Occurrences of a Character: Write a program to count the number of times a character appears in a string.\n\n");

		Scanner scanner = new Scanner(System.in);
		
		String characterToBeCounted = scanner.nextLine();
		
		char character = scanner.next().charAt(0);
		
		for (int i = 0; i < characterToBeCounted.length(); i++) {
			if (characterToBeCounted.charAt(i) == character) {
				count++;
			}
		}
		
		System.out.println("\nThe character " + character + " appears " + count + " times in the string.");
		
		scanner.close();
	}

}
