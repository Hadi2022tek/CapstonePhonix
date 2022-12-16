package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;

public class ComponentsPageObjects extends BaseCapstone{
	
	public ComponentsPageObjects() {
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
	
	
		@FindBy (xpath = "//a[@class='dropdown-toggle'][normalize-space()='Components']")
		private WebElement componentsDropDown;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(1) a:nth-child(1)") 
		private WebElement miceandTrackballs_Category;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(2) a:nth-child(1)")
		private WebElement Monitors_Category;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(3) a:nth-child(1)")
		private WebElement printers_Category;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(4) a:nth-child(1)")
		private WebElement scanners_Category;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(5) a:nth-child(1)")
		private WebElement webCameras_Category;
		@FindBy (css = "li[class='dropdown open'] a[class='see-all']")
		private WebElement showAllComponents;

	
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (css= "body div[id='product-category'] ul[class='breadcrumb'] li:nth-child(2) a:nth-child(1)")
		private WebElement componentsDropDownInner;
		
		@FindBy (css = "div[id='content'] h2")
		private WebElement laptopsPageTitle;
	
		
		@FindBy (xpath = "//h3[normalize-space()='Refine Search']")
		private WebElement refineSearch;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(1) a:nth-child(1)")
		private WebElement refineSearchMiceAndTrackballs;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(2) a:nth-child(1)")
		private WebElement refineSearchMonitors;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(3) a:nth-child(1)")
		private WebElement refineSearchPrinters;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(4) a:nth-child(1)")
		private WebElement refineSearchScanners;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(5) a:nth-child(1)")
		private WebElement refineSearchWebCameras;
	

// Left Column Items
	
		@FindBy (css = "div[class='list-group'] a:nth-child(1)")
		WebElement column_LeftFirstItem;
		@FindBy (css = "body > div:nth-child(4) > div:nth-child(2) > aside:nth-child(1) > div:nth-child(1) > a:nth-child(2)")
		WebElement column_LeftSecondItem;
		@FindBy ( xpath = "//a[normalize-space()='Components (2)']")
		private WebElement column_LeftActiveTab;
		@FindBy (css = "a:nth-child(4)")
		WebElement column_LeftItemMiceAndTrackballs;
		@FindBy (css = "a:nth-child(5)")
		WebElement column_LeftItemMonitors;
		@FindBy (css = "a:nth-child(6)")
		WebElement column_LeftItemPrinters;
		@FindBy (css = "a:nth-child(7)")
		WebElement column_LeftItemScanners;
		@FindBy (css = "a:nth-child(8)")
		WebElement column_LeftItemWebCameras;
		
	
		@FindBy (partialLinkText = "Tablets")
		WebElement column_LeftItemTablets;
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
	

