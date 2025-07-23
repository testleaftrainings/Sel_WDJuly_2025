package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Declare a Set
		//Set<String> mentors=new HashSet<String>();
		
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		System.out.println(mentors);
		
		
		//add
		mentors.add("Harrish");
		mentors.add("Vinoth");
		mentors.add("Seenivasan");
		System.out.println(mentors);
		
		//Duplicate
		mentors.add("vinoth");
		System.out.println("Set after adding duplicate value is: "+mentors);

	    //to get the number of element
		int sizeOfSet = mentors.size();
		System.out.println("The size of set is: "+sizeOfSet);
	
	    //Remove an element
		mentors.remove("Vinoth");
		System.out.println("The set after removing a data: "+mentors);
	
	    //To retrieve a particular value
		//Convert the set into list- copy all the data from Set to List
		//use get method to retrieve a particular value
		
		//Create a empty List
		List<String> trainers=new ArrayList<String>(mentors);
		System.out.println("The list is: "+trainers);
		String valueAtIndex1 = trainers.get(1);
		System.out.println(valueAtIndex1);
	}

}
