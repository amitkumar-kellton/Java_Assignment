package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_28 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 28- Find the Intersection of Two Lists – Find common elements between two lists.\n\n");

		List<Integer> integersList1 = new ArrayList<>();
		List<Integer> integersList2 = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		integersList1.add(2);
		integersList1.add(4);
		integersList1.add(6);
		integersList1.add(8);
		integersList1.add(10);

		System.out.println("\nIntegers List 2: " + integersList1);

		integersList2.add(8);
		integersList2.add(10);
		integersList2.add(12);
		integersList2.add(14);
		integersList2.add(16);

		System.out.println("\nIntegers List 2: " + integersList2);

		int i = 0;
		while (i < integersList1.size()) {
			int j = 0;
			while (j < integersList2.size()) {
				if (integersList1.get(i) == integersList2.get(j)) {
					result.add(integersList1.get(i));
				}
				j++;
			}
			i++;
		}
		System.out.println("\nCommon elements between two lists: " + result);
	}

}
