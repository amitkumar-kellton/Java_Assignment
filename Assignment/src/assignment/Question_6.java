package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 6: Check Anagram: Write a program to check if two strings are anagrams of each other.\n\n");

		Scanner scanner = new Scanner(System.in);
		String firstStringToBeChecked = scanner.nextLine();
		String secondStringToBeChecked = scanner.nextLine();

		scanner.close();
		
		if (firstStringToBeChecked.length() == secondStringToBeChecked.length()) {
			char[] chararray1 = firstStringToBeChecked.toLowerCase().toCharArray();
			char[] chararray2 = secondStringToBeChecked.toLowerCase().toCharArray();
			Arrays.sort(chararray1);
			Arrays.sort(chararray2);
			
			if (Arrays.equals(chararray1, chararray2)) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is Not Anagram");
			}

		}

	}

//		if (firstStringToBeChecked.length() == secondStringToBeChecked.length()) {
//			int i = 0;
//			while (i < firstStringToBeChecked.length()) {
//				int j = 0;
//				while (j < secondStringToBeChecked.length()) {
//
//					j++;
//				}
//				i++;
//			}
//		} else {
//			System.out.println("Both the strings are not equal!");
//		}
//	}
}

// abcc
// cgab