package stepDefinitions;

import java.io.IOException;

import core.BaseCapstone;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsPageObjects;

public class LaptopsSteps extends BaseCapstone{
	
	LaptopsPageObjects laptopsPage = new LaptopsPageObjects();
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	  laptopsPage.clickOnLaptopsDropDown();
	  logger.info("User clicked on Laptop & NoteBook tab successfully");
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    laptopsPage.clickOnShowAllLaptops();
	    logger.info("User clicked on Show all Laptop & NoteBook option successfully");
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopsPage.clickOnMacBook();
		logger.info("User clicked on MacBook item successfully");
	}

	@Then("User should see a message Success: You have added MacBook to your shopping cart!")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() throws IOException {
	   laptopsPage.verifySuccessMessage("Success: You have added MacBook to your shopping cart!");
	   logger.info("User clicked on MacBook item successfully");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_item_s_$_showed_to_the_cart(String string) throws IOException {
	    laptopsPage.verifyCartTotal("1 item(s) - $602.00");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() throws IOException {
	   laptopsPage.clickOnCartOption();
	   logger.info("User clicked on cart option successfully");
	}

	@Then("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	   laptopsPage.removeItemFromCart();
	   logger.info("User clicked on red X button to remove the item from cart successfully");
	}

	@Then("Item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show_item_s_$(String string) throws IOException {
	  laptopsPage.verifyCartTotalAfterRemovingItem("0 item(s) - $0.00");
	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    laptopsPage.compareMacBook();
	    logger.info("User clicked on product comparison icon on MacBook successfully");
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    laptopsPage.compareMacBookAir();
	    logger.info("User clicked on product comparison icon on MacBook Air successfully");
	}

	@Then("User should see a message Success: You have added MacBook Air to your product comparison!")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison()  {
		laptopsPage.productComparisonSuccessMessage();
		logger.info("You have added MacBook Air to your product comparison!");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	  laptopsPage.compareProducts();
	  logger.info("User clicked on Product comparison link successfully");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
	   laptopsPage.productComparison ();
	}

	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	  laptopsPage.addSonyVAIOToWishList();
	  logger.info("User clicked on heart icon to add Sony VaIO laptop to wish list successfully");
	}

	@Then("User should get a message You must login or create an account to save Sony VAIO to your wish list!")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws IOException {
	  laptopsPage.loginOrCreateAccountErrorMessage();
	}

	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
	   laptopsPage.clickOnMacBookPro();
	   logger.info("User clicked on MacBook Pro item successfully");
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(String string) throws IOException {
	   laptopsPage.macBookProPriceTagInfo();
	}

}



