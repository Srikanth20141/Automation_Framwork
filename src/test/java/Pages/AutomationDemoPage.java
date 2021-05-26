package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationDemoPage {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	WebElement txtFirtName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder=\"Last Name\"]")
	WebElement txtLastName;

	@FindBy(how = How.XPATH, using = "//textarea[@ng-model=\"Adress\"]")
	WebElement txtAddress;

	@FindBy(how = How.XPATH, using = "//input[@ng-model=\"EmailAdress\"]")
	WebElement txtEmail;
	
	@FindBy(how=How.XPATH,using ="//input[@id=\"imagesrc\"]")
	WebElement btnChoose;

	// Define webdriver object for the page class
	WebDriver driver;

	// create a constructor
	public AutomationDemoPage(WebDriver driver) {
		driver = driver;
	}

	public void typeFirstName(String fname) {
		txtFirtName.sendKeys(fname);
	}

	public void typeLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void typeAddress(String address) {
		txtAddress.sendKeys(address);
	}

	public void typeEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void btnClick() {
		btnChoose.click();
	}

}
