package reUsable_MyContactForm_Time_Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNGassignment2.BaseClass;

public class MyContactForm extends BaseClass {

	@Test
	public void toCheckForm() {

		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

		WebElement user_name = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ReUsableLocator.userName)));
		// WebElement user_name =
		// driver.findElement(By.xpath(ReUsableLocator.userName));
		user_name.sendKeys("Prabhu123");

		WebElement pass_word = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ReUsableLocator.passWord)));
		// WebElement pass_word =
		// driver.findElement(By.xpath(ReUsableLocator.passWord));
		pass_word.sendKeys("Prabhu123");

		pass_word.submit();

		// WebElement message =
		// driver.findElement(By.xpath("//*[@id='right_col_top_err']"));
		// message.getText();
		WebElement ErrorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ReUsableLocator.ErrorMessageToValidate)));
		ErrorMessage.getText();

		//Assert.assertEquals("Incorrect login, please try again", ErrorMessage.getText());
		
		softAssert.assertEquals("Incorrect login, please try again", ErrorMessage.getText());
		softAssert.assertAll();

	}
}
