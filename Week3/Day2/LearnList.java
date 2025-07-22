package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declare a List containing learners name

		List<String> learnersList = new ArrayList<String>();
		// Empty List
		System.out.println("The list is: " + learnersList);

		// add value to the List
		learnersList.add("Bharath");
		System.out.println("The current list is: " + learnersList);

		// add more value
		learnersList.add("Rajesh");
		learnersList.add("Ventakesh");
		System.out.println("List after adding multiple values :" + learnersList);

		// duplicate value
		learnersList.add("Rajesh");
		System.out.println("List after addimg duplicate: " + learnersList);

		// add the value based on index
		learnersList.add(1, "Selvi");
		System.out.println("The current list is: " + learnersList);

		// Remove a value
		learnersList.remove(2);
		System.out.println("The List after removing: " + learnersList);

        // get - To retrieve a particular value -index
		String valueAtIndex1 = learnersList.get(2);
		System.out.println(valueAtIndex1);

		// To get the number of elements in a list
		int sizeOfList = learnersList.size();
		System.out.println("The size is : " + sizeOfList);

		// sort - To arrange the List in Order
		Collections.sort(learnersList);
		System.out.println("The list after sorted: " + learnersList);

		// addAll - adding all the data from one list to another list

		// Declare 1 empty List
		List<String> employees = new ArrayList<String>();
		System.out.println(employees);
		employees.addAll(learnersList);
		System.out.println("List after adding: " + employees);

		// clear- Remove all the data from a List
		learnersList.clear();
		System.out.println("The current list is: " + learnersList);
	}

}
