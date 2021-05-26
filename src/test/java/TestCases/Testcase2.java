package TestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testcase2 {
	Logger logger;

	//@Test
	public void f() throws MalformedURLException, InterruptedException {
		logger = Logger.getLogger("TestCase1");
		PropertyConfigurator.configure("log4j.properties");
		AndroidDriver<AndroidElement> driver;
		File app = new File(System.getProperty("user.dir"), "\\Files\\App1.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		System.out.println(driver.getCapabilities().getCapability("platformVersion"));
		System.out.println(driver.getCapabilities().getCapability("appPackage"));
		Thread.sleep(10000);

		driver.findElement(By.id("signin_button")).click();
		Thread.sleep(10000);
		logger.info("Sigin button clicked");

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")).click();
		Thread.sleep(10000);
		logger.info("Email signup clicked ");

		driver.findElement(By.id("email_edit")).sendKeys("Srikakth@gmail.com");
		Thread.sleep(10000);
		logger.info("Email address entered  ");

		driver.findElement(By.id("nextBtn")).click();
		Thread.sleep(5000);
		logger.info("Next button clicked");

	}
}
