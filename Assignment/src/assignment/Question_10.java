package assignment;

import java.util.Scanner;

public class Question_10 {
	public static void main(String[] args) {
		int count = 0;

		System.out.println(
				"\nQuestion 5: String Compression: Given a string, compress it by replacing consecutive duplicate characters with the number of occurrences (e.g., 'aabbbcc' → 'a2b3c2').\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();
		String result = "";
		char character = 0;

		for (int i = 0; i < stringToBeChecked.length(); i++) {
			for(int j = i; j < stringToBeChecked.length(); j++) {
				if (stringToBeChecked.charAt(i) == stringToBeChecked.charAt(j)) {
					count++;
					character = stringToBeChecked.charAt(i);
				} else {
					break;
				}
			}
		}
		if (count > 1) {
			result += character + "" + count;
		} else {
			result += character;
		}
		System.out.println("\nThe compressed string is: " + result);
		
		scanner.close();
	}
}
