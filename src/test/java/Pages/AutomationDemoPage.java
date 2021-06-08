package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoPage {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name1']")
	WebElement txtFirtName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder=\"Last Name\"]")
	WebElement txtLastName;

	@FindBy(how = How.XPATH, using = "//textarea[@ng-model=\"Adress\"]")
	WebElement txtAddress;

	@FindBy(how = How.XPATH, using = "//input[@ng-model=\"EmailAdress\"]")
	WebElement txtEmail;
	
	@FindBy(how=How.XPATH,using ="//input[@id=\"imagesrc\"]")
	WebElement btnChoose;
	
	@FindBy(how=How.XPATH,using ="//div[@id=\"msdd\"]")
	WebElement btnLangu;
	
	@FindBy(how=How.XPATH,using ="//a[contains(text(),'Catalan')]")
	WebElement selectValue;	

	// Define webdriver object for the page class
	WebDriver driver;

	// create a constructor
	public AutomationDemoPage(WebDriver driver) {
		driver = driver;
	}

	public void typeFirstName(String fname) {
		txtFirtName.sendKeys(fname);
		System.out.println(txtFirtName.getText());
	}

	public void typeLastName(String lname) {
		txtLastName.sendKeys(lname);
		System.out.println(txtLastName.getText());
	}

	public void typeAddress(String address) {
		txtAddress.sendKeys(address);
		System.out.println(txtAddress.getText());
	}

	public void typeEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void getA() {
		System.out.print("000000000000000000000000000000000)))))))))________+");
		String name= txtEmail.getText();
		System.out.print(name);
	}
	
	public void btnClick() {
		btnChoose.click();
	}
	
	public void selectOption(String name) {
		btnLangu.click();
		selectValue.click();
		
		//driver.findElement(By.xpath("//a[contains(text(),"+name+"]")).click();
	}

}
