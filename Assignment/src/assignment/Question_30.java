package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_30 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 30- Find the Second Largest Element in a List – Identify the second largest number.\n\n");

		List<Integer> integersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(4);
		integersList.add(55);
		integersList.add(4);
		integersList.add(10);
		integersList.add(2);
		integersList.add(14);

		Collections.sort(integersList);

		System.out.println("Second largest integers List: " + integersList.get(integersList.size() - 2));
	}

}
