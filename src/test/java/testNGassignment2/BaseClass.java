package testNGassignment2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected WebDriver driver;
	public WebDriverWait wait;
	public SoftAssert softAssert;
	
@BeforeTest
	public void openBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		softAssert = new SoftAssert();
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
@AfterTest
	public void closeBrowser() {

		//driver.quit();
	}

}
