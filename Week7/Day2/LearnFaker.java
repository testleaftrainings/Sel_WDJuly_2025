package week7.day2;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
		Faker fakeOptions = new Faker();

		//firstname
		String firstName = fakeOptions.name().firstName();
		System.out.println(firstName);

		//lastname
		String lastName = fakeOptions.name().lastName();
		System.out.println(lastName);

		// companyName
		String companyName = fakeOptions.company().name();
		System.out.println(companyName);

		// Email id
		String emailAddress = fakeOptions.internet().emailAddress();
		System.out.println(emailAddress);

	}

}
