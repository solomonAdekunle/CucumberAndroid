#Feature: User Should be able to Navigate to Registeration Page and Register 
#
#@ignore
#@Register 
#Scenario: Validating Elements displayed on Registration Page. 
#	Given I navigate to the Registrationpage on "browser" 
#	Then  I should see Register on the Register form 
#	And  I should Email Input box displayed on Registration page 
#	And  I should see Password Input box displayed on Registration page 
#	And  I should see Useranme Input box displayed on Registration Page 
#	And  I should see ScreenName Input box displayed on Registration Page 
#	And  I should see FirstName Input box displayed on Registration Page 
#	And  I should see Surname Input box displayed on Registration Page 
#	And  I should see Date of Birth Day Dropdown box displayed on Registration Page 
#	And  I should see Date of Birth Month Dropdown box displayed on Registration Page 
#	And  I should see Date of Birth Year Dropdown box displayed on Registration Page 
#	And  I should see Gender Radio Buttons displayed on Registration Page 
#	And  I should see Country Input box displayed on Registration Page 
#	And  I should see Currency Input box displayed on Registration Page 
#	And  I should see House Number Input box displayed on Registration Page 
#	And  I should see Find Address button displayed on Registration Page 
#	And  I should see Country Code dropdown box displayed on Registration Page 
#	And  I should see Contact Number Input box displayed on Registration Page 
#	And  I should see Deposit Limit Type Input box displayed on Registration Page 
#	And  I should see Deposit Limit Amount Dropdown box displayed on Registration Page 
#	And  I should see Free Bonuses and Offer Check box checked displayed on Registration Page 
#	And  I should see OverEighteenPlus Check box displayed on Registration Page 
#	And  I should see terms link within OverEighteenPlus Content displayed on Registration Page 
#	And  I should see Privacy Policy link within OverEighteenPlus Content displayed on Registration Page 
#	And  I should see Register Now Button disabled on Registration page
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid e-mail is input on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegEmail as "testplaytech.com" 
#	And I enter RegPassword as "a" 
#	Then I should see Invalid Error Message displayed by the Email input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered Password input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegPassword as "badss" 
#	And I enter regUsername as " " 
#	Then I should see Error Message displayed by the Password input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered Username input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter regUsername as "user" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the UserName input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered OnScreenName input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter a RegScreenName as "sade" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the OnScreenName input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered FirstName input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegFirstName as "asdf�$" 
#	And  I enter RegSurName as " " 
#	Then I should see Error Message displayed by the FirstName input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered SurName input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegSurName as "asdfr$�" 
#	And I enter RegFirstName as " " 
#	Then I should see Error Message displayed by the SurName input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered Address input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegAddress as "q" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the Address input box on Registration Page 
#@ignore	
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered on Postcode input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	And I enter RegPostCode as "vaa" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the Postcode input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered on Town input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegTown as "SddS4$" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the Town input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered on County input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegCounty as "<dasss$%" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the County input box on Registration Page 
#	
#@ignore 
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered on Contact number input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegContactNum as "901442a1qq" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the Contact Number input box on Registration Page 
#	
#
##@ignore
#@Register 
#Scenario:
#Verifying if Error Message will be displayed when Invalid data is entered on DepositLimit Amount input box on Registration page 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter RegContactNum as "901442a1qq" 
#	And I enter RegPassword as " " 
#	Then I should see Error Message displayed by the Deposit linit Amount input box on Registration Page 
#	
#	
##@web 
#@Register 
#Scenario Outline: Registration with Invalid Data 
#	Given I navigate to the Registrationpage on "browser" 
#	When I enter regUsername as "<username>" 
#	And I enter RegPassword as "<password>" 
#	And I enter a RegScreenName as "<screenName>" 
#	And I enter RegEmail as "<E-mail>" 
#	And I enter RegFirstName as "<firstName>" 
#	And I enter RegSurName as "<surname>" 
#	And I enter RegDOBDay as "<Day>" 
#	And I enter RegDOBMonth as "<Month>" 
#	And I enter RegDOBYear as "<Year>" 
#	And I click Gender Type as Female 
#	And I enter Country as "<country>" 
#	And I enter Currency as "<CurrencyType>" 
#	#And I click on RegClickHere 
#	And I enter RegAddress as "<Address>" 
#	And I enter RegTown as "<Town>" 
#	And I enter RegCounty as "<county>" 
#	And I enter RegPostCode as "<Postcode>" 
#	And I enter RegDialingCode as "<dialingcode>" 
#	And I enter RegContactNum as "<contactNumber>" 
#	# And I click on deposit limit click here link
#	And I enter Choose Type as "<TypeLimit>" 
#	And I enter Choose limit as "<ChooseLimit>" 
#	And I click on RegT$CCheckBox  
#	Then I should see Error Messsage displayed on Register Page 
#	And I should see Register Now Button disabled on Registration page
#	
#	Examples: 
#		|username    			 |password 		        |screenName   			|E-mail                |firstName  |surname   |Day  |Month| country  | CurrencyType    |Year |Address             |Town                                              |county 										    |Postcode |dialingcode	 |contactNumber    |TypeLimit    | ChooseLimit 		 |expectedResult  |
#		|mmm12                   |MNNH$1                |mmm12                  |test@playtec.com      |MJHGF-12   |MNHGF     |3    |OCT  |	 Poland  |  GBP 		   |1980 |8, silverthorne     |London                                            |l                                                 |SW8 3HE  | 44		     |0203700700       |   Daily     |   300             |FAILURE         |
#		|NNNNNNNNNNNNNNNNNNNNN1  |GGGGGGGGGGGGGGGGGGGG1 |1234543212             |test@playtec.com      |GHJUYT'S   |AGGTR'S   |3    |OCT  |	Sweden	 |  EUR			   |1980 |8//                 |L                                                 |Greater LONDON                                    |SW8 3HE  |	359			 |0207000100       |   Monthly   |   100             |FAILURE         |
#		|markge                  |12345678              |GGGGGGGGGGGGGGGGGGGG1  |adekunleso@yahoo.com  |AGRT BG    |HJUUT12   |3    |OCT  | Latvia	 |  USD		       |1980 |8%                  |london1                                           |Greatest of LONDON area of united kingdon europes |SW8 3HE  |	357			 |0207001000       |   Weekly    |   100             |FAILURE         |
#		|12345678                |ADSERTYG              |ASEDCFREEE             |test@playtec.com      |           |ASEDDR    |3    |OCT  |  Canada  |	GBP            |1980 |8,silverthorne      |Greatest of LONDON area of united kingdon europes |Greatest of LONDON area of united kingdon europes |         |	1			 |0207100600       |   Daily     |   500             |FAILURE         |
#		|		                  |lookjng�*^            |makomi1lbugo           |                      |asderty    |          |3    |OCT  |  Norway  | 	EUR		       |1980 |                    |london                                            |London                                        |     	  |	508			 |0207100601       |   Weekly    |   200             |FAILURE         |
#		|Snetplay-TV             |����������>           |adsggtt444^$�          |temmtt                |add*add    |122asa^   |23   |Jun  |	Germany	 |	GBP		 	   |2018 |�80                 |London&&&                                         |1234555                                           |SW8 3HE  |	1			 |++U13234803556000|  Monthly    |   1000            |FAILURE         |
#		|123456�1                |$$$$$%%1a             |makomi1lbugo           |testplaytech.com      |adde$)     |&$�agas   |3    |  	  | Finland  |  UDS		       |2015 |8                   |greater3LONDON                                    |                                                  |      	  |				 |                 |  Daily      |   100             |FAILURE         |
#		|{generator}             |Manjuyt               |{generator}            |l@.com                |           |          |3    |OCT  |          |  GBP			   |1980 |80                  |SDDDD                                             |LONDON                                            |SW8 %67  |	220			 |9191GGSS         |  Weekly     |   100             |FAILURE         |
#		|ScreenName1             |Bola123$%^            |ScreenName1            |test@playtech.com     |nav        |look	  |3    |OCT  |	Canada	 |		 		   |1980 |80                  |London                                            |London                                            |SW8 3HE  |	421			 |02071006020      | Monthly     |   2500            |FAILURE         |
#		|Snetplaytv$%            |Looking/>             |yahoonnana             |���test@playtech.com  |           |lao@      |3    |OCT  |	Finland	 |  USD      	   |2001 |                    |LONDON%#                                          |Surrey-london                                     |SW8 3HE+8|				 |  london01       |  Weekly     |   100             |FAILURE         |
#		|{generator}    		 |Bola123$%^           	|{generator}            | testplaytech.com     |Caroline   |Paris     |06   | OCT |  Canada  |  GBP        	   |1982 | 6 goodhew Road     |Croydon         									 |surrey                							|CR0 6JX  |	500			 |020700070100	   | Daily	     |  1000		     |FAILURE         | 
#		
#		
#		@ignore 
#		@Register 
#		Scenario Outline: Registration with valid Data 
#			Given I navigate to the Registrationpage on "<browser>" 
#			When I enter regUsername as "<username>" 
#			And I enter RegPassword as "<password>" 
#			And I enter a RegScreenName as "<screenName>" 
#			And I enter RegEmail as "<E-mail>" 
#			And I enter RegFirstName as "<firstName>" 
#			And I enter RegSurName as "<surname>" 
#			And I enter RegDOBDay as "<Day>" 
#			And I enter RegDOBMonth as "<Month>" 
#			And I enter RegDOBYear as "<Year>" 
#			And I click Gender Type as Female 
#			And I enter Country as "<country>" 
#			And I enter Currency as "<CurrencyType>" 
#			And I click on RegClickHere 
#			And I enter RegAddress as "<Address>" 
#			And I enter RegTown as "<Town>" 
#			And I enter RegCounty as "<county>" 
#			And I enter RegPostCode as "<Postcode>" 
#			And I enter RegDialingCode as "<dialingcode>" 
#			And I enter RegContactNum as "<contactNumber>" 
#			And I click on deposit limit click here link 
#			And I enter Choose Type as "<TypeLimit>" 
#			And I enter Choose limit as "<ChooseLimit>" 
#			And I click on RegT$CCheckBox 
#			And I click on RegSubmitButton 
#			Then I should navigate "<expectedResult>" to welcome page. 
#			
#			Examples: 
#				|username    			 |password 		        |screenName   			|E-mail                |firstName  |surname   |Day  |Month| country  		 | CurrencyType    |Year |Address             |Town          |county 		  |Postcode |	dialingcode		|contactNumber    |TypeLimit    | ChooseLimit 		 |expectedResult	|
#				|{generator}     		 |Bola123$%^            |{generator}            | test@playtech.com    |Caroline   |Paris     |06   | OCT | United Kingdom   |    GBP          |1982 | 6 goodhew Road     |Croydon       |surrey          |CR0 6JX  |		44			|020700070100	    |Daily	      |�1000		      |FAILURE          | 
#				
#				
#				
#				@ignore 
#				@Register 
#				Scenario: Deposit Limit link on Registrition Page 
#					Given I navigate to the Registrationpage on "browser" 
#					Then I should see Deposit Limit Link 
#					
#				@ignore 
#				@Register 
#				Scenario: Deposit Limit link on Registrition Page 
#					Given I navigate to the Registrationpage on "browser" 
#					When I click on deposit limit click here link 
#					Then I should see Choose Type dropdown box 
#					And I should see Choose Limit  dropdown box 
#					
#				@ignore 
#				@Register 
#				Scenario Outline: setting a Weekly   deposit limit  on Registration page 
#					Given I navigate to the Registrationpage on "<browser>" 
#					When I click on deposit limit click here link 
#					And I enter Choose Type as "<ChooseType>" 
#					And I enter Choose limit as "<ChooseLimit>" 
#					Then I should see Choose Type as "<ExpectResultChooseType>" 
#					And I should see Choose Limit as "<ExpectResultChooseLimit>" 
#					
#					Examples: 
#						|ChooseType | ChooseLimit| ExpectResultChooseType	|ExpectResultChooseLimit|
#						|Weekly		|�10,000	 |Weekly					|�10,000				|
#						| Daily		| 1000		 | Daily					|1000					|
#						| Daily		|Other	 	 | Other					| 10000					|
#						
#						@ignore 
#						@Register 
#						Scenario: setting a Other deposit limit  on Registration page 
#							Given I navigate to the Registrationpage on "<browser>" 
#							When I click on deposit limit click here link 
#							And I enter Choose Type as "Monthly" 
#							And I enter Choose limit as "Other" 
#							And I enter Other Amount as "�10,000" 
#							Then I should see Choose Type as "Monthly" 
#							And I should see Choose Limit as "Other" 
#							And I should see Other Amount  as "�10,000" 
#							
#						@ignore 
#						@Register 
#						Scenario: Clicking on BonusTerms And Wagering Requirement link 
#							Given I navigate to the Registrationpage on "browser" 
#							When I click on BonusTerms and Wagering link 
#							Then I should see BonusTerms and Condition pop-up displayed 
#							
#						@ignore 
#						@Register 
#						Scenario: Clicking on Close Icon within the Bonus terms frame box 
#							Given I navigate to the Registrationpage on "browser" 
#							When I click on BonusTerms and Wagering link 
#							And I click on the Close icon within Bonus Term Frame box 
#							Then I should see no BonusTerms and Condition pop-up frame box 
#							
#						@ignore 
#						@Register 
#						Scenario: Clicking on Over18Terms link 
#							Given I navigate to the Registrationpage on "browser" 
#							When I click on  OverEighteen Terms link 
#							Then I should see Terms and Condition pop-up displayed 
#						@ignore 
#						@Register 
#						Scenario: Clicking on Close icon on Over18Term and Condition Frame Box 
#							Given I navigate to the Registrationpage on "browser" 
#							When I click on  OverEighteen Terms link 
#							And I click on the Close icon within the Frame box 
#							Then I should see no Terms and Condition pop-up frame box 
#						@ignore 
#						@Register 
#						Scenario: Clicking on OverEighteen Privacy Policy link 
#							Given I navigate to the Registrationpage on "browser" 
#							When I click on  OverEighteen Privacy Policy link 
#							Then I should see Privacy Policy pop-up displayed 
#							
#						@ignore 
#						@Register 
#						Scenario: Clicking on Close icon on Over18Term and Condition Frame Box 
#							Given I navigate to the Registrationpage on "browser" 
#							When I click on  OverEighteen Privacy Policy link 
#							And I click on the Close icon within the Frame box 
#							Then I should see no Privacy Policy pop-up frame box 
#							