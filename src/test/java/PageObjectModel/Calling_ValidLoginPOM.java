package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calling_ValidLoginPOM {
	WebDriver driver;

	@Test
	public void loginMethod() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.mycontactform.com/");
		// new ValidLoginPOM().valid_login();
		ValidLoginPOM enterPage = PageFactory.initElements(driver, ValidLoginPOM.class);

		enterPage.invalid_login().empty_login().valid_login().initiateWizard();

	}

}
