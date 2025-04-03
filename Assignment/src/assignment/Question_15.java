package assignment;

import java.util.Scanner;

public class Question_15 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 15: Convert a String to a Character Array: Write a program to convert a string into a character array and print each character.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();

		char[] charArray = stringToBeChecked.toCharArray();

		int i = 0;
		while (i < charArray.length) {
			System.out.print("Character at index: " + i + " is " + charArray[i] + "\n");
			i++;
		}

		scanner.close();
	}
}
