package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnInvocationCount {

@Test(invocationCount=3,threadPoolSize = 3)
public void launchBrowser() {
	ChromeDriver driver=new ChromeDriver();

}

}
