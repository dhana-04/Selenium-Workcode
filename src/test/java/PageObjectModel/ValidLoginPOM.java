package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ValidLoginPOM {

	WebDriver driver;

	public ValidLoginPOM(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='user']")
	WebElement username;
	@FindBy(how = How.XPATH, using = "//*[@id='pass']")
	WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public ValidLoginPOM invalid_login() {
		getUsername().sendKeys("Prabhu1231");
		getPassword().sendKeys("12345");
		getPassword().submit();
		return this;
	}

	public ValidLoginPOM empty_login() {
		getUsername().sendKeys("");
		getPassword().sendKeys("");
		getPassword().submit();
		return this;
	}

	public NewWizardPOM valid_login() {
		getUsername().sendKeys("Prabhu123");
		getPassword().sendKeys("12345");
		getPassword().submit();
		return PageFactory.initElements(driver, NewWizardPOM.class);

	}
}
