@desktops @all
Feature: Desktops
#Background keyword is used for steps that is common for all scenarios in this feature file
#if the scenario is different from our first scenario and doesn't share the same steps as we 
#defined in background keywrod, then we need to create a separate feature file

# strangley if I change the name to laptopsandnotebooks then it does not work so better to short it to laptops
Background:
	    Given User is on Retail website
	    When 	User click on Desktops tab 
	    And 	User click on Show all desktops 
        
  Scenario: User verify all items are present in Desktops tab
  	 	Then 	User should see all items are present in Desktop page

	Scenario: User add HP LP3065 from Desktops tab to the cart
			And 	User click  ADD TO CART option on ‘HP LP3065’ item 
			And 	User select quantity 1 
			And 	User click add to Cart button 
			Then 	User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’
	
	Scenario: User add Canon EOS5D from Desktops tab to the cart
			And 	User click  ADD TO CART option on ‘Canon EOS5D’ item 
			And 	User select color from dropdown ‘Red’
			And 	User select quantity 1 
			And 	User click add to Cart button 
			Then 	User should see a message ‘Success: You have added Canon EOS 5D Camera to your shopping cart!’
	
	Scenario Outline: User add a review to Canon EOS5D item in Desktops tab
			And 	User click on Canon EOS5D item 
			And 	User click on write a review link 
			And 	User fill the review information with yourName '<yourName>' and yourReview '<yourReview>' and rating '<rating>'
			And 	User click on Continue Button 
			Then 	User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”
	
	Examples:
	| yourName       | yourReview                             | rating |
	| Hadi | good product recommend to others       | 1      |
	| Uncle Sam      | fair price good quality and good shap  | 2      |
	| Sleepy Joe     | good quality nice delivery and good CS | 3      |
