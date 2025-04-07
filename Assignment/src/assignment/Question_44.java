package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_44 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 44- Sum of Elements in a List – Calculate the total sum of a list.\n\n");

		List<Integer> integersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(4);
		integersList.add(6);
		integersList.add(8);
		integersList.add(10);
		integersList.add(12);

		int sum = 0;
		int i = 0;

		while (i < integersList.size()) {
			sum += integersList.get(i);
			i++;
		}

		System.out.println("The total sum of of Elements in a list is: " + sum);
	}

}
