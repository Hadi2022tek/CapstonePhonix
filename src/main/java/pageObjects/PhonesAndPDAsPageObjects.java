package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;

public class PhonesAndPDAsPageObjects extends BaseCapstone{
		
	public PhonesAndPDAsPageObjects() {
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
	
		@FindBy (xpath = "//a[@class='dropdown-toggle'][normalize-space()='Phones & PDAs']")
		private WebElement phonesAndPDAsDropDown;
	
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='breadcrumb']//a[contains(text(),'Phones & PDAs')]")
		private WebElement phonesAndPDAsDropDownInner;
		
		@FindBy (xpath = "//h2[normalize-space()='Phones & PDAs']")
		private WebElement laptopsPageTitle;
		
		
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
	
		@FindBy ( css = ".list-group-item.active")
		private WebElement column_LeftActiveTab;
		@FindBy (partialLinkText = "Desktops")
		WebElement column_LeftItemDesktops;
		@FindBy (partialLinkText = "Laptops & Notebooks")
		WebElement column_LeftItemLaptopsAndNotebooks;
		@FindBy (partialLinkText = "Components")
		WebElement column_LeftItemComponents;
		@FindBy (partialLinkText = "Tablets")
		WebElement column_LeftItemTablets;
		@FindBy ( partialLinkText = "Software")
		WebElement column_LeftItemSoftware;
		@FindBy ( partialLinkText = "Cameras")
		WebElement column_LeftItemCameras;
		@FindBy ( partialLinkText = "MP3 Players")
		WebElement column_LeftItemMP3Players;
		@FindBy (xpath = "//img[@alt='HP Banner']")
		WebElement lastColumn_LeftItem;
	
	// Product Grids
	
		@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[2]/div[1]")
		private WebElement hTCTouchHD_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[2]/div[2]")
		private WebElement iPhone_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[2]/div[3]")
		private WebElement palmTreoPro_Grid;
	

	// Products
		
		@FindBy(xpath = "//img[@title='HTC Tocuh HD']")
		private WebElement hTCTouchHD_Image;
		@FindBy(xpath = "//a[normalize-space()='HTC Touch HD']")
		private WebElement hTCTouchHD_Link;
		@FindBy(xpath = "//p[contains(text(),'HTC Touch - in High Definition')]")
		private WebElement hTCTouchHD_Description;
		@FindBy(xpath = "//div[1]//div[1]//div[2]//div[1]//p[2]")
		private WebElement hTCTouchHD_PriceInfo;
		@FindBy(css = "div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > p:nth-child(3) > span:nth-child(1)")
		private WebElement hTCTouchHD_PriceExTax;
		@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]")
		private WebElement hTCTouchHD_AddToCart;
		@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[2]")
		private WebElement hTCTouchHD_AddToWishList;
		@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]")
		private WebElement hTCTouchHD_Compare;

		
		@FindBy(xpath = "//img[@title='iPhone']")
		private WebElement iPhone_Image;
		@FindBy(xpath = "//a[normalize-space()='iPhone']")
		private WebElement iPhone_Link;
		@FindBy(xpath = "//p[contains(text(),'iPhone is a')]")
		private WebElement iPhone_Description;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPhone_PriceInfo;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[1]//p[2]/span[1]")
		private WebElement iPhone_PriceExTax;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[1]")
		private WebElement iPhone_AddToCart;
		@FindBy (xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[2]")
		private WebElement iPhone_AddToWishList;
		@FindBy (xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[3]")
		private WebElement iPhone_Compare;
		
		
		@FindBy(xpath = "//img[@title='Palm Treo Pro']")
		private WebElement palmTreoPro_Image;
		@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'Palm Treo Pro')]")
		private WebElement palmTreoPro_Link;
		@FindBy(xpath = "//p[contains(text(),'Redefine your workday')]")
		private WebElement palmTreoPro_Description;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]")
		private WebElement palmTreoPro_PriceInfo;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]/span[1]")
		private WebElement palmTreoPro_PriceExTax;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]")
		private WebElement palmTreoPro_AddToCart;
		@FindBy (xpath = "//div[3]//div[1]//div[2]//div[2]//button[2]")
		private WebElement palmTreoPro_AddToWishList;
		@FindBy (xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
		private WebElement palmTreoPro_Compare;
		
		
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
//	public void laptopsPicture () {
//		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", laptopsPicture);
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
		
		public void sortByLaptopsDropdown () {
		Select select = new Select(sortByLaptopsPage);
		//	select.selectByIndex(2);
		select.selectByVisibleText("Rating (Highest)");
	}
	
	public void showLimitLaptopsDropdown () {
		Select select = new Select(showLimitLaptopsPage);
		//	select.selectByIndex(2);
		select.selectByVisibleText("75");
	}
	
	public void showPages () {
		showPages.getText();
	}
	
// Left Column Methods
	
	public void getSideBarHeaderText() {
		WebElement sideBarHeader = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(column_LeftActiveTab));
		System.out.println(sideBarHeader.getText());
	}
}
	

