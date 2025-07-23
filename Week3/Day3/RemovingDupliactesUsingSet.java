package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDupliactesUsingSet {

	public static void main(String[] args) {
		// Declare an Array
		// 0 1 2 3 4 5 6
		int number[] = { 2, 3, 5, 3, 7, 5, 9 };

		// Declare an empty Set
		Set<Integer> unique = new LinkedHashSet<Integer>();

		for (int i = 0; i < number.length; i++) {
			unique.add(number[i]);
			// unique.add(number[0]); [2]
			// unique.add(number[1]); [2,3]
			// unique.add(number[2]); [2,3,5]
			// unique.add(number[3]); [2,3,5]
			// unique.add(number[4]); [2,3,5,7]
			// unique.add(number[5]); [2,3,5,7]
			// unique.add(number[6]); [2,3,5,7,9]
			System.out.println("The set is: " + unique);
		}
		// System.out.println("The set is: "+unique);
	}

}
