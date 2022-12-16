package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.BaseCapstone;
import utilities.UtilitiesCapstone;

public class HomePageObjects extends BaseCapstone {

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

// Page Functions

	// Page Functions

	@FindBy(xpath = "//a[normalize-space()='TEST ENVIRONMENT']")
	private WebElement retailPageTitle;
	@FindBy(xpath = "//input[@class='form-control input-lg']")
	private WebElement searchBox;
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cartButton;

	// Main Sections

	@FindBy(css = "#top")
	private WebElement top_Bar;
	@FindBy(css = "body header")
	private WebElement body_Header;
	@FindBy(css = "body footer")
	private WebElement body_Footer;
	@FindBy(css = ".breadcrumb")
	private WebElement breadCrumb_Bar;
	@FindBy(css = ".collapse.navbar-collapse.navbar-ex1-collapse")
	private WebElement navigation_Bar;
	@FindBy(xpath = "//div[@id='content']")
	private WebElement product_Content_Grid;
	@FindBy(xpath = "//div[@id='product-category']")
	private WebElement product_Category;
	@FindBy(xpath = "//aside[@id='column-left']")
	private WebElement left_Column;

// Page Automation Elements

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[1]/form[1]/div[1]/button[1]")
	private WebElement currencyDropDown;
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euro;
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroCurrencySign;
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement shoppingCart;
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement shoppingCartMessage;
	
	@FindBy (xpath = "//button[@class='currency-select btn btn-link btn-block']")
	List <WebElement> currencyTypes;

// Page Automation Methods

	public void clickOnCurrencyDropDown() {
		currencyDropDown.click();
	}
	
	public void selectCurrencyType(String currencyr) {
		
		List<WebElement> currencySelection = currencyTypes;
		for (WebElement element : currencySelection) {
			if (element.getAttribute("name").equals("EUR")) { // important factor is EUR in here not the currency on Homepage Steps
				element.click();
				break;
			}
		}
	}

	public void getEuroCurrencySign() throws IOException {
		String currencySign = euroCurrencySign.getText();
		System.out.println(currencySign);
		UtilitiesCapstone.highlightelementBorderAndBackground(euroCurrencySign);
		UtilitiesCapstone.takeScreenShot("Home Page 1 - Currency Sign");
	}

	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	public void getShoppingCartMessage(String expectedShoppingCartMessage) throws IOException {
		String actualShoppingCartMessage = shoppingCartMessage.getText();
		Assert.assertEquals(expectedShoppingCartMessage, actualShoppingCartMessage) ;
		UtilitiesCapstone.highlightelementBorderAndBackground(shoppingCartMessage);
		UtilitiesCapstone.takeScreenShot("Home Page 2 - Shopping Cart Message");
	}
	
	// Alternative method for Currency Type Selection:
//		public void selectCurrencyFromDropdown() {
//		List<WebElement> currencyDropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
//		for (int i = 1; i < currencyDropdown.size(); i++) {
//			WebElement currencyList = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li["+i+"]"));
//			String strCurrency = currencyList.getText();
//			if(strCurrency.equalsIgnoreCase("$ US Dollar")) {
//				Utilities.waitAndClickElement(currencyList);
//			}else {
//				System.out.println("Your currency was not found in the list");
//			}
//		}
//	}
	
}
