package week2.day2;

public class LearnString {

	public static void main(String[] args) {

		// Literal
		String str1 = "TestLeaf";
		String str3 = "TestLeaf";

		// Instantiation
		String str2 = new String("TestLeaf");
		String str4 = new String("TestLeaf");

		// .equals - compare the values of 2 Strings
		System.out.println(str1.equals(str3)); //

		// == - compare the reference address of 2 Strings
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		System.out.println("----------------");

		String batchName = "Selenium July";

		// To get the length of the String
		int lengthOfString = batchName.length();
		System.out.println("The length of String is: " + lengthOfString);

		// contains - partial value
		boolean contains = batchName.contains("Selenium");
		System.out.println(contains);

		// equalsIgnoreCase
		System.out.println(batchName.equalsIgnoreCase("selenium july"));

		// toUpperCase - Convert the String value into uppercase
		String upperCase = batchName.toUpperCase();
		System.out.println(upperCase);

		// toLowerCase
		String lowerCase = batchName.toLowerCase();
		System.out.println(lowerCase);

		// toCharArray - Convert a String into a Character Array
		String batch = "Selenium";
		// 0 1 2 3 4 5 6 7
		// {'S','e','l','e','n','i','u','m'}

		char[] letters = batch.toCharArray();
		System.out.println(letters[5]);

		// charAt
		char charAt2 = batch.charAt(2);
		System.out.println(charAt2);

		// subString - Convert a String into a smaller String
		String month = "July2025";

		String substring = month.substring(2);
		System.out.println(substring);

		String substring2 = month.substring(2, 4);
		System.out.println(substring2);

		// Split method
		// Convert 1 String into multiple Strings

		String currentBatch = "Sel july 2025";
		// 0 1 2
		// {"Sel", "July", "2025"}

		String[] split = currentBatch.split(" ");
		System.out.println(split[0]);

		int amount = 100;
		System.out.println(amount + 20);

		String rupee = "100";
		System.out.println(rupee + 20);

		int parseInt = Integer.parseInt(rupee);
		System.out.println(parseInt + 20);

		String rs = "100rupee";
		String replaceAll = rs.replaceAll("rupee", "");
		System.out.println(replaceAll);

	}

}
