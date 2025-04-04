package assignment;

public class Question_22 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 22: Find Duplicate Elements in an Array: Write a program to find duplicate elements in an array.\n\n");

		int[] numbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 };

		int i = 0;
		while (i < numbersArray.length) {
			int j = i + 1;
			while (j < numbersArray.length) {
				if (numbersArray[i] == numbersArray[j]) {
					System.out.println("Duplicate number is: " + numbersArray[i]);
				}
				j++;
			}
			i++;
		}
	}
}
