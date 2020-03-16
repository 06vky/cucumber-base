
Feature: To validate the Adactin Page 
Scenario: To validate the user details 
Given User is on the Adactin homepage
When User enters his details
	|userName	 |password|
	|Rock12345 |Rock12345|
And User clicks the login button
And User should verify the message
And User should search hotel 
	|location |Hotels				 |	roomtypes |numberofrooms|adultsperroom|childrenperroom|
	|London		|Hotel Sunshine|Super Deluxe|	3 - Three		| 2 - Two			|1 - One|
And User enters payment
	|firstname|lastname|billingaddress|creditcardnumber|creditcardtype|expirymonth|expiryyear|cvvnumber|
	|Mani		|S			 	 |Ariyalur				|9765432112345678|VISA					|April			|2023			 |234|
Then User gets orderid
