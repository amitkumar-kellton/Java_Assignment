package assignment;

public class Question_23 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 23: Find the Maximum and Minimum in an Array: Write a program to find the maximum and minimum elements in an array.\n\n");

		int[] numbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 };

		if (numbersArray.length >= 1) {

			int maximumNumber = numbersArray[0];
			int minimumNumber = numbersArray[0];

			int i = 0;
			while (i < numbersArray.length) {

				int j = i + 1;
				while (j < numbersArray.length) {
					if (numbersArray[i] > maximumNumber) {
						maximumNumber = numbersArray[i];
					} else if (numbersArray[i] < minimumNumber) {
						maximumNumber = numbersArray[i];
					}
					j++;
				}
				i++;
			}
			System.out.println("Maximum number is: " + maximumNumber);
			System.out.println("Minimum number is: " + minimumNumber);
		} else {
			System.out.println("Array is empty");
		}

	}
}
