package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import core.BaseCapstone;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.RetailPageObjects;
import utilities.UtilitiesCapstone;

public class RetailPage extends BaseCapstone {

	RetailPageObjects retailPage = new RetailPageObjects();

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccountButton();
		logger.info("User clicked on MyAccount successfully");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPage.clickOnLoginDropDown();
		logger.info("User clicked on Login successfully");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) {
		retailPage.enterEmailAddress("dev@dev.com");
		retailPage.enterPassword("pass");
		logger.info("User enter username and password successfully");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickOnLoginButton();
		logger.info("User clicked on Login button successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		retailPage.verifyMyAccountPage();
		logger.info("User is logged into MyAccount successfully");
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.clickOnRegisterForAnAffiliateAccountLink();
		logger.info("User clicked on Register for an Affiliate Account link successfully");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompanyName(data.get(0).get("company"));
		retailPage.enterWebsiteName(data.get(0).get("website"));
		retailPage.enterTaxID(data.get(0).get("taxID"));
		retailPage.selectPaymentMethod(data.get(0).get("paymentMethod"));
		retailPage.enterChequePayeeName(data.get(0).get("chequePayeeName"));
		logger.info("User data entered successfully");
		UtilitiesCapstone.takeScreenShot("Retail Page 2 - Affiliate Form");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.clickOnAgreeToAboutUs();
		logger.info("User checked on About us check box successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPage.clickOnContinueButton();
		logger.info("User clicked on Continue button successfully");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
		retailPage.verifyAccountUpdateSuccessMessage();
	}

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPage.clickOnEditYourAffiliateInformationLink();
		logger.info("User clicked on Edit your affiliate information link successfully");
	}

	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.clickOnBankTransferPaymentMethod();
		logger.info("User clicked on Bank Transfer radio button successfully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) throws InterruptedException, IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterBankName(data.get(0).get("bankName"));
		retailPage.enterABA_BSB_Number(data.get(0).get("abaNumber"));
		retailPage.enterSWIFTCode(data.get(0).get("swiftCode"));
		retailPage.enterAccountName(data.get(0).get("accountName"));
		retailPage.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("User filled Bank information with given information successfully");
		UtilitiesCapstone.takeScreenShot("Retail Page 3 - Bank Information");
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickOnEditYourAccountInfoLink();
		logger.info("clicked on Edit your account information link successfully");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(data.get(0).get("firstName"));
		retailPage.enterLastName(data.get(0).get("lastName"));
		retailPage.enterEmail(data.get(0).get("email"));
		retailPage.enterPhoneNumber(data.get(0).get("telephone"));
		logger.info("User modified the given information successfully");
		UtilitiesCapstone.takeScreenShot("Retail Page 4 - Modify Account Info");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws IOException {
		retailPage.verifyAccountUpdateSuccessMessage();
		logger.info("Success: Your account has been successfully updated.");
	}

}
