package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_37 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 37- Find Unique Elements in a List – Identify elements that appear only once.\n\n");

		List<Integer> integersList = new ArrayList<>();
		List<Integer> uniqueIntegersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(2);
		integersList.add(4);
		integersList.add(4);
		integersList.add(6);
		integersList.add(8);
		integersList.add(10);

		System.out.println("\nIntegers List: " + integersList);

		int i = 0;
		while (i < integersList.size()) {
			int j = i + 1;
			while (j < integersList.size()) {
				if (integersList.get(i) == integersList.get(j)) {
				}
				j++;
			}
			i++;
		}
		System.out.println("\nIntegers List: " + integersList);
		System.out.println("\nUnique IntegersList List: " + uniqueIntegersList);
	}

}
