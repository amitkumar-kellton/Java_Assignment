package assignment;

import java.util.HashSet;
import java.util.Set;

public class Question_48 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 48- Find the Difference Between Two Sets – Identify elements in one set but not in another.\n\n");

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> result = new HashSet<>();

		set1.add(5);
		set1.add(4);
		set1.add(3);
		set1.add(2);
		set1.add(1);

		System.out.println("\nSet 1: " + set1);

		set2.add(4);
		set2.add(3);
		set2.add(2);
		set2.add(1);

		System.out.println("\nSet 2: " + set2);

		result.addAll(set1);
		result.addAll(set2);
		result.removeAll(set2);

		System.out.println("\nDifference Between Two Sets: " + result);

	}

}
