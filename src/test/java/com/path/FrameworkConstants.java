package com.path;

public class FrameworkConstants {
	
	private static final String CHROMDRIVERPATH = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	private static final String FIREFOXDRIVERPATH = System.getProperty("user.dir")+"\\Drivers\\geckodriver44.exe";
	private static final String EDGEDRIVERPATH = System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe";

	public static String getChromdriverpath() {
		return CHROMDRIVERPATH;
	}

	public static String getFirefoxdriverpath() {
		return FIREFOXDRIVERPATH;
	}

	public static String getEdgedriverpath() {
		return EDGEDRIVERPATH;
	} 

}
