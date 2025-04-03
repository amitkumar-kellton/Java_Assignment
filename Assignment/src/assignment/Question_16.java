package assignment;

import java.util.Scanner;

public class Question_16 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 16: Reverse Words in a String: Write a program to reverse the order of words in a sentence while maintaining the order of characters in each word.\n\n");

		Scanner scanner = new Scanner(System.in);
		String stringToBeChecked = scanner.nextLine();

		String[] words = stringToBeChecked.split(" ");

		String[] reversedWords = new String[words.length];
		
		int i = words.length - 1;
		int num = 0;
		while (i >= 0) {
			reversedWords[num] = words[i];
			System.out.print(reversedWords[num] + " ");
			num++;
			i--;
		}

		scanner.close();
	}
}

//int j = 0;
//while (j < stringToBeChecked.length()) {
//	String word = "";
//	int wordCount = 0;
//	if (stringToBeChecked.charAt(j) != ' ') {
//		word += stringToBeChecked.charAt(j);
//	} else {
//		words[wordCount] += word;
//		wordCount++;
//	}
//	j++;
//}
//System.out.println("\nThe words in the string are: " + words.toString());