package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_35 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 35- Create a Set from a List – Convert a list into a set (remove duplicates).\n\n");

		List<Integer> integersList = new ArrayList<>();

		Set<Integer> integersSet = new HashSet<>();

		integersList.add(2);
		integersList.add(2);
		integersList.add(4);
		integersList.add(4);
		integersList.add(6);
		integersList.add(6);
		integersList.add(8);
		integersList.add(8);

		System.out.println("Integers List: " + integersList);

		int i = 0;
		while (i < integersList.size()) {
			integersSet.add(integersList.get(i));
			i++;
		}
		System.out.println("Integers List: " + integersSet);
	}

}
