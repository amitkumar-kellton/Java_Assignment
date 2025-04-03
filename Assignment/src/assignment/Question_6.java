package assignment;

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 6: Check Anagram: Write a program to check if two strings are anagrams of each other.\n\n");

		Scanner scanner = new Scanner(System.in);
		String firstStringToBeChecked = scanner.nextLine();
		String secondStringToBeChecked = scanner.nextLine();
		
		scanner.close();
	}
}
