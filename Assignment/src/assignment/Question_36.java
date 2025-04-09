package assignment;

public class Question_36 {

	public static void main(String[] args) {

		System.out.println(
				"\nQuestion 36- Find Common Elements in Two Arrays – Identify common values in two arrays.\n\n");

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2 = { 7, 8, 9, 10, 6, 12 };

		int i = 0;
		while (i < array1.length) {
			int j = 0;
			while (j < array2.length) {
				if (array1[i] == array2[j]) {
					int commonValues = array2[j];
					System.out.println("Common Values: " + commonValues);
				}
				j++;
			}
			i++;
		}

	}

}
