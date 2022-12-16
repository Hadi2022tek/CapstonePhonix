package core;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCapstone {
	
	// to add the src/test/resources folder you can right click the project and select new source folder

	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private String propertyPath = ".\\src\\test\\resources\\input\\properties.properties";
	private String log4jPath = ".\\src\\test\\resources\\input\\log4j.properties";
	
	@SuppressWarnings("static-access")
	public BaseCapstone() {
		
		try {
			//here we are creating BufferedReader class object in order to be able to read the data from properties file
			BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
			//we are creating object of .properties class
			properties = new Properties();
			properties.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger = logger.getLogger("logger_File");
		PropertyConfigurator.configure(log4jPath);
	}
	//This method will return the url for the website for us
	public static String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
	//this method will return the browser for us
	public static String getBrowser() {
		String browser = properties.getProperty("browser");
		return browser;
	}
	//we need to write a method to launch the browser
	public static void openBrowser() {
		driver.get(getUrl());
	}
	//this method will close/quit browser(s) for us
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	//we will use webdrivermanager so that we don't have to download webdriver for all browsers
	public static void browser() {
		
		String browserName = getBrowser();
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//delete all browser cookies
		driver.manage().deleteAllCookies();
	}
	
	
}
