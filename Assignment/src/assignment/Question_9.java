package assignment;

import java.util.Scanner;

public class Question_9 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 9: Count Words in a String: Write a program to count the number of words in a given string..\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();

//		String[] words;

		String temp = "";

		int count = 0;

//		String[] words = stringToBeChecked.split(" ");
//		
//		int count = words.length;
//		
//		System.out.println("\nThe number of words in the string is: " + count);

		int i = 0;
		while (i < stringToBeChecked.length()) {
			if (stringToBeChecked.charAt(i) == ' ') {
				count++;
			} else {
				temp += stringToBeChecked.charAt(i);
				System.out.print("Word " + temp + "\n");
			}
			i++;
		}
		System.out.println("\nThe number of words in the string is: " + (count + 1));
		
		scanner.close();
	}
}
