package week6.day3;

public class AccountDetails {

	public static void main(String[] args) {
		FetchDetails details=new FetchDetails();
		details.set(12345);
		int number = details.get();
		System.out.println(number);
	}

}
