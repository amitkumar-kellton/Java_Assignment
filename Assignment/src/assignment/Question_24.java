package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_24 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 24- Sort an Array Using Collections.sort(): Write a program to sort a list of integers using the Collections.sort() method.\n\n");
		
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(5);
		numbersList.add(2);
		numbersList.add(8);
		numbersList.add(1);
		numbersList.add(4);
		numbersList.add(3);
		numbersList.add(7);
		numbersList.add(6);
		numbersList.add(10);
		numbersList.add(9);
		numbersList.add(12);
		
		System.out.println("Before sorting: " + numbersList);
		
		Collections.sort(numbersList);
		
		System.out.println("After sorting: " + numbersList);
		
		
	}

}
