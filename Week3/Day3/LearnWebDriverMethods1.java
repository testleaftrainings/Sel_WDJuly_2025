package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebDriverMethods1 {

	public static void main(String[] args) {
		// Launch Edge Browser
		EdgeDriver driver = new EdgeDriver();

		// Load Url
		driver.get("https://leafground.com/input.xhtml");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Retrieve a text from a web element
		String text = driver.findElement(By.xpath("//h5[text()='Type your name']")).getText();
		System.out.println("The text on the element is: " + text);

		// getAttribute
		String attribute = driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("value");
		System.out.println(attribute);

		boolean enabled = driver.findElement(By.id("j_idt88:j_idt91")).isEnabled();
		System.out.println(enabled);

		// isDisplayed
		boolean displayed = driver.findElement(By.id("j_idt88:j_idt91")).isDisplayed();
		System.out.println(displayed);
	}

}
