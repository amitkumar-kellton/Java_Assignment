package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_26 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 26- Remove Null Elements from a List – Filter out null values.\n\n");

		List<Integer> integersList = new ArrayList<>();

		integersList.add(null);
		integersList.add(2);
		integersList.add(null);
		integersList.add(4);
		integersList.add(null);
		integersList.add(6);
		integersList.add(null);
		integersList.add(8);
		integersList.add(null);

		System.out.println("Integers List before removing null values: " + integersList);

		int i = 0;
		while (i < integersList.size()) {
			integersList.remove(null);
			i++;
		}

		System.out.println("Integers List after removing null values: " + integersList);

	}

}
