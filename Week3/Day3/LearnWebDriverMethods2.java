package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebDriverMethods2 {

	public static void main(String[] args) {
		// Launch Edge Browser
		EdgeDriver driver = new EdgeDriver();

		// Load Url
		driver.get("https://leafground.com/link.xhtml");

		// Maximize the Browser
		driver.manage().window().maximize();
		
		String attribute = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
        System.out.println(attribute);
	}

}
