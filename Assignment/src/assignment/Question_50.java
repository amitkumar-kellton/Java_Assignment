package assignment;

import java.util.Scanner;

public class Question_50 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 50- Count Elements Greater than a Given Value – Count how many numbers are greater than a specific value.\n\n");

		Scanner scanner = new Scanner(System.in);

		int numberToBeChecked = scanner.nextInt();

		int[] numbers = { 1, 2, 3, 2, 44, 55, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int count = 0;

		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] > numberToBeChecked) {
				count++;
			}
			i++;
		}

		scanner.close();
		System.out.println("The total number of elements in the array is: " + numbers.length);
		System.out.println("The number of elements greater than " + numberToBeChecked + " is: " + count);
	}

}
