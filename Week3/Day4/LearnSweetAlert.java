package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://www.leafground.com/alert.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click on the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();

		// Click on the dismiss button
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
