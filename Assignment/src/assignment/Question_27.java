package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_27 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 27- Check if a List Contains Duplicates – Detect duplicates using a set.\n\n");

		List<Integer> integersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(4);
		integersList.add(6);
		integersList.add(4);
		integersList.add(10);
		integersList.add(2);
		integersList.add(14);

		System.out.println("Integers List before removing duplicate values: " + integersList);

		int i = 0;
		while (i < integersList.size()) {
			int j = i + 1;
			while (j < integersList.size()) {
				if (integersList.get(i) == integersList.get(j)) {
					integersList.remove(j);
				}
				j++;
			}
			i++;
		}
		System.out.println("Integers List after removing duplicate values: " + integersList);
	}

}
