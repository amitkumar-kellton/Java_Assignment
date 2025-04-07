package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question_46 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 46- Shuffle a List – Randomly shuffle the elements of a list.\n\n");
		
		List<Integer> integersList = new ArrayList<>();
		
		Random random = new Random();
		
		integersList.add(2);
		integersList.add(4);
		integersList.add(6);
		integersList.add(8);
		integersList.add(10);
		integersList.add(12);
		
		System.out.println("\nIntegers List: " + integersList);
		
		int size = integersList.size();
		
		int i = 0;
		while(i < size) {
			int randomNumber = random.nextInt(size);
			
			int temp = integersList.get(randomNumber);
			integersList.set(randomNumber, integersList.get(i));
			integersList.set(i, temp);
			
			i++;
		}
		
		System.out.println("\nIntegers List after shuffle: " + integersList);
		
	}

}
