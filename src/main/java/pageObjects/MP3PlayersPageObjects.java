package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseCapstone;

public class MP3PlayersPageObjects extends BaseCapstone{
		
	public MP3PlayersPageObjects() {
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
	
		@FindBy (xpath = "//a[@class='dropdown-toggle'][normalize-space()='MP3 Players']")
		private WebElement mP3PlayersDropDown;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[1]/li[1]/a[1]") 
		private WebElement test11_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[1]/li[2]/a[1]")
		private WebElement test12_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[1]/li[3]/a[1]")
		private WebElement test15_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[1]/li[4]/a[1]") 
		private WebElement test16_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[1]/li[5]/a[1]")
		private WebElement test17_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[2]/li[1]/a[1]")
		private WebElement test18_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[2]/li[2]/a[1]")
		private WebElement test19_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[2]/li[3]/a[1]")
		private WebElement test20_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[2]/li[4]/a[1]")
		private WebElement test21_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[2]/li[5]/a[1]")
		private WebElement test22_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[3]/li[1]/a[1]")
		private WebElement test23_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[3]/li[2]/a[1]")
		private WebElement test24_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[3]/li[3]/a[1]")
		private WebElement test4_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[3]/li[4]/a[1]")
		private WebElement test5_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[3]/li[5]/a[1]")
		private WebElement test6_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[4]/li[1]/a[1]")
		private WebElement test7_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[4]/li[2]/a[1]")
		private WebElement test8_Category;
		@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/ul[4]/li[3]/a[1]")
		private WebElement test9_Category;
		
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='breadcrumb']//a[contains(text(),'MP3 Players')]")
		private WebElement mP3PlayersDropDownInner;
		
		@FindBy (xpath = "//h2[normalize-space()='MP3 Players']")
		private WebElement mP3PlayersPageTitle;
		@FindBy (xpath = "//img[@title='MP3 Players']")
		private WebElement mP3PlayersPicture;
		@FindBy (xpath = "//p[contains(text(),'Shop Laptop')]")
		private WebElement mP3PlayersPageDescription;
		
