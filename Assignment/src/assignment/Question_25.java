package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_25 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 25- Merge Two Sorted Lists: Given two sorted lists, write a program to merge them into a single sorted list.\n\n");

		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		List<Integer> mergerdList = new ArrayList<>();

		firstList.add(1);
		firstList.add(3);
		firstList.add(5);
		firstList.add(7);
		firstList.add(9);
		firstList.add(2);
		firstList.add(4);
		
		Collections.sort(firstList);
		System.out.println("First List: " + firstList);

		secondList.add(6);
		secondList.add(8);
		secondList.add(10);
		secondList.add(12);
		secondList.add(14);
		secondList.add(16);
		secondList.add(18);
		secondList.add(20);
		
		Collections.sort(secondList);
		System.out.println("Second List: " + secondList);
		
		mergerdList.addAll(firstList);
		mergerdList.addAll(secondList);
		Collections.sort(mergerdList);
		System.out.println("Merged List: " + mergerdList);
		
		

	}

}
