package ownc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.path.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public @interface webtest {
	Browser browser() default Browser.ie;
	
	WebDriver driver = new ChromeDriver();
	
//	public void lunch() {
//		
//		
//		
//		
//	}


}
