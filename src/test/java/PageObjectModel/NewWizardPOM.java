package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewWizardPOM {

	@FindBy(how = How.XPATH, using = "//*[@id='user_bar']/ul/li[2]/a")
	WebElement newForm;


	public void initiateWizard() {
		this.newForm.click();

	}

}
