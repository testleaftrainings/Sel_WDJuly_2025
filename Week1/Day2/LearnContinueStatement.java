package week1.day2;

public class LearnContinueStatement {

	// Skips the current iteration value
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println(i);

		}

	}

}