		@FindBy (xpath = "//h3[normalize-space()='Refine Search']")
		private WebElement refineSearch;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
		private WebElement refineSearchTest11;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
		private WebElement refineSearchTest12;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
		private WebElement refineSearchTest15;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
		private WebElement refineSearchTest16;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
		private WebElement refineSearchTest17;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")
		private WebElement refineSearchTest18;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")
		private WebElement refineSearchTest19;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")
		private WebElement refineSearchTest20;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")
		private WebElement refineSearchTest21;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[5]/a[1]")
		private WebElement refineSearchTest22;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]")
		private WebElement refineSearchTest23;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]")
		private WebElement refineSearchTest24;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[3]/a[1]")
		private WebElement refineSearchTest4;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/a[1]")
		private WebElement refineSearchTest5;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[5]/a[1]")
		private WebElement refineSearchTest6;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[1]/a[1]")
		private WebElement refineSearchTest7;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[2]/a[1]")
		private WebElement refineSearchTest8;
		@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[3]/a[1]")
		private WebElement refineSearchTest9;
		
		
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
		private WebElement column_LeftMP3Players;
		@FindBy ( css = "a:nth-child(9)")
		private WebElement column_LeftTest11;
		@FindBy ( css = "a:nth-child(10)")
		private WebElement column_LeftTest12;
		@FindBy ( css = "a:nth-child(11)")
		private WebElement column_LeftTest15;
		@FindBy ( css = "a:nth-child(12)")
		private WebElement column_LeftTest16;
		@FindBy ( css = "a:nth-child(13)")
		private WebElement column_LeftTest17;
		@FindBy ( css = "a:nth-child(14)")
		private WebElement column_LeftTest18;
		@FindBy ( css = "a:nth-child(15)")
		private WebElement column_LeftTest19;
		@FindBy ( css = "a:nth-child(16)")
		private WebElement column_LeftTest20;
		@FindBy ( css = "a:nth-child(17)")
		private WebElement column_LeftTest21;
		@FindBy ( css = "a:nth-child(18)")
		private WebElement column_LeftTest22;
		@FindBy ( css = "a:nth-child(19)")
		private WebElement column_LeftTest23;
		@FindBy ( css = "a:nth-child(20)")
		private WebElement column_LeftTest24;
		@FindBy ( css = "a:nth-child(21)")
		private WebElement column_LeftTest4;
		@FindBy ( css = "a:nth-child(22)")
		private WebElement column_LeftTest5;
		@FindBy ( css = "a:nth-child(23)")
		private WebElement column_LeftTest6;
		@FindBy ( css = "a:nth-child(24)")
		private WebElement column_LeftTest7;
		@FindBy ( css = "a:nth-child(25)")
		private WebElement column_LeftTest8;
		@FindBy ( css = "a:nth-child(26)")
		private WebElement column_LeftTest9;
		
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
		@FindBy ( partialLinkText = "Cameras")
		WebElement column_LeftItemMP3Players;
		@FindBy (xpath = "//img[@alt='HP Banner']")
		WebElement column_LeftLastItem;
	
	// Product Grids
	
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]")
		private WebElement iPodClassic_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]")
		private WebElement iPodNitro_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]")
		private WebElement iPodShuffle_Grid;
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]")
		private WebElement iPodTouch_Grid;
		
		
	// Products
		
		@FindBy(xpath = "//img[@title='iPod Classic']")
		private WebElement iPodClassic_Image;
		@FindBy(xpath = "//a[normalize-space()='iPod Classic']")
		private WebElement iPodClassic_Link;
		@FindBy(xpath = "//p[contains(text(),'More room to move')]")
		private WebElement iPodClassic_Description;
		@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPodClassic_PriceInfo;
		@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement iPodClassic_PriceExTax;
		@FindBy(css = "div[id='content'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2) button:nth-child(1)")
		private WebElement iPodClassic_AddToCart;
		@FindBy (css = "div[id='content'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2) button:nth-child(2)")
		private WebElement iPodClassic_AddToWishList;
		@FindBy (css = "div[id='content'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2) button:nth-child(3)")
		private WebElement iPodClassic_Compare;

		
		@FindBy(xpath = "//img[@title='iPod Nano']")
		private WebElement iPodNano_Image;
		@FindBy(xpath = "//a[normalize-space()='iPod Nano']")
		private WebElement iPodNano_Link;
		@FindBy(xpath = "//p[contains(text(),'Video in your pocket')]")
		private WebElement iPodNano_Description;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPodNano_PriceInfo;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement iPodNano_PriceExTax;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]")
		private WebElement iPodNano_AddToCart;
		@FindBy (xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[2]")
		private WebElement iPodNano_AddToWishList;
		@FindBy (xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[2]")
		private WebElement iPodNano_Compare;
		
		
		@FindBy(xpath = "//img[@title='iPod Shuffle']")
		private WebElement iPodShuffle_Image;
		@FindBy(xpath = "//a[normalize-space()='iPod Shuffle']")
		private WebElement iPodShuffle_Link;
		@FindBy(xpath = "//p[contains(text(),'Born to be worn')]")
		private WebElement iPodShuffle_Description;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPodShuffle_PriceInfo;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement iPodShuffle_PriceExTax;
		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]")
		private WebElement iPodShuffle_AddToCart;
		@FindBy (xpath = "//div[3]//div[1]//div[2]//div[2]//button[2]")
		private WebElement iPodShuffle_AddToWishList;
		@FindBy (xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
		private WebElement iPodShuffle_Compare;
		
		
		@FindBy(xpath = "//img[@title='iPod Touch']")
		private WebElement iPodTouch_Image;
		@FindBy(xpath = "//a[normalize-space()='iPod Touch']")
		private WebElement iPodTouch_Link;
		@FindBy(xpath = "//p[contains(text(),'Revolutionary multi-touch')]")
		private WebElement iPodTouch_Description;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]")
		private WebElement iPodTouch_PriceInfo;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]/span[1]")
		private WebElement iPodTouch_PriceExTax;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[1]")
		private WebElement iPodTouch_AddToCart;
		@FindBy (xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[2]")
		private WebElement iPodTouch_AddToWishList;
		@FindBy (xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[3]")
		private WebElement iPodTouch_Compare;
		
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
		WebElement sideBarHeader = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(column_LeftMP3Players));
		System.out.println(sideBarHeader.getText());
	}
}
	

