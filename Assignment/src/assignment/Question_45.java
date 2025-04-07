package assignment;

import java.util.ArrayList;
import java.util.List;

public class Question_45 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 45- Check if a List is Empty – Verify if a list is empty.\n\n");

		List<Integer> integersList = new ArrayList<>();
		
//		integersList.add(2);

		if (integersList.isEmpty()) {
			System.out.println("List is empty...");
		} else {
			System.out.println("List is not empty...");
		}
	}

}
