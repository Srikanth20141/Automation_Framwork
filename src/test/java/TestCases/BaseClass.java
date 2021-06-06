package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.path.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;
import ownc.Browser;
import ownc.Names;

public class BaseClass {

	protected BaseClass() {

	}

	WebDriver driver;
	Logger logger;

	// take screenshorts
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		logger.info("Screenshot taken...");
	}

	@Parameters("browser")
	@BeforeTest
	public void lunchBrowser(String browser) {
		logger = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("log4j.properties");

		if (browser.equals(Names.CHROME)) {
			//System.getProperty("", FrameworkConstants.getChromdriverpath() );
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			logger.info("Chrome browser started");
		} else if (browser.equals(Names.FIREFOX)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("Firefox browser started");
		} else if (browser.equals(Browser.edge)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("Edge browser started");
		} else if (browser.equals(Browser.ie)) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			logger.info("Internet Explorer browser started");
		}
		driver.get("http://demo.automationtesting.in/Register.html");

	}

	@AfterTest
	public void closeBrowser() {
		// driver!=null
		if (Objects.nonNull(driver)) {
			 //driver.quit();
		}

	}

}
