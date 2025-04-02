package assignment;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		System.out.println("\nQuestion 4- Remove Duplicates from a String: Write a program to remove duplicate characters from a string.\n\n");

		Scanner scanner = new Scanner(System.in);
		
		String stringToBeChecked = scanner.nextLine();
		String result = "";
		
		for (int i = 0; i < stringToBeChecked.length(); i++) { 
		    boolean isDuplicate = false;

		    for (int j = 0; j < i; j++) {
		        if (stringToBeChecked.charAt(i) == stringToBeChecked.charAt(j)) {
		            isDuplicate = true;
		            break;
		        }
		    }

		    if (!isDuplicate) { 
		        result += stringToBeChecked.charAt(i);
		    }
		}	
		
		
		System.out.println("\nThe string after removing duplicates is: " + result);


		scanner.close();
	}

}
