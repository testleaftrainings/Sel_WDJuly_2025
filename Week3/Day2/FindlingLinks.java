package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindlingLinks {

	public static void main(String[] args) {
		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load Url
		driver.get("https://www.facebook.com/");

		// Maximize the Browser
		driver.manage().window().maximize();

		// multiple elements
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		// [WE1, WE2, WE3,...............................WE42]

		// To count the number of element
		int numberOfLinks = allElements.size();
		System.out.println("The number of links is: " + numberOfLinks);

		// Declare the String List
		List<String> allLinks = new ArrayList<String>();

		for (int i = 0; i < numberOfLinks; i++) {
			String text = allElements.get(i).getText();
            allLinks.add(text);

		}
		System.out.println(allLinks);

	}

}
