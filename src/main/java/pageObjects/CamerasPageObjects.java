package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;

public class CamerasPageObjects extends BaseCapstone{
		
	public CamerasPageObjects() {
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
	
		@FindBy (xpath = "//a[@class='dropdown-toggle'][text()='Cameras']")
		private WebElement camerasDropDown;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(1) a:nth-child(1)") // or //ul[@class='list-unstyled']//a[contains(text(),'Canon (1)')]
		private WebElement cannon_Category;
		@FindBy (css = "//li[@class='dropdown open']//li[2]/a[1]")
		private WebElement nikon_Category;
		@FindBy (css = "li[class='dropdown open'] a[class='see-all']")
		private WebElement showAllCameras;
	
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='breadcrumb']//a[contains(text(),'Cameras')]")
		private WebElement camerasDropDownInner;
		
		@FindBy (xpath = "//h2[normalize-space()='Cameras']")
		private WebElement camerasPageTitle;
		
		@FindBy (xpath = "//h3[normalize-space()='Refine Search']")
		private WebElement refineSearch;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(1) a:nth-child(1)")
		private WebElement refineSearchCannon;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(2) a:nth-child(1)")
		private WebElement refineSearchNikon;
		
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
		@FindBy ( css = "a:nth-child(8)")
		private WebElement column_LeftCannonItem;
		@FindBy ( css = "a:nth-child(9)")
		private WebElement column_LeftNikonItem;
		
		
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
		@FindBy ( partialLinkText = "Phones & PDAs")
		WebElement column_LeftItemCameras;
		@FindBy ( partialLinkText = "MP3 Players")
		WebElement column_LeftItemMP3Players;
		@FindBy (xpath = "//img[@alt='HP Banner']")
		WebElement column_LeftLastItem;
	
	// Product Grids
	
		@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[3]/div[1]")
		private WebElement cannonEOS5D_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[3]/div[2]")
		private WebElement nikonD300_Grid;
		
		
	// Products
		
		@FindBy(xpath = "//img[@title='Canon EOS 5D']")
		private WebElement cannonEOS5D_Image;
		@FindBy(xpath = "//a[normalize-space()='Canon EOS 5D']")
		private WebElement cannonEOS5D_Link;
		@FindBy(xpath = "//p[contains(text(),'EOS 5D states that')]")
		private WebElement cannonEOS5D_Description;
		@FindBy(css = ".price-old")
		private WebElement AppleCinema30_OldPrice;
		@FindBy(css = ".price-new")
		private WebElement AppleCinema30_NewPrice;
		@FindBy(xpath = "//span[3]")
		private WebElement cannonEOS5D_PriceExTax;
		@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]")
		private WebElement cannonEOS5D_AddToCart;
		@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[2]")
		private WebElement cannonEOS5D_AddToWishList;
		@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]")
		private WebElement cannonEOS5D_Compare;

		
		@FindBy(xpath = "//img[@title='Nikon D300']")
		private WebElement nikonD300_Image;
		@FindBy(xpath = "//a[normalize-space()='Nikon D300']")
		private WebElement nikonD300_Link;
		@FindBy(xpath = "//p[contains(text(),'Engineered with')]")
		private WebElement nikonD300_Description;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]")
		private WebElement nikonD300_PriceInfo;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement nikonD300_PriceExTax;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]")
		private WebElement nikonD300_AddToCart;
		@FindBy (xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[2]")
		private WebElement nikonD300_AddToWishList;
		@FindBy (xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[3]")
		private WebElement nikonD300_Compare;
		
		
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
	

