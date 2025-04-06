package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question_43 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 43- Find the Maximum Occurring Element in a List – Identify the most frequent element.\n\n");

		List<Integer> integersList = new ArrayList<>();

		integersList.add(2);
		integersList.add(4);
		integersList.add(4);
		integersList.add(8);
		integersList.add(10);
		integersList.add(10);

		int max = 0;
		int integer = 0;

		int i = 0;
		while (i < integersList.size()) {
			int j = 0;
			while (j < integersList.size()) {
				if (integersList.contains(i)) {
					integer = integersList.get(i);
					max++;
				}
				j++;
			}
			i++;
		}
		
		System.out.println("integer" + integer);

//		Iterator<Integer> itr = integersList.iterator();
//		while(itr.hasNext()) {
//			integersList.
//		}
	}

}
