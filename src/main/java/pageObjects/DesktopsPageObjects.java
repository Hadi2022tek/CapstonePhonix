package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;
import junit.framework.Assert;
import utilities.UtilitiesCapstone;

@SuppressWarnings("deprecation")
public class DesktopsPageObjects extends BaseCapstone{
	
	public DesktopsPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
// Page Functions
	
	// Page Functions
	
		@FindBy (xpath = "//a[normalize-space()='TEST ENVIRONMENT']")
		private WebElement retailPageTitle;
		@FindBy(xpath = "//input[@class='form-control input-lg']")
		private WebElement searchBox;
		@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
		private WebElement searchButton;
		@FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
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
		
	
		@FindBy (xpath = "//a[normalize-space()='Desktops']")
		private WebElement desktopsDropDown;
		@FindBy (xpath = "//a[normalize-space()='PC (0)']")
		private WebElement desktopsDropDown_PC_Category;
		@FindBy (xpath = "//a[normalize-space()='Mac (1)']")
		private WebElement desktopsDropDown_Mac_Category;
		@FindBy (linkText = "Show All Desktops")
		private WebElement desktopsDropDown_Show_All_Desktops;
		
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='breadcrumb']//a[contains(text(),'Desktops')]")
		private WebElement desktopsDropDownInner;
		
		@FindBy (xpath = "//h2[normalize-space()='Desktops']")
		private WebElement desktopsPageTitle;
		@FindBy (xpath = "//img[@title='Desktops']")
		private WebElement desktopsPicture;
		@FindBy (xpath = "//p[contains(text(),'Example')]")
		private WebElement desktopsPageDescription;
		
		@FindBy (xpath = "//h3[normalize-space()='Refine Search']")
		private WebElement refineSearch;
		@FindBy (xpath= "//div[@class='col-sm-3']//a[contains(text(),'PC')]")
		private WebElement refineSearchPC;
		@FindBy (xpath= "//body//div[@id='product-category']//div[@id='content']//div[@class='col-sm-3']//a[contains(text(),'Mac')]")
		private WebElement refineSearchMac;
		
		@FindBy (xpath = "//button[@id='list-view']")
		private WebElement listViewType;
		@FindBy (xpath = "//button[@id='grid-view']")
		private WebElement gridViewType;
		
		@FindBy (xpath = "//a[@id='compare-total']")
		WebElement productCompare;
		
		@FindBy (xpath = "//select[@id='input-sort']")
		private WebElement sortByDesktopsPage;
		@FindBy (xpath = "//select[@id='input-limit']")
		private WebElement showLimitDesktopsPage;
		
		@FindBy (css = ".col-sm-6.text-right")
		private WebElement showPages;
	
