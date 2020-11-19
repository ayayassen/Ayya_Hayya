Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenities-price-area-bedrooms-bathrooms-leaseLength)
Given these homes are contained in the system

                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                
               
  
 	   Scenario: Search about home by placement
When I search about home by "CITY"
    Then A list of homes that matches the placement specification should be "Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
     
   Scenario: Search about home by  material
		   When I search about home by material is "WOOD"
		  Then A list of homes that matches the material specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]"
		  
    Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be "Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
    
     
	Scenario: Search about home with price in specific range
    When I search about home with price between 400 and 700
    Then A list of homes that matches the price range specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]"
    
    
    
    Scenario: Search about home with less than a specific area
 When I search about home with area less than 200
     Then A list of homes that matches the area specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
    
    
    Scenario: Search about home with area between ranges
 When I search about home with area more than 100 less than 140
 Then A list of homes that matches the area range specification should be "Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"


     Scenario: Search about home with number of bedrooms 
    When I search about home with 4 bedrooms
    Then A list of homes that matches the bedrooms specification should be "Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
    
    Scenario: Search about home with number of bathrooms 
    When I search about home with 2 bathrooms
   Then A list of homes that matches the bathrooms specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
    Scenario: Search home by allowing pets
  When I search about home by allowing pets "NO"
  Then A list of homes that matches the pets specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
    
    Scenario: Search home by type
  When I search about home by type is "HOUSE"
  Then A list of homes that matches the type specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]"
    
    Scenario: Search about home by lease length 
    When I search about home with 6 months
    Then A list of homes that matches the leaseLingth specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]"
    
    Scenario: Search about home by amenities 
    When I search about home with "ELEVATOR"
    Then A list of homes that matches the amenities specification should be "Home [type =HOUSE ,Material =WOOD ,Placement =VILLAGE  ,pet =NO  Amenities =, GARAGEPARKING, FIREPLACE, ELEVATOR ,Price =510  ,Area =150  NumOfBedrooms =3    NumOFBathrooms =2   LeaseLingth =6 ]Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
    Scenario: Search about home with combination filters
    When I search about home that the 'price less than 400,area less than 130,lease length is 12'
    Then A list of homes that matches the filters specification should be "Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
     
    
 