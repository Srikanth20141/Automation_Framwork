package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AutomationDemoPage;
public class Testcase1 extends BaseClass{


	@Test
	public void Registration() throws IOException, InterruptedException {
		logger = Logger.getLogger("TestCase1");
		AutomationDemoPage automationPage = PageFactory.initElements(driver, AutomationDemoPage.class);

		Properties pro = new Properties();
		InputStream inputStr = new FileInputStream("C:\\Users\\ssa\\eclipse-workspace\\com.tiqri.automation\\Files\\test1.properies");
		pro.load(inputStr);

		String fname = pro.getProperty("firstname");
		String lname = pro.getProperty("lastname");
		String address = pro.getProperty("address");
		String email = pro.getProperty("email");

		automationPage.typeFirstName(fname);
		logger.info("Firstname entered");
		automationPage.typeLastName(lname);
		logger.info("Lastname entered");
		automationPage.typeAddress(address);
		logger.info("Address entered");
		automationPage.typeEmail(email);
		logger.info("Email entered");
		//automationPage.btnClick();
		captureScreen(driver,"Screenshot1");
		captureScreen(driver,"After Register");
		
		Thread.sleep(5000);



	} 

//	@Test
//	public void test() throws FindFailed  {
//		Screen sc = new Screen();
//		Pattern open = new Pattern("C:\\Users\\ssa\\eclipse-workspace\\com.tiqri.automation\\Files\\Capture.PNG");
//
//		sc.click(open);
//
//	}

}
