@home @all
Feature: Home Page
 
 	Scenario: User verify currency values change
			Given 	User is on Retail website
		  When 		User click on Currency
			Then 		User Chose Euro from dropdown
			Then 		Currency value should change to Euro
			Then 		User click on shopping cart
			When 		Your shopping cart is empty! message should display