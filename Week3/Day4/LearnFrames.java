package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://leafground.com/frame.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Switch to the frame
		driver.switchTo().frame(0);

		driver.findElement(By.id("Click")).click();

	}

}
