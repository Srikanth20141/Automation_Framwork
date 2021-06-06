package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;



import Pages.AutomationDemoPage;
import jline.internal.Log;
import ownc.Browser;
import ownc.webtest;
import ownc.Actions;
import ownc.Actions.*;

public class Testcase1 extends BaseClass{
	@Test
	public void Registration() throws Exception {
		int x;
		logger = Logger.getLogger("TestCase1");
		AutomationDemoPage automationPage = PageFactory.initElements(driver, AutomationDemoPage.class);
		
//		static String FolderName = "TC-ItemCreation";
//		static String FileName = "featureStyleData.properties";
	    
		//List<ItemCreationContext> itemAndSkuDataList= new ArrayList<ItemCreationContext>();
		
		//static PropertyFileData itemDate = new PropertyFileData(FolderName, FileName);	

		Properties pro = new Properties();
		InputStream inputStr = new FileInputStream("C:\\Users\\ssa\\eclipse-workspace\\com.tiqri.automation\\Files\\test1.properies");
		pro.load(inputStr);

		String fname = pro.getProperty("firstname");
		String lname = pro.getProperty("lastname");
		String address = pro.getProperty("address");
		String email = pro.getProperty("email");
		
		System.out.println();
		System.out.println();
		automationPage.typeFirstName(fname);
		//log("srikanth");
		logger.info("Firstname entered");
		automationPage.typeLastName(lname);
		logger.info("Lastname entered");
		automationPage.typeAddress(address);
		logger.info("Address entered");
		automationPage.typeEmail(email);
		//automationPage.getA();
		logger.info("Email entered--------");
		//automationPage.portfolioRenewalSearch("Catalan");
		//automationPage.selectOption("Dutch");
		//automationPage.selectOption("English");
		captureScreen(driver,"Screenshot1");
		captureScreen(driver,"After Register");
		
		Thread.sleep(5000);



	} 

	//@Test
	public void test() throws FindFailed, InterruptedException  {
		Log.info("====Sikuli Started====");
		Screen sc = new Screen();
		Pattern chooseFile = new Pattern("C:\\Users\\ssa\\git\\Automation_Framwork\\Files\\Capture.PNG");
		Pattern openButton = new Pattern("C:\\Users\\ssa\\git\\Automation_Framwork\\Files\\openButton.PNG");
		Pattern fileInputTextBox = new Pattern("C:\\Users\\ssa\\git\\Automation_Framwork\\Files\\fileInputTextBox.PNG");
		
		sc.click(chooseFile);
		System.out.println("after click------");
		//sc.wait(fileInputTextBox,5);
		Thread.sleep(5000);
		sc.click(fileInputTextBox);
		System.out.println("srika");
		Log.info("====Click on file input textBox====");
		sc.type(fileInputTextBox,"C:\\Users\\ssa\\git\\Automation_Framwork\\Files\\Appium.txt");
		sc.click(openButton);
		Log.info("====Click on open button====");

	}

}
