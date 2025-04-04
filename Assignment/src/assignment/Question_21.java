package assignment;

public class Question_21 {
	public static void main(String[] args) {
		System.out.println(
				"\nQuestion 21: Find the Missing Number in an Array: Given an array of integers from 1 to n with one number missing, write a program to find the missing number.\n\n");

		int[] numbersArray = { 2, 3, 4, 5, 7, 8, 9, 10 };
		int num = numbersArray[0];

		int index = 0;
		while (index < numbersArray.length) {
			if (numbersArray[index] == num) {
				System.out.println("Number is present: " + num);
				num++;
			} else {
				System.out.println("Missing number is: " + num);
				num += 2;
			}
			index++;
		}
	}
}
