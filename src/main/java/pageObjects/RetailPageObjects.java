package pageObjects;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import core.BaseCapstone;
import utilities.UtilitiesCapstone;

public class RetailPageObjects extends BaseCapstone{
	
	public RetailPageObjects() {
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
	
		@FindBy (xpath = "//a[@class='dropdown-toggle'][normalize-space()='Laptops & Notebooks']")
		private WebElement laptopsDropDown;
		@FindBy (css = "li[class='dropdown open'] li:nth-child(1) a:nth-child(1)") // or //li[@class='dropdown open']//li[1]/a[1]
		private WebElement mac_Category;
		@FindBy (xpath = "//li[@class='dropdown open']//li[2]/a[1]")
		private WebElement windows_Category;
		@FindBy (xpath = "//div[@class='dropdown-menu']//a[normalize-space()='Show All Laptops & Notebooks']")
		private WebElement laptopsDropDown_ShowAllLaptops_Notebooks;
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement returnToHome;
		@FindBy (xpath= "//ul[@class='breadcrumb']//a[contains(text(),'Laptops & Notebooks')]")
		private WebElement laptopsDropDownInner;
		
		@FindBy (xpath = "//h2[normalize-space()='Laptops & Notebooks']")
		private WebElement laptopsPageTitle;
		@FindBy (xpath = "//img[@title='Laptops & Notebooks']")
		private WebElement laptopsPicture;
		@FindBy (xpath = "//p[contains(text(),'Shop Laptop')]")
		private WebElement laptopsPageDescription;
		
		@FindBy (xpath = "//h3[normalize-space()='Refine Search']")
		private WebElement refineSearch;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(1) a:nth-child(1)")
		private WebElement refineSearchPC;
		@FindBy (css= "div[id='product-category'] div[class='row'] li:nth-child(2) a:nth-child(1)")
		private WebElement refineSearchMac;
		
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
		WebElement firstColumn_LeftItem;
		@FindBy ( xpath = "//a[@class='list-group-item active']")
		private WebElement column_LeftActiveTab;
		@FindBy (css = "a:nth-child(3)")
		WebElement column_LeftItemMac;
		@FindBy (css = "a:nth-child(4)")
		WebElement column_LeftItemPC;
		
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
	
		@FindBy(xpath = " //body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[4]/div[1]")
		private WebElement HPLP3065_Grid;
		@FindBy(xpath = " //body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[4]/div[2]")
		private WebElement MacBook_Grid;
		@FindBy(xpath = " //body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[4]/div[3]")
		private WebElement MacBookAir_Grid;
		@FindBy(xpath = " //body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[4]/div[4]")
		private WebElement MacBookPro_Grid;
		@FindBy(xpath = " //body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[4]/div[5]")
		private WebElement SonyVAIO_Grid;

	// Products
		
		@FindBy(xpath = "//img[@title='HP LP3065']")
		private WebElement HPLP3065_Image;
		@FindBy(xpath = "//a[normalize-space()='HP LP3065']")
		private WebElement HPLP3065_Link;
		@FindBy(xpath = "//p[contains(text(),'Stop your co-workers')]")
		private WebElement HPLP3065_Description;
		@FindBy(xpath = "//div[1]//div[1]//div[2]//div[1]//p[2]")
		private WebElement HPLP3065_PriceInfo;
		@FindBy(xpath = "//div[1]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement HPLP3065_PriceExTax;
		@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]")
		private WebElement HPLP3065_AddToCart;
		@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[2]")
		private WebElement HPLP3065_AddToWishList;
		@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]")
		private WebElement HPLP3065_Compare;

		
		@FindBy(xpath = "//img[@title='MacBook']")
		private WebElement macBook_Image;
		@FindBy(xpath = "//a[normalize-space()='MacBook']")
		private WebElement macBook_Link;
		@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
		private WebElement macBook_Description;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]")
		private WebElement macBook_PriceInfo;
		@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement macBook_PriceExTax;
		@FindBy(xpath = "//div[@id='content']//div[2]//div[1]//div[2]//div[2]//button[1]")
		private WebElement macBook_AddToCart;
		@FindBy (xpath = "//div[@id='content']//div[2]//div[1]//div[2]//div[2]//button[2]")
		private WebElement macBook_AddToWishList;
		@FindBy (xpath = "//div[@id='content']//div[2]//div[1]//div[2]//div[2]//button[3]")
		private WebElement macBook_Compare;
		
		
		@FindBy(xpath = "//img[@title='MacBook Air']")
		private WebElement macBookAir_Image;
		@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'MacBook Air')]")
		private WebElement macBookAir_Link;
		@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin')]")
		private WebElement macBookAir_Description;
		@FindBy(xpath = "//div[@id='product-category']//div[3]//div[1]//div[2]//div[1]//p[2]")
		private WebElement macBookAir_PriceInfo;
		@FindBy(xpath = "//div[@id='product-category']//div[3]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement macBookAir_PriceExTax;
		@FindBy(xpath = "//div[@id='content']//div[3]//div[1]//div[2]//div[2]//button[1]")
		private WebElement macBookAir_AddToCart;
		@FindBy (xpath = "//div[@id='content']//div[3]//div[1]//div[2]//div[2]//button[2]")
		private WebElement macBookAir_AddToWishList;
		@FindBy (xpath = "//div[@id='content']//div[3]//div[1]//div[2]//div[2]//button[3]")
		private WebElement macBookAir_Compare;
		
		
		@FindBy(xpath = "//img[@title='MacBook Pro']")
		private WebElement macBookPro_Image;
		@FindBy(xpath = "//a[normalize-space()='MacBook Pro']")
		private WebElement macBookPro_Link;
		@FindBy(xpath = "//p[contains(text(),'Latest Intel')]")
		private WebElement macBookPro_Description;
		@FindBy(xpath = " //body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]")
		private WebElement macBookPro_PriceInfo;
		@FindBy(xpath = " //body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement macBookPro_PriceExTax;
		@FindBy(xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[1]")
		private WebElement macBookPro_AddToCart;
		@FindBy (xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[2]")
		private WebElement macBookPro_AddToWishList;
		@FindBy (xpath = "//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[3]")
		private WebElement macBookPro_Compare;
			

		@FindBy(xpath = "//img[@title='Sony VAIO']")
		private WebElement sonyVAIO_Image;
		@FindBy(xpath = "//a[normalize-space()='Sony VAIO']")
		private WebElement sonyVAIO_Link;
		@FindBy(xpath = "//p[contains(text(),'Unprecedented power.')]")
		private WebElement sonyVAIO_Description;
		@FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//p[2]")
		private WebElement sonyVAIO_PriceInfo;
		@FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//p[2]//span[1]")
		private WebElement sonyVAIO_PriceExTax;
		@FindBy(xpath = "//div[5]//div[1]//div[2]//div[2]//button[1]")
		private WebElement sonyVAIO_AddToCart;
		@FindBy (xpath = "//div[5]//div[1]//div[2]//div[2]//button[2]")
		private WebElement sonyVAIO_AddToWishList;
		@FindBy (xpath = "//div[5]//div[1]//div[2]//div[2]//button[3]")
		private WebElement sonyVAIO_Compare;
		
//
		@FindBy (xpath = "//span[@id='cart-total']")
		private WebElement cartButtonVisibleText;
		@FindBy (css = "button[title='Remove'] i")
		private WebElement removeItemFromCartBlack;
		@FindBy (xpath = "//div[contains(text(),'Success: You have added')]")
		private WebElement productAddedForComparisonSuccessMessage;
		@FindBy (css = "#compare-total")
		private WebElement compareProducts;
		@FindBy (xpath = "//h1[normalize-space()='Product Comparison']")
		private WebElement productComparison;
		@FindBy (xpath = "//div[contains(text(),'You must')]")
		private WebElement LoginOrCreateAccountError;
		@FindBy (xpath = "//h2[normalize-space()='$2,000.00']")
		private WebElement macBookProPriceTag;
		@FindBy (xpath = "//div[contains(text(),'Success: You have added')]")
		private WebElement addToCartSuccessMessage;
		
// Automation Elements
		
		@FindBy (css = "a[title='My Account']")
		private WebElement myAccountButton;
		@FindBy (xpath = "//div[@id='top-links']//a[normalize-space()='Login']")
		private WebElement loginDropDown;
		@FindBy (css = "#input-email")
		private WebElement emailField;
		@FindBy (css = "#input-password")
		private WebElement passwordField;
		@FindBy (css = "input[value='Login']")
		private WebElement loginButton;
		@FindBy (css = "h2:nth-child(1)")
		private WebElement myAccountPageTitle;
		@FindBy (css = "a[href='http://tek-school.com/retail/index.php?route=account/affiliate/add']")
		private WebElement registerForAnAffiliateAccountLink;
		@FindBy (css = "#input-company")
		private WebElement companyName;
		@FindBy (css = "#input-website")
		private WebElement webSiteName;
		@FindBy (css = "#input-tax")
		private WebElement taxIDField;
		@FindBy (xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]/label[1]/input[1]")
		private WebElement cheque;
		@FindBy (xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[2]/label[1]/input[1]")
		private WebElement paypal;
		@FindBy (xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]/input[1]")
		private WebElement bank;
		@FindBy (css = "#input-cheque")
		private WebElement chequePayeeNameField;
		@FindBy (xpath = "//input[@name='agree']")
		private WebElement agreeToAboutUs;
		@FindBy (css = "input[value='Continue']")
		private WebElement continueButton;
		@FindBy (xpath = "//div[contains(text(),'Success: Your account has been successfully update')]")
		private WebElement accountUpdateSuccessMessage;
		@FindBy (xpath = "//a[normalize-space()='Edit your affiliate information']")
		private WebElement editYourAffiliateInformationLink;
		@FindBy (css = "#input-bank-name")
		private WebElement bankNameField;
		@FindBy (css = "#input-bank-branch-number")
		private WebElement aBA_BSB_NumberField;
		@FindBy (css = "#input-bank-swift-code")
		private WebElement swiftCodeField;
		@FindBy (css = "#input-bank-account-name")
		private WebElement accountNameField;
		@FindBy (css = "#input-bank-account-number")
		private WebElement accountNumberField;
		@FindBy (xpath = "//a[normalize-space()='Edit your account information']")
		private WebElement editYourAccountInfoLink;
		@FindBy (css = "#input-firstname")
		private WebElement firstNameField;
		@FindBy (css = "#input-lastname")
		private WebElement lastNameField;
		@FindBy (css = "#input-telephone")
		private WebElement telephoneField;
		@FindBy (xpath = "//div[contains(text(),'Success: Your account has been successfully update')]")
		private WebElement accountInfoUpdateSuccessMessage;
		
		@FindBy (xpath ="//input[@name='payment']")
		List <WebElement> paymentMode;

//	Automation Methods

		public void clickOnMyAccountButton() {
			myAccountButton.click();
		}

		public void clickOnLoginDropDown() {
			loginDropDown.click();
		}

		public void enterEmailAddress(String userName) {
			emailField.clear();
			emailField.sendKeys(userName);
		}

		public void enterPassword(String password) {
			passwordField.clear();
			passwordField.sendKeys(password);
		}

		public void clickOnLoginButton() {
			loginButton.click();
		}

		public void verifyMyAccountPage() throws IOException {
			myAccountPageTitle.getText();
			UtilitiesCapstone.takeScreenShot("Retail Page 1 - MyAccountPage");
		}

		public void clickOnRegisterForAnAffiliateAccountLink() {
			registerForAnAffiliateAccountLink.click();
		}

		public void enterCompanyName(String company) {
			companyName.clear();
			companyName.sendKeys(company);
		}

		public void enterWebsiteName(String website) {
			webSiteName.clear();
			webSiteName.sendKeys(website);
		}

		public void enterTaxID(String taxID) {
			taxIDField.clear();
			taxIDField.sendKeys(taxID);
		}

		public void selectPayemntMethod2(String paymentMethod) {
			if (paymentMethod == "bank transfer") {
				bank.click();
			} else if (paymentMethod == "cheque") {
				cheque.click();
			} else {
				paypal.click();
			}
		}

		public void selectPaymentMethod(String paymentMethod) {

			List<WebElement> paymentMethodSelection = paymentMode;
			for (WebElement element : paymentMethodSelection) {
				if (element.getAttribute("name").equals("paypal")) {
					element.click();
					break;
				}
			}
		}

		public void clickOnBankTransferPaymentMethod() {
			bank.click();
		}

		public void enterChequePayeeName(String chequePayeeName) {
			chequePayeeNameField.clear();
			chequePayeeNameField.sendKeys(chequePayeeName);
		}

		public void clickOnAgreeToAboutUs() {
			agreeToAboutUs.click();
		}

		public void clickOnContinueButton() {
			continueButton.click();
		}

		public void verifyAccountUpdateSuccessMessage() throws IOException {
			accountUpdateSuccessMessage.getText();
			UtilitiesCapstone.highlightelementBorderAndBackground(accountUpdateSuccessMessage);
			UtilitiesCapstone.takeScreenShot("Retail Page 5 - AccountUpdateSuccessMessage");
		}

		public void clickOnEditYourAffiliateInformationLink() {
			editYourAffiliateInformationLink.click();
		}

		public void enterBankName(String bankName) {
			bankNameField.clear();
			bankNameField.sendKeys(bankName);

		}

		public void enterABA_BSB_Number(String abaNumber) {
			aBA_BSB_NumberField.clear();
			aBA_BSB_NumberField.sendKeys(abaNumber);
		}

		public void enterSWIFTCode(String swiftCode) {
			swiftCodeField.clear();
			swiftCodeField.sendKeys(swiftCode);
		}

		public void enterAccountName(String accountName) {
			accountNameField.clear();
			accountNameField.sendKeys(accountName);
		}

		public void enterAccountNumber(String accountNumber) {
			accountNumberField.clear();
			accountNumberField.sendKeys(accountNumber);
		}

		public void clickOnEditYourAccountInfoLink() {
			editYourAccountInfoLink.click();
		}

		public void enterFirstName(String firstName) {
			firstNameField.clear();
			firstNameField.sendKeys(firstName);
		}

		public void enterLastName(String lastName) {
			lastNameField.clear();
			lastNameField.sendKeys(lastName);
		}

		public void enterEmail(String email) {
			emailField.clear();
			emailField.sendKeys(email);
		}

		public void enterPhoneNumber(String telephone) {
			telephoneField.clear();
			telephoneField.sendKeys(telephone);
		}

//	Miscellaneous Methods

		public void laptopsPicture() {
			Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
					"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
					laptopsPicture);
			if (!ImagePresent) {
				System.out.println("Image not displayed.");
			} else {
				System.out.println("Image displayed.");
			}
		}

		public void sortByLaptopsDropdown() {
			Select select = new Select(sortByLaptopsPage);
			// select.selectByIndex(2);
			select.selectByVisibleText("Rating (Highest)");
		}

		public void showLimitLaptopsDropdown() {
			Select select = new Select(showLimitLaptopsPage);
			// select.selectByIndex(2);
			select.selectByVisibleText("75");
		}
	}	

