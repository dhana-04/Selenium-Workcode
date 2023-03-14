package openBrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromebrowserJunit {
	@Test
	public void chromeJunit() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://sitrapid.grihashakti.com/security/login");
		
	}
	
	

}
