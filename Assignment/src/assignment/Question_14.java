package assignment;

import java.util.Scanner;

public class Question_14 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 14: Count Vowels and Consonants in a String: Write a program to count vowels and consonants in a string.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();
		
		int Vowels = 0;
		int Consonants = 0;

		int i = 0;
		while (i < stringToBeChecked.length()) {
			if (stringToBeChecked.charAt(i) == 'a' || stringToBeChecked.charAt(i) == 'e'
					|| stringToBeChecked.charAt(i) == 'i' || stringToBeChecked.charAt(i) == 'o'
					|| stringToBeChecked.charAt(i) == 'u') {
				Vowels++;
			} else {
				Consonants++;
			}
			i++;
		}

		System.out.println("\nThe total number of Vowels is " + Vowels + "\nThe total number of Consonants is " + Consonants + ".");

		scanner.close();
	}
}