// Left Column Items
	
		@FindBy ( xpath = "//a[@class='list-group-item active']")
		private WebElement column_LeftActiveTab;
		@FindBy (partialLinkText = "- PC")
		WebElement column_LeftItemPC;
		@FindBy (partialLinkText = "- Mac")
		WebElement column_LeftItemMac;
		@FindBy (partialLinkText = "Laptops & Notebooks")
		WebElement column_LeftItemLaptops_Notebooks;
		@FindBy (partialLinkText = "Components")
		WebElement column_LefItemComponents;
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
		

	// Product Grids
	
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]")
		private WebElement AppleCinema30_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]")
		private WebElement CanonEOS5D_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]")
		private WebElement HPLP3065_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]")
		private WebElement HTCTouchHD_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]")
		private WebElement iPhone_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[6]")
		private WebElement iPodClassic_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[7]")
		private WebElement Product8_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[8]")
		private WebElement SamsungSyncMaster941BW_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[9]")
		private WebElement SonyVAIO_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[10]")
		private WebElement MacBook_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[11]")
		private WebElement MacBookAir_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[12]")
		private WebElement PalmTreoPro_Grid;

	// Products
		
		@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
		private WebElement AppleCinema30_Image;
		@FindBy(xpath = "//a[normalize-space()='Apple Cinema 30\"']")
		private WebElement AppleCinema30_Link;
		@FindBy(xpath = "//div[@class='caption']//p[contains(text(),'The 30-inch Apple Cinema')]")
		private WebElement AppleCinema30_Description;
		@FindBy(xpath = "//div[@class='col-sm-9']//div[1]//div[1]//div[2]//div[1]//p[2]//span[2]")
		private WebElement AppleCinema30_OldPrice;
		@FindBy(xpath = "//span[normalize-space()='$110.00']")
		private WebElement AppleCinema30_NewPrice;
		@FindBy(xpath = "//span[normalize-space()='Ex Tax: $90.00']")
		private WebElement AppleCinema30_PriceExTax;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[1]")
		private WebElement AppleCinema30_AddToCart;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[2]")
		private WebElement AppleCinema30_AddToWishList; 
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[3]")
		private WebElement AppleCinema30_Compare;
	
	
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
		private WebElement canonEOS5D_Image;
		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
		private WebElement canonEOS5D_Link;
		@FindBy(xpath = "//div[@class='caption']//p[contains(text(),\"Canon's press material\")]")
		private WebElement canonEOS5D_Description;
		@FindBy(xpath = "//div[@class='container']//div[2]//div[1]//div[2]//div[1]//p[2]")
		private WebElement canonEOS5D_OldPrice;
		@FindBy(xpath = "//span[normalize-space()='$98.00']")
		private WebElement canonEOS5D_NewPrice;
		@FindBy(xpath = "//span[normalize-space()='Ex Tax: $80.00']")
		private WebElement canonEOS5D_PriceExTax;
		@FindBy(xpath = "//div[@class='container']//div[2]//div[1]//div[2]//div[2]//button[1]")
		private WebElement canonEOS5D_AddToCart;
		@FindBy(css = "#input-option226")
		private WebElement select_DropDown;
		
		
		@FindBy (xpath = "//div[@class='container']//div[2]//div[1]//div[2]//div[2]//button[2]")
		private WebElement canonEOS5D_AddToWishList; 
		@FindBy (xpath = "//div[@class='container']//div[2]//div[1]//div[2]//div[2]//button[3]")
		private WebElement canonEOS5D_Compare;
		
		
		@FindBy(xpath = "//img[@title='HP LP3065']")
		private WebElement hPLP3065_Image;
		@FindBy(xpath = "//a[normalize-space()='HP LP3065']")
		private WebElement hPLP3065_Link;
		@FindBy(xpath = "//p[contains(text(),'Stop your co-workers')]")
		private WebElement hPLP3065_Description;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]")
		private WebElement hPLP3065_PriceInfo;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement hPLP3065_PriceExTax;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]")
		private WebElement hPLP3065_AddToCart;
		
		@FindBy(css = ".alert.alert-success.alert-dismissible")
		private WebElement hPLP3065_AddToCartSuccessMessage;
		
		@FindBy (xpath = "//div[3]/div[1]/div[2]/div[2]/button[2]")
		private WebElement hPLP3065_AddToWishList;
		@FindBy (xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
		private WebElement hPLP3065_Compare;

	
		@FindBy(xpath = "//img[@title='HTC Touch HD']")
		private WebElement HTCTouchHD_Image;
		@FindBy(xpath = "//a[normalize-space()='HTC Touch HD']")
		private WebElement HTCTouchHD_Link;
		@FindBy(xpath = "//p[contains(text(),'HTC Touch - in High Definition')]")
		private WebElement HTCTouchHD_Description;
		@FindBy(xpath = "//body//div[@class='container']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]")
		private WebElement HTCTouchHD_PriceInfo;
		@FindBy(xpath = "//body//div[@class='container']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]")
		private WebElement HTCTouchHD_PriceExTax;
		@FindBy(xpath = "//body//div[@class='container']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]")
		private WebElement HTCTouchHD_AddToCart;
		@FindBy (xpath = "//body//div[@class='container']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[2]")
		private WebElement HTCTouchHD_AddToWishList;
		@FindBy (xpath = "//body//div[@class='container']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[3]")
		private WebElement HTCTouchHD_Compare;
	
	
		@FindBy(xpath = "//img[@title='iPhone']")
		private WebElement iPhone_Image;
		@FindBy(xpath = "//a[normalize-space()='iPhone']")
		private WebElement iPhone_Link;
		@FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary new mobile phone')]")
		private WebElement iPhone_Description;
		@FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPhone_PriceInfo;
		@FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement iPhone_PriceExTax;
		@FindBy(xpath = "//div[5]//div[1]//div[2]//div[2]//button[1]")
		private WebElement iPhone_AddToCart;
		@FindBy (xpath = "//div[5]/div[1]/div[2]/div[2]/button[2]")
		private WebElement iPhone_AddToWishList;
		@FindBy (xpath = "//div[5]//div[1]//div[2]//div[2]//button[3]")
		private WebElement iPhone_Compare;
	
	
		@FindBy(xpath = "//img[@title='iPod Classic']")
		private WebElement iPodClassic_Image;
		@FindBy(xpath = "//a[normalize-space()='iPod Classic']")
		private WebElement iPodClassic_Link;
		@FindBy(xpath = "//p[contains(text(),'More room to move')]")
		private WebElement iPodClassic_Description;
		@FindBy(xpath = "//div[6]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPodClassic_PriceInfo;
		@FindBy(xpath = "//div[6]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement iPodClassic_PriceExTax;
		@FindBy(xpath = "//div[6]//div[1]//div[2]//div[2]//button[1]")
		private WebElement iPodClassic_AddToCart;
		@FindBy (xpath = "//div[6]/div[1]/div[2]/div[2]/button[2]")
		private WebElement iPodClassic_AddToWishList;
		@FindBy (xpath = "//div[6]//div[1]//div[2]//div[2]//button[3]")
		private WebElement iPodClassic_Compare;
		
	
		@FindBy(xpath = "//img[@title='MacBook']")
		private WebElement macBook_Image;
		@FindBy(xpath = "//a[normalize-space()='MacBook']")
		private WebElement macBook_Link;
		@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
		private WebElement macBook_Description;
		@FindBy(xpath = "//div[7]//div[1]//div[2]//div[1]//p[2]")
		private WebElement macBook_PriceInfo;
		@FindBy(xpath = "//div[7]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement macBook_PriceExTax;
		@FindBy(xpath = "//div[7]//div[1]//div[2]//div[2]//button[1]")
		private WebElement macBook_AddToCart;
		@FindBy (xpath = "//div[7]/div[1]/div[2]/div[2]/button[2]")
		private WebElement macBook_AddToWishList;
		@FindBy (xpath = "//div[7]//div[1]//div[2]//div[2]//button[3]")
		private WebElement macBook_Compare;
			
		
		@FindBy(xpath = "//img[@title='MacBook Air']")
		private WebElement macBookAir_Image;
		@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'MacBook Air')]")
		private WebElement macBookAir_Link;
		@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin')]")
		private WebElement macBookAir_Description;
		@FindBy(xpath = "//div[8]//div[1]//div[2]//div[1]//p[2]")
		private WebElement macBookAir_PriceInfo;
		@FindBy(xpath = "//div[8]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement macBookAir_PriceExTax;
		@FindBy(xpath = "//div[8]//div[1]//div[2]//div[2]//button[1]")
		private WebElement macBookAir_AddToCart;
		@FindBy (xpath = "//div[8]/div[1]/div[2]/div[2]/button[2]")
		private WebElement macBookAir_AddToWishList;
		@FindBy (xpath = "//div[8]//div[1]//div[2]//div[2]//button[3]")
		private WebElement macBookAir_Compare;
		
		
		@FindBy(xpath = "//img[@title='Palm Treo Pro']")
		private WebElement palmTreoPro_Image;
		@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'Palm Treo Pro')]")
		private WebElement palmTreoPro_Link;
		@FindBy(xpath = "//p[contains(text(),'Redefine your workday')]")
		private WebElement palmTreoPro_Description;
		@FindBy(xpath = "//div[9]//div[1]//div[2]//div[1]//p[2]")
		private WebElement palmTreoPro_PriceInfo;
		@FindBy(xpath = "//div[9]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement palmTreoPro_PriceExTax;
		@FindBy(xpath = "//div[9]//div[1]//div[2]//div[2]//button[1]")
		private WebElement palmTreoPro_AddToCart;
		@FindBy (xpath = "//div[9]/div[1]/div[2]/div[2]/button[2]")
		private WebElement palmTreoPro_AddToWishList;
		@FindBy (xpath = "//div[9]//div[1]//div[2]//div[2]//button[3]")
		private WebElement palmTreoPro_Compare;
		
		
		@FindBy(xpath = "//img[@title='Product 8']")
		private WebElement product8_Image;
		@FindBy(xpath = "//a[normalize-space()='Product 8']")
		private WebElement product8_Link;
		@FindBy(xpath = "//p[normalize-space()='Product 8..']")
		private WebElement product8_Description;
		@FindBy(xpath = "//div[10]//div[1]//div[2]//div[1]//p[2]")
		private WebElement product8_PriceInfo;
		@FindBy(xpath = "//div[10]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement product8_PriceExTax;
		@FindBy(xpath = "//div[10]//div[1]//div[2]//div[2]//button[1]")
		private WebElement product8_AddToCart;
		@FindBy (xpath = "//div[10]/div[1]/div[2]/div[2]/button[2]")
		private WebElement product8_AddToWishList;
		@FindBy (xpath = "//div[10]//div[1]//div[2]//div[2]//button[3]")
		private WebElement product8_Compare;
		
		
		@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
		private WebElement samsungSyncMaster941BW_Image;
		@FindBy(xpath = "//a[normalize-space()='Samsung SyncMaster 941BW']")
		private WebElement samsungSyncMaster941BW_Link;
		@FindBy(xpath = "//p[contains(text(),'Imagine the advantages')]")
		private WebElement samsungSyncMaster941BW_Description;
		@FindBy(xpath = "//div[11]//div[1]//div[2]//div[1]//p[2]")
		private WebElement samsungSyncMaster941BW_PriceInfo;
		@FindBy(xpath = "//div[11]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement samsungSyncMaster941BW_PriceExTax;
		@FindBy(xpath = "//div[11]//div[1]//div[2]//div[2]//button[1]")
		private WebElement samsungSyncMaster941BW_AddToCart;
		@FindBy (xpath = "//div[11]/div[1]/div[2]/div[2]/button[2]")
		private WebElement samsungSyncMaster941BW_AddToWishList;
		@FindBy (xpath = "//div[11]//div[1]//div[2]//div[2]//button[3]")
		private WebElement samsungSyncMaster941BW_Compare;
		
		
		@FindBy(xpath = "//img[@title='Sony VAIO']")
		private WebElement sonyVAIO_Image;
		@FindBy(xpath = "//a[normalize-space()='Sony VAIO']")
		private WebElement sonyVAIO_Link;
		@FindBy(xpath = "//p[contains(text(),'Unprecedented power.')]")
		private WebElement sonyVAIO_Description;
		@FindBy(xpath = "//div[12]//div[1]//div[2]//div[1]//p[2]")
		private WebElement sonyVAIO_PriceInfo;
		@FindBy(xpath = "//div[12]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement sonyVAIO_PriceExTax;
		@FindBy(xpath = "//div[12]//div[1]//div[2]//div[2]//button[1]")
		private WebElement sonyVAIO_AddToCart;
		@FindBy (xpath = "//div[12]/div[1]/div[2]/div[2]/button[2]")
		private WebElement sonyVAIO_AddToWishList;
		@FindBy (xpath = "//div[12]//div[1]//div[2]//div[2]//button[3]")
		private WebElement sonyVAIO_Compare;
		
		
// Page Automation Elements
		
		@FindBy(css = "#input-quantity")
		private WebElement qty;
		@FindBy(css = "#button-cart")
		private WebElement addToCartFinal;
		@FindBy (xpath = "//a[normalize-space()='Write a review']")
		private WebElement writeAReview;
		@FindBy(css = "#input-name")
		private WebElement nameField;
		@FindBy(css = "#input-review")
		private WebElement reviewField;
		@FindBy(css = "#button-review")
		private WebElement buttonReview;
		@FindBy(css = ".alert.alert-success.alert-dismissible")
		private WebElement successAlert;
		@FindBy(css = ".alert.alert-success.alert-dismissible")
		private WebElement reviewSubmittedSuccessAlert;
		@FindBy(css = "#input-name")
		private WebElement reviewName;
		@FindBy(css = "#input-review")
		private WebElement reviewInput;
		@FindBy(css = ".alert.alert-success.alert-dismissible")
		private WebElement reviewRating;
		@FindBy(xpath = "//div[contains(text(),'Success: You have added')]")
		static WebElement successMessageAddToCart;
		@FindBy(css = ".col-sm-6.text-right")
		static WebElement bodyFooterNote;
		@FindBy (xpath = "//button[contains(text(),'×')]")
		private WebElement closeButton;
		
		
		
		@FindBy (xpath ="//input[@name='rating']")
		List <WebElement> ratingValue;
	
// Page Automation Methods

		public void validateRetailPage() throws IOException {
			String actualText = retailPageTitle.getText();
			String expectedText = "TEST ENVIRONMENT";
			Assert.assertEquals(expectedText, actualText);
			UtilitiesCapstone.takeScreenShot("Desktops Page 1 - Retail Page");
		}

		public void clickOnDesktopsTab() {
			desktopsDropDown.click();
		}

		public void clickOnShowAllDesktops() {
			desktopsDropDown_Show_All_Desktops.click();
		}

		public void showAllItemsInDesktopsPage() throws IOException {
			List<WebElement> productGridsCount = driver.findElements(
					By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']"));
			System.out.println("Actual number of items displayed: " + productGridsCount.size());
			UtilitiesCapstone.scrolldownPage();
			UtilitiesCapstone.highlightelementBorderAndBackground(bodyFooterNote);
			UtilitiesCapstone.takeScreenShot("Desktops Page 2 - Desktop Page Items");
		}

		public void clickAddToCartHPLP3065() {
			hPLP3065_AddToCart.click();
		}

		public void userSelectQuantity(String number) {
			qty.clear();
			qty.sendKeys(number);
		}

		public void clickAddToCart() {
			addToCartFinal.click();
		}

		public void addHPLP3065ToCartSuccessMessage(String strSuccessMessage) throws IOException {
			String actualSuccessMessage = successMessageAddToCart.getText();
			String strString = actualSuccessMessage.substring(0, 56);
			Assert.assertEquals(strSuccessMessage, strString);
			UtilitiesCapstone.highlightelementBorderAndBackground(successMessageAddToCart);
			UtilitiesCapstone.takeScreenShot("Desktops Page 3 - HP LP3065 AddToCart Success Message");
			UtilitiesCapstone.waitUntilElementToBeClickable(driver, closeButton);
			closeButton.click();
		}

		public void clickAddToCartCannonEOS5D() {
			canonEOS5D_AddToCart.click();
		}

		public void selectColorRed() {
			Select select = new Select(select_DropDown);
			select.selectByVisibleText("Red");
		}

		public void addCannonEOS5DToCartSuccessMessage(String strSuccessMessage) throws IOException {
			String actualSuccessMessage = successMessageAddToCart.getText();
			String strString = actualSuccessMessage.substring(0, 66);
			Assert.assertEquals(strSuccessMessage, strString);
			UtilitiesCapstone.highlightelementBorderAndBackground(successMessageAddToCart);
			UtilitiesCapstone.takeScreenShot("Desktops Page 4 - Cannon EOS 5D AddToCart Success Message");
			UtilitiesCapstone.waitUntilElementToBeClickable(driver, closeButton);
			closeButton.click();
		}

		public void clickCannonEOS5D() {
			canonEOS5D_Link.click();
		}

		public void clickWriteAReview() {
			writeAReview.click();
		}

		public void fillReviewNamewithParam(String yourName) {
			reviewName.sendKeys(yourName);
		}

		public void fillReviewTextWithParam(String yourReview) {
			reviewInput.sendKeys(yourReview);
		}
		
		public void selectRating(String rating) {

			List<WebElement> ratingSelection = ratingValue;
			for (WebElement element : ratingSelection) {
				if (element.getAttribute("Value").equals("1")) {
					element.click();
					break;

				}
			}
		}
		
		// Printing all the ratings values
		public void printRatingValues () {
		List<WebElement> allRatings = driver.findElements(By.xpath("//div[4]//div[1]//input"));
    	List <String> listOfAllRatings = new ArrayList <String> ();
    		for (int i = 0 ; i <allRatings.size();i++) {
    			listOfAllRatings.add(allRatings.get(i).getAttribute("value"));
    	}
    	System.out.println(listOfAllRatings);
		}
		
    	
		public void clickContinueButton() {
			buttonReview.click();
		}

		public void reviewSubmittedSuccessMessage() throws IOException {

			String actualMessage = reviewSubmittedSuccessAlert.getText();
			String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
			Assert.assertEquals(expectedMessage, actualMessage);
			UtilitiesCapstone.highlightelementBorderAndBackground(reviewSubmittedSuccessAlert);
			UtilitiesCapstone.takeScreenShot("Desktops Page 6 - Review Submission");
		}
		
// Alternative but silly method for rating selection

		public void radioButtonSelectWithParam(String rating) {

			if (rating == "1") {

				WebElement rating1 = driver.findElement(By.cssSelector("input[value='1'][name='rating']"));
				rating1.click();

			} else if (rating == "2") {

				WebElement rating2 = driver.findElement(By.cssSelector("input[value='2']"));
				rating2.click();
			}

			else if (rating == "3") {

				WebElement rating3 = driver.findElement(By.cssSelector("input[value='3']"));
				rating3.click();

			} else if (rating == "4") {

				WebElement rating4 = driver.findElement(By.cssSelector("input[value='4']"));
				rating4.click();
			} else {

				WebElement rating5 = driver.findElement(By.cssSelector("input[value='5']"));
				rating5.click();
			}
		}

// Miscellaneous Methods

	public void desktopsPageTitle () {
		WebElement titleText = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(desktopsPageTitle));
		titleText.click();
	}
		
	public void desktopsPicture() {
			Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
					"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
					desktopsPicture);
			if (!ImagePresent) {
				System.out.println("Image not displayed.");
			} else {
				System.out.println("Image displayed.");
			}
		}

	public void desktopsDescription () {
		WebElement descriptionText = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(desktopsPageDescription));;
		System.out.println(descriptionText.getText());
	}

		public void sortByDesdktopsDropdown() {
			Select select = new Select(sortByDesktopsPage);
			// select.selectByIndex(2);
			select.selectByVisibleText("Rating (Highest)");
		}

		public void showLimitDesktopsDropdown() {
			Select select = new Select(showLimitDesktopsPage);
			// select.selectByIndex(2);
			select.selectByVisibleText("75");
		}
}