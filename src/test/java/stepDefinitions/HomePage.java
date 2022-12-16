package stepDefinitions;

import java.io.IOException;

import core.BaseCapstone;
import io.cucumber.java.en.*;
import pageObjects.HomePageObjects;

public class HomePage extends BaseCapstone {

	HomePageObjects homePage = new HomePageObjects();

	@When("User click on Currency")
	public void user_click_on_currency() {
	    homePage.clickOnCurrencyDropDown();
	    logger.info("User clicked on Currency successfully");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	    homePage.selectCurrencyType("USD"); // The currency here is not important
	    logger.info("User Chose Euro from dropdown successfully");
	}

	@Then("Currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
	    homePage.getEuroCurrencySign();
	    logger.info("Currency value should change to Euro successfully");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    homePage.clickOnShoppingCart();
	    logger.info("User clicked on shopping cart successfully");
	}

	@Then("Your shopping cart is empty! message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException {
	    homePage.getShoppingCartMessage("Your shopping cart is empty!");
	}
}
