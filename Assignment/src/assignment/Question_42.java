package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_42 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 42- Remove Elements Divisible by 3 from a List – Remove all numbers divisible by 3.\n\n");

		List<Integer> integersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(4);
		integersList.add(6);
		integersList.add(8);
		integersList.add(10);
		integersList.add(12);

		int i = 0;
		while (i < integersList.size()) {

			int temp = integersList.get(i) / 3;
			System.out.println("\nNumber to be Iterated: " + temp);
			if (temp > 0) {
				integersList.remove(i);
			}
			i++;
		}

		System.out.println("\nIntegers List after removal of numbers divisilbe by 3: " + integersList);

//		int temp = 0;
//		Iterator<Integer> itr = integersList.iterator();
//		while(itr.hasNext()) {
//			temp = integersList.get(i);
//			t
//		}

	}

}
