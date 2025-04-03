package assignment;

import java.util.Scanner;

public class Question_18 {
	public static void main(String[] args) {
		int count = 0;

		System.out.println(
				"\nQuestion 13: Find the Longest Word in a String: Write a program to find the longest word in a sentence..\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();

		String[] words = stringToBeChecked.split(" ");
		String longestWord = "";

		int i = 0;
		while (i < words.length) {
			if (words[i].length() > count) {
				count = words[i].length();
				longestWord = words[i];
			}
			i++;

		}

		System.out.println("\nThe longest word in the string is: " + longestWord);

		scanner.close();
	}
}
