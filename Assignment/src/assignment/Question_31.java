package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_31 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 31- Find All Pairs with Given Sum in an Array – Find pairs whose sum equals a target number.\n\n");

		List<Integer> integersList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		int targetNumber = scanner.nextInt();

		scanner.close();

		integersList.add(2);
		integersList.add(4);
		integersList.add(6);
		integersList.add(8);
		integersList.add(10);
		integersList.add(12);
		integersList.add(14);

		System.out.println("\nIntegers List: " + integersList);

		int i = 0;
		while (i < integersList.size()) {
			int j = i + 1;
			while (j < integersList.size()) {
				if ((integersList.get(i) + integersList.get(j)) == targetNumber) {
					System.out.print(
							"\nPair for " + integersList.get(i) + " + " + integersList.get(j) + " = " + targetNumber);
				}
				j++;
			}
			i++;
		}
	}

}
