package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_29 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 29- Reverse a List – Reverse the order of elements in a list.\n\n");

		List<Integer> integersList = new ArrayList<>();
		List<Integer> reversedIntegersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(4);
		integersList.add(6);
		integersList.add(8);
		integersList.add(10);
		integersList.add(12);
		integersList.add(14);

		System.out.println("\nIntegers List : " + integersList);

		reversedIntegersList = integersList.reversed();

		System.out.println("\nIntegers List after reversing the order of elements in a list: " + reversedIntegersList);
	}

}
