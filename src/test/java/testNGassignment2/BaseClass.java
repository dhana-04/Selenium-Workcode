package testNGassignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
@BeforeTest
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
@AfterTest
	public void closeBrowser() {

		driver.quit();
	}

}
