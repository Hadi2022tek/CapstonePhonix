package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;

public class TabletsPageObjects extends BaseCapstone{
	
	public TabletsPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
// Page Functions
	
		@FindBy (xpath = "//a[normalize-space()='TEST ENVIRONMENT']")
		private WebElement testEnvironment;
		@FindBy(xpath = "//input[@class='form-control input-lg']")
		private WebElement searchBox;
		@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
		private WebElement searchButton;
		@FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
		private WebElement cartButton;
	
// Main Sections
	
		@FindBy(css = "#top")
		private WebElement Top_Bar;
		@FindBy(css = "body header")
		private WebElement Body_Header;
		@FindBy(css = "body footer")
		private WebElement Body_Footer;
		@FindBy(css = ".breadcrumb")
		private WebElement BreadCrumb_Bar;
		@FindBy(css = ".collapse.navbar-collapse.navbar-ex1-collapse")
		private WebElement Navigation_Bar;
		@FindBy(xpath = "//div[@id='content']")
		private WebElement Product_Content_Grid;
		@FindBy(xpath = "//div[@id='product-category']")
		private WebElement Product_Category;
		@FindBy(xpath = "//aside[@id='column-left']")
		private WebElement Left_Column;
	
		@FindBy (xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]")
		private WebElement tabletsDropDown;
		
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='breadcrumb']//a[contains(text(),'Tablets')]")
		private WebElement tabletsDropDownInner;
		
		@FindBy (xpath = "//h2[normalize-space()='Tablets']")
		private WebElement tabletsPageTitle;
		
		
		@FindBy (xpath = "//button[@id='list-view']")
		private WebElement listViewType;
		@FindBy (xpath = "//button[@id='grid-view']")
		private WebElement gridViewType;
		
		@FindBy (xpath = "//a[@id='compare-total']")
		WebElement productCompare;
		
		@FindBy (xpath = "//select[@id='input-sort']")
		private WebElement sortByLaptopsPage;
		@FindBy (xpath = "//select[@id='input-limit']")
		private WebElement showLimitLaptopsPage;
		
		@FindBy (css = ".col-sm-6.text-right")
		private WebElement showPages;
		
// Left Column Items
	
		@FindBy (partialLinkText = "Desktops")
		WebElement column_LeftFirstItem;
		@FindBy (xpath = "//a[normalize-space()='Laptops & Notebooks (5)']")
		WebElement column_LeftItemLaptopsAndNoteBooks;
		@FindBy (css = "a:nth-child(3)")
		WebElement column_LeftItemComponents;
		@FindBy ( xpath = "//a[@class='list-group-item active']")
		private WebElement column_LeftActiveTab;
	
		
		@FindBy (partialLinkText = "Software")
		WebElement column_LeftItemSoftware;
		@FindBy ( partialLinkText = "Phones & PDAs")
		WebElement column_LeftItemPhones_PDAs;
		@FindBy ( partialLinkText = "Cameras")
		WebElement column_LeftItemCameras;
		@FindBy ( partialLinkText = "MP3 Players")
		WebElement column_LeftItemMP3Players;
		@FindBy (xpath = "//img[@alt='HP Banner']")
		WebElement lastColumn_LeftItem;
	
// Products 
	
	// Product Grids
	
		@FindBy(css = ".product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12")
		private WebElement samsungGalaxyTab10Grid;

	// Products
		
		@FindBy(xpath = "//img[@title='Samsung Galaxy Tab 10.1']")
		private WebElement samsungGalaxyTab10_Image;
		@FindBy(xpath = "//a[normalize-space()='Samsung Galaxy Tab 10.1']")
		private WebElement samsungGalaxyTab10_Link;
		@FindBy(xpath = "//p[contains(text(),'Samsung Galaxy Tab')]")
		private WebElement samsungGalaxyTab10_Description;
		@FindBy(xpath = "//p[@class='price']")
		private WebElement samsungGalaxyTab10_PriceInfo;
		@FindBy(css = ".price-tax")
		private WebElement samsungGalaxyTab10_PriceExTax;
		@FindBy(css = "div[class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'] button:nth-child(1)")
		private WebElement samsungGalaxyTab10_AddToCart;
		@FindBy (xpath = "div[class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'] button:nth-child(2)")
		private WebElement samsungGalaxyTab10_AddToWishList;
		@FindBy (xpath = "div[class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'] button:nth-child(3)")
		private WebElement samsungGalaxyTab10_Compare;

		
// Page Function Methods
	
	public void testEnvironmentHomePage () {
		testEnvironment.click();
	}
		
	public void searchBox (String string) {
		searchBox.sendKeys(string);
		searchButton.click();
	}
		
	public void cartButton () {
		cartButton.click();
	}
	
	public void returnToHome () {
		returnToHome.click();	
	}
	
	
//	public void laptopsPageTitle () {
//		WebElement laptopsPageTitle = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeVisible(laptopsPageTitle));
//		System.out.println(laptopsPageTitle.getText());
//	}
//		
//	public void tabletsPicture () {
//		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", tabletsPicture);
//	        if (!ImagePresent)
//	        {
//	             System.out.println("Image not displayed.");
//	        }
//	        else
//	        {
//	            System.out.println("Image displayed.");
//	        }
//		}
	
//	public void laptopsDescription () {
//		WebElement laptopsPageDescription = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(laptopsPageDescription));
//		System.out.println(laptopsPageDescription.getText());
//	}
		
	
// Left Column Methods
	
	public void getSideBarHeaderText() {
		WebElement sideBarHeader = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(column_LeftActiveTab));
		System.out.println(sideBarHeader.getText());
	}
}
	

