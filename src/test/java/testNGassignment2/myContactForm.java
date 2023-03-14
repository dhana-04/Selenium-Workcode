package testNGassignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class myContactForm extends BaseClass {
	
	@Test 
	public void openMyContactForm() {

		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/");
		WebElement login = driver.findElement(By.xpath("//*[@id='user']"));
		login.sendKeys("Prabhu123");
		WebElement Password = driver.findElement(By.xpath("//*[@id='pass']"));
		Password.sendKeys("12345");
		Password.submit();
		WebElement NewForm = driver.findElement(By.linkText("New Form Wizard"));
		NewForm.click();
		WebElement StartWizard = driver.findElement(By.xpath("//*[@id='center_col']/form/div/input"));
		StartWizard.click();
		WebElement FormName = driver.findElement(By.xpath("//*[@id='formname']"));
		FormName.sendKeys(Keys.SHIFT, "Dharshini");
		// *[@id="Submit"]
		WebElement Next_1 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_1.click();
		WebElement Next_2 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_2.click();
		WebElement Next_3 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_3.click();
		WebElement Next_4 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_4.click();
		WebElement SubjectName = driver.findElement(By.xpath("//*[@id='subjectvalue']"));
		SubjectName.sendKeys("Book fare Method");
		WebElement Next_5 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_5.click();
		WebElement Next_6 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_6.click();
		WebElement AutoName = driver.findElement(By.xpath("//*[@id='autosub']"));
		AutoName.sendKeys("The book wizard");
		WebElement AutoName_2 = driver.findElement(By.xpath("//*[@id='autotext']"));
		AutoName_2.sendKeys("Approving the wizard");
		WebElement Next_7 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_7.click();
		WebElement Next_8 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_8.click();
		WebElement NumQuestion = driver.findElement(By.xpath("//*[@id='numquestions']"));
		NumQuestion.sendKeys("1");
		WebElement Next_9 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_9.click();
		WebElement Test_1 = driver.findElement(By.xpath("//*[@id='question[]']"));
		Test_1.sendKeys("Test the field A");
		WebElement Next_10 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_10.click();
		WebElement Next_11 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_11.click();
		WebElement Next_12 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_12.click();
		WebElement Next_13 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_13.click();
		WebElement Next_14 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_14.click();
		WebElement Next_15 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_15.click();
		WebElement Next_16 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_16.click();
		WebElement Next_17 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_17.click();
		WebElement Next_18 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_18.click();
		WebElement Next_19 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_19.click();
		WebElement Next_20 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_20.click();
		WebElement Next_21 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_21.click();
		WebElement Next_22 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_22.click();
		WebElement Next_23 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_23.click();
		WebElement Next_24 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next_24.click();
		WebElement Logout = driver.findElement(By.linkText("Logout"));
		Logout.click();
	}

}
