package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	@Test()
	public void loginFunction() {
		System.out.println("Login completed");

	}
	
	@Test()
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment completed");
	}
	
	@Test(priority=3,enabled=false)
	public void searchProduct() {
		// TODO Auto-generated method stub
		System.out.println("SearchProduct completed");
	}

}
