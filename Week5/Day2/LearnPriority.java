package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test
	public void loginFunction() {
		System.out.println("Login completed");

	}
	
	@Test(priority=3)
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment completed");
	}
	
	@Test(priority=2)
	public void searchProduct() {
		// TODO Auto-generated method stub
		System.out.println("SearchProduct completed");
	}

}
