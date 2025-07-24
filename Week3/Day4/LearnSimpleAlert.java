package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://www.leafground.com/alert.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click on the Show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		// Click on the show button
		// driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

		// Transfer the focus
		Alert simpleAlert = driver.switchTo().alert();

		String text = simpleAlert.getText();
		System.out.println(text);

		Thread.sleep(5000);
		simpleAlert.accept();

	}

}
