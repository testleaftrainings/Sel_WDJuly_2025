package week6.day4;

public class LearnThrow {

	public static void main(String[] args) {
		
		int age=-18;
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}

		if(age<=0) {
			throw new ArithmeticException("Age is negative");
		}
		
	}

}
