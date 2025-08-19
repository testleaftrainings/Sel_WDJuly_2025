package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginFunction {
	@Test
	public void main() {
		//Launch the Browser
		//ChromeDriver driver=new ChromeDriver();
		 EdgeDriver driver=new EdgeDriver();
		 
		 //Load the url - get
		 driver.get("https://www.facebook.com/");
		 
		 //Maximize the browser
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("email1")).sendKeys("vineeth");
		 
	}

}
