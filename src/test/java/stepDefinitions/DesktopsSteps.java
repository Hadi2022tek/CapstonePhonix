package stepDefinitions;

import java.io.IOException;
import core.BaseCapstone;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObjects;
import utilities.UtilitiesCapstone;

public class DesktopsSteps extends BaseCapstone {

	DesktopsPageObjects desktopsObjects = new DesktopsPageObjects();

	@Given("User is on Retail website")
	public void retailWebsitePage() throws IOException, InterruptedException {
		desktopsObjects.validateRetailPage();
		logger.info("Retail page validated successfully");
	}

	@When("User click on Desktops tab")
	public void clickOnDesktopsTab() {
		desktopsObjects.clickOnDesktopsTab();
		logger.info("User clicked on Desktops tab successfully");
	}

	@When("User click on Show all desktops")
	public void clickOnShowAllDesktops() {
		desktopsObjects.clickOnShowAllDesktops();
		logger.info("User clicked on Show All Desktops tab successfully");
	}

	@Then("User should see all items are present in Desktop page")
	public void showAllItemsInDesktopsPage() throws IOException {
		desktopsObjects.showAllItemsInDesktopsPage();
		logger.info("All the items are present in the page");
	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void clickAddToCartHPLP3065() {
		desktopsObjects.clickAddToCartHPLP3065();
		logger.info("User added HP LP3065 to the cart successfully");
	}

	@When("User select quantity 1")
	public void userSelectQuantity() {
		desktopsObjects.userSelectQuantity("1");
		logger.info("User selected 1 for the quantity successfuly");

	}

	@When("User click add to Cart button")
	public void clickAddToCart() {
		desktopsObjects.clickAddToCart();
		logger.info("User clicked on add to cart successfuly");
	}

	@Then("User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’")
	public void addHPLP3065ToCartSuccessMessage() throws IOException {
		desktopsObjects.addHPLP3065ToCartSuccessMessage("Success: You have added HP LP3065 to your shopping cart!");
		logger.info("Add to Cart success Message is displayed successfuly");
	}

	@When("User click  ADD TO CART option on ‘Canon EOS5D’ item")
	public void ClickAddToCartCannonEOS5D() {
		desktopsObjects.clickAddToCartCannonEOS5D();
		logger.info("User added Cannon EOS5D to the cart successfuly");
	}

	@When("User select color from dropdown ‘Red’")
	public void selectColorRed() {
		desktopsObjects.selectColorRed();
		logger.info("User selected Red color successfuly");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D Camera to your shopping cart!’")
	public void addCannonEOS5DToCartSuccessMessage() throws IOException {
		desktopsObjects.addCannonEOS5DToCartSuccessMessage("Success: You have added Canon EOS 5D Camera to your shopping cart!");
		logger.info("Cannon EOS 5D Add To Cart Message successfuly");
	}

	@When("User click on Canon EOS5D item")
	public void clickCannonEOS5D() {
		desktopsObjects.clickCannonEOS5D();
		logger.info("User clicked on Cannon EOS5D link successfuly");
	}

	@When("User click on write a review link")
	public void clickWriteAReview() {
		desktopsObjects.clickWriteAReview();
		logger.info("User clicked on write a review link successfuly");
	}

	@When("User fill the review information with yourName {string} and yourReview {string} and rating {string}")
	public void User_fill_the_review_information_with_yourName_and_yourReview_and_rating(String yourName,
			String yourReview, String rating) throws IOException {
		desktopsObjects.fillReviewNamewithParam(yourName);
		desktopsObjects.fillReviewTextWithParam(yourReview);
		desktopsObjects.selectRating(rating);
		UtilitiesCapstone.takeScreenShot("Desktops Page 5 - Review Information");
		logger.info("User filled the review field successfuly");
	}

	@When("User click on Continue Button")
	public void clickContinueButton() {
		desktopsObjects.clickContinueButton();
		logger.info("User clicked on continue button successfuly");
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void reviewSubmittedSuccessMessage() throws IOException {
		desktopsObjects.reviewSubmittedSuccessMessage();
		logger.info("Review adde message displayed successfuly");
	}
}
