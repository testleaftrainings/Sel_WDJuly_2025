package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		        //Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				
				 //Load the url - get
				 driver.get("https://leafground.com/frame.xhtml");
				 
				 //Maximize the browser
				 driver.manage().window().maximize();
				 
				 //Switch to the outer frame
				 driver.switchTo().frame(2);
				 //WebElement outerFrameEle = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
				 //driver.switchTo().frame(outerFrameEle);
				 
				 //Switch to the inner frame
                 driver.switchTo().frame("frame2");
				 //driver.switchTo().frame(0);
                 
                 //Click on the Element
                 driver.findElement(By.id("Click")).click();
                 
                 //Switch to the immediate parent frame
                 driver.switchTo().parentFrame();
                 
                 //Switch to the main webpage
                 driver.switchTo().defaultContent();
                 
                 
	}

}
