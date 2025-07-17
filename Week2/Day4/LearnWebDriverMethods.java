package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
		// Launch Edge Browser
		EdgeDriver driver = new EdgeDriver();

		// Load Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);

		// To get the url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String text = driver.findElement(By.linkText("CRM/SFA")).getText();
		System.out.println(text);

		// To get the page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
