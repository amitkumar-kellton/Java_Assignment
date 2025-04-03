package assignment;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 2- Check if a String is Palindrome: Write a program to check if a given string is a palindrome.\n\n");

		Scanner scanner = new Scanner(System.in);

		String stringToBeChecked = scanner.nextLine();
		String temp = "";

//		for (int i = stringToBeChecked.length() - 1; i >= 0; i--) {
//			temp += stringToBeChecked.charAt(i);
//		}
		
		int i = stringToBeChecked.length() - 1;
		while (i >= 0) {
			temp += stringToBeChecked.charAt(i);
			i--;
		}

		if (stringToBeChecked.equals(temp)) {
			System.out.println("\nThe string is a palindrome.");
		} else {
			System.out.println("\nThe string is not a palindrome.");
		}

		scanner.close();
	}

}
