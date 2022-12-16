package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import core.BaseCapstone;

@SuppressWarnings("unused")
public class UtilitiesCapstone extends BaseCapstone {

	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	public static void waitUntilElementToBeClickable(WebDriver driver, WebElement element) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForElement(WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void takeScreenShot(String fileName) throws IOException {
		// we need to create a folder at project level and store the path here so that
		// when even we take screenshots, they are all saved in that specific folder
		String path = ".\\output\\screenshots\\";
		// I create object of the file class
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// After taking the screenshot, take the file and store it in a location in my
		// computer
		// and also I want to provide the file_name and the extension
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}

	/*
	 JavaScript Executor
	 sometimes, Selenium WebDriver can encounter problems interacting with a few
	 web elements. For instance, the user opens a URL and there is an unexpected 
	 pop-up that will prevent the WebDriver from locating a specific element and 
	 produce inaccurate results. This is where JavascriptExecutor comes into the picture.

	 JavaScriptExecutor Methods:
	 1- executeAsyncScript: With Asynchronous script, your page renders more quickly. 
	 Instead of forcing users to wait for a script to download before the page renders, 
	 this function will execute an asynchronous piece of JavaScript in the context of the 
	 currently selected frame or window in Selenium.

	 2- executeScript: This method executes JavaScript in the context of the
	 currently selected frame or window in Selenium. The script used in this method 
	 runs in the body of an anonymous function (a function without a name). 
	 We can also pass complicated arguments to it. The script can return values. 
	 Data types returned are Boolean, Long, String, List, and WebElement. 
	 */
	
	// if the .click() does not work, then we get the help JSExecuter
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// How we can give border to an element on webpage
	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid yellow'", element);
	}

	// How we can highlight an element background
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='red'", element);
	}

	// What if we want to do both/above with same method?
	// give border and highlith
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	// How we can scroll down the page with JSExecutor
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// how to sendkeys with JSExecutor
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}

	public static void scrollDownBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}

	public static void scrollUpBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-3000)");
	}

	// How we can scroll Up the page with JSExecutor
	public static void scrollupPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static String getEmail() {
		Faker faker = new Faker ();
		String email = faker.name().firstName().toLowerCase() + faker.name().lastName() + "@test.com";
		return email;
		}
	
	public static String getPassword() {
		Faker faker = new Faker();
		String password = faker.funnyName().name();
		return password;
	}

	public static String getFirstName() {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		return firstName;
	}

	public static String getTitle() {
		Faker faker = new Faker();
		String title = faker.name().title();
		return title;
	}

	public static String getLastName() {
		Faker faker = new Faker();
		String lastName = faker.name().lastName();
		return lastName;
	}

	public static String getGender() {
		Faker faker = new Faker();
		String gender = faker.name().bloodGroup();
		return gender;
	}

	public static JSONObject getValues () {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		Faker faker = new Faker();
		String email = faker.name().firstName().toLowerCase() + faker.name().lastName() + "@test.com";
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String title = faker.name().title();
		String gender = faker.demographic().sex();
		String maritalStatus = faker.demographic().maritalStatus();
		String employmentStatus = faker.job().position();
		String dateOfBirth = date;
		String languagePref = faker.random().toString();
		String addressType = faker.address().country();
		String addressLine1 = faker.address().fullAddress();
		String city = faker.address().cityName();
		String state = faker.address().state();
		String postalCode = faker.address().zipCode();
		String countryCode = faker.address().countryCode();
		String phoneNumber = faker.phoneNumber().cellPhone();
		String phoneExtension = faker.phoneNumber().extension();
		String phoneTime = faker.address().timeZone();
		String phoneType = faker.phoneNumber().cellPhone();

		JSONObject json = new JSONObject ();
		json.put("email", email);
		json.put("title", title);
		json.put("firstName", firstName);
		json.put("lastName", lastName);
		json.put("gender", gender);
		json.put("maritalStatus", maritalStatus);
		json.put("employmentStatus", employmentStatus);
		json.put("dateOfBirth", dateOfBirth);
		json.put("languagePref", languagePref);
		json.put("addressType", addressType);
		json.put("addressLine1", addressLine1);
		json.put("city", city);
		json.put("state", state);
		json.put("postalCode", postalCode);
		json.put("countryCode", countryCode);
		json.put("phoneNumber", phoneNumber);
		json.put("phoneExtension", phoneExtension);
		json.put("phoneTime", phoneTime);
		json.put("phoneType", phoneType);

		return json;

	}

	
//	@SuppressWarnings("deprecation")
//	public static void waitAndClickElement(WebElement element) {
//		boolean clicked = false;
//		int attempts = 0;
//		while (!clicked && attempts < 10) {
//			try {
//				wait = new WebDriverWait(driver, 20);
//				wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//				System.out.println("Successfully clicked on the WebElement: " + "=" + element.toString());
//				clicked = true;
//			} catch (Exception e) {
//				try {
//					logger.info("Failed to click the element");
//				} catch (Exception e2) {
//				}
//				Assert.fail("Unable to click the element: " + "=" + element.toString());
//			}
//			attempts++;
//		}
//	}
}

