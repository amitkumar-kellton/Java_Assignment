package assignment;

import java.util.HashSet;
import java.util.Set;

public class Question_47 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 47- Find the Union of Two Sets – Combine two sets.\n\n");

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> result = new HashSet<>();

		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);

		System.out.println("\nSet 1: " + set1);

		set2.add(10);
		set2.add(11);
		set2.add(12);
		set2.add(13);
		set2.add(14);

		System.out.println("\nSet 2: " + set2);

		result.addAll(set1);
		result.addAll(set2);

		System.out.println("\nUnion of Two Sets: " + result);

	}

}
