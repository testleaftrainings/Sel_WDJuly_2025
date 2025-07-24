package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://www.leafground.com/alert.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		// Transfer the focus
		Alert promptAlert = driver.switchTo().alert();

		promptAlert.sendKeys("Vineeth");

		promptAlert.accept();

	}

}
