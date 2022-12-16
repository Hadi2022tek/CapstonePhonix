package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;

public class SoftwarePageObjects extends BaseCapstone{
	
	public SoftwarePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
// Page Functions
	
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
	
	
		@FindBy (xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Software')]")
		private WebElement componentsDropDown;
		
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='nav navbar-nav']//a[contains(text(),'Software')]")
		private WebElement componentsDropDownInner;
		
		@FindBy (css = "div[id='content'] h2")
		private WebElement laptopsPageTitle;


// Left Column Items
	
		@FindBy ( xpath = "//a[normalize-space()='Software (0)']")
		private WebElement column_LeftActiveTab;
		@FindBy (partialLinkText = "Desktops")
		WebElement column_LeftItemDesktops;
		@FindBy (partialLinkText = "Laptops & Notebooks")
		WebElement column_LeftItemLaptopsAndNotebooks;
		@FindBy (partialLinkText = "Components")
		WebElement column_LeftItemComponents;
		@FindBy (partialLinkText = "Tablets")
		WebElement column_LeftItemTablets;
		@FindBy ( partialLinkText = "Phones & PDAs")
		WebElement column_LeftItemPhones_PDAs;
		@FindBy ( partialLinkText = "Cameras")
		WebElement column_LeftItemCameras;
		@FindBy ( partialLinkText = "MP3 Players")
		WebElement column_LeftItemMP3Players;
		@FindBy (xpath = "//img[@alt='HP Banner']")
		WebElement lastColumn_LeftItem;
	
// Products 
	
		@FindBy (xpath = "//h2[normalize-space()='Software']")
		private WebElement softwarePageTitle;
		@FindBy (xpath = "//p[contains(text(),'There are')]")
		private WebElement softwarePageDescription;
		@FindBy (xpath = "//a[normalize-space()='Continue']")
		private WebElement continueButton;
		
	
// Page Function Methods
	
	public void testEnvironmentHomePage () {
		testEnvironment.click();
	}
		
	public void searchBoxLaptopsPage (String string) {
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
	

