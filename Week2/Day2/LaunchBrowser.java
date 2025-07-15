package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	
	
	public static void main(String[] args) {
		//Launch the Browser
		//ChromeDriver driver=new ChromeDriver();
		 EdgeDriver driver=new EdgeDriver();
		 
		 //Load the url - get
		 driver.get("https://www.facebook.com/");
		 
		 //Maximize the browser
		 driver.manage().window().maximize();
	}

}






























//https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.13.0


//C:\Users\DELL\.m2\repository\org\seleniumhq\selenium\selenium-java\4.13.0