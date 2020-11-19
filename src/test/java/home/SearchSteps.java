package home;


//import java.util.ArrayList;
import java.util.List;

//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	public SearchHome searchHome=new SearchHome();
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable table) {
	   
	   
	   
	    List<List<String>> list = table.asLists(String.class);
		for(int i=0; i<list.size(); i++) { 
			searchHome.setS1(list.get(i).get(0));
			searchHome.setS2(list.get(i).get(1));
			
			searchHome.storeHome();
			}
	        System.out.println(" in given statment");     }

		
	
	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
		System.out.println("SEARCH BY Price less than"+int1);
		Price priceObj=new Price(int1);
	   searchHome.searchByPriceLess(priceObj);
	}
	
	@Then("A list of homes that matches the price specification should be {string}")
	public void aListOfHomesThatMatchesThePriceSpecificationShouldBe(String string3) {
	    
		searchHome.printHomesByMatchingSpec(string3); 
		
		
	}
	
	

	
	
	
	
	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String string) {
		System.out.println("SEARCH BY palcement"+string);
		Placement placementObj= new Placement(string);
	searchHome.searchByPlacement(placementObj);	 	
	}
	
	@Then("A list of homes that matches the placement specification should be {string}")
	public void aListOfHomesThatMatchesThePlacementSpecificationShouldBe(String string1) {
		searchHome.printHomesByMatchingSpec(string1);  
	}
		   
	
	
	
	@When("I search about home by material is {string}")
	public void iSearchAboutHomeByMaterialIs(String string) {
		System.out.println("SEARCH BY Matrial"+string);
		Material materialObj=new Material(string);
		searchHome.searchByMaterial(materialObj);}
	
	@Then("A list of homes that matches the material specification should be {string}")
	public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBe(String string2) {
		searchHome.printHomesByMatchingSpec(string2); 
	}
	
	

	
	
	@When("I search about home with price between {int} and {int}")
	public void i_search_about_home_with_price_between_and(Integer int1, Integer int2) {
		System.out.println("SEARCH BY pricev btween"+int1+"and"+int2);
		Price priceObjL=new Price(int1);
		Price priceObjH=new Price(int2);
		searchHome.searchByPriceBetween(priceObjL, priceObjH);	}
	
	@Then("A list of homes that matches the price range specification should be {string}")
	public void aListOfHomesThatMatchesThePriceRangeSpecificationShouldBe(String string4) {
		searchHome.printHomesByMatchingSpec(string4); 	    
	}

	
	
	@When("I search about home with area less than {int}")
	public void iSearchAboutHomeWithAreaLessThan(Integer int1) {
		System.out.println("SEARCH BY area"+int1);
		Area areaObj=new Area(int1);
		searchHome.searchByAreaLess(areaObj);
	}
	
	@Then("A list of homes that matches the area specification should be {string}")
	public void aListOfHomesThatMatchesTheAreaSpecificationShouldBe(String string5) {
		searchHome.printHomesByMatchingSpec(string5); 	    	}

	
	
	@When("I search about home with area more than {int} less than {int}")
	public void i_search_about_home_with_area_more_than_less_than(Integer int1, Integer int2) {
		System.out.println("SEARCH BY area between"+int1+"and"+int2);
		Area areaObjL=new Area(int1);
		Area areaObjH=new Area(int2);
	   searchHome.searchByAreaBetween(areaObjL, areaObjH);
		
	}
	@Then("A list of homes that matches the area range specification should be {string}")
	public void aListOfHomesThatMatchesTheAreaRangeSpecificationShouldBe(String string6) {
		searchHome.printHomesByMatchingSpec(string6); 	    
		}

	
	
	
	@When("I search about home with {int} bedrooms")
	public void i_search_about_home_with_bedrooms(Integer int1) {
		System.out.println("SEARCH BY bedrooms"+int1);
		Bedrooms bedroomsObj=new Bedrooms(int1);
		 searchHome.searchByBedrooms(bedroomsObj);
	}
	@Then("A list of homes that matches the bedrooms specification should be {string}")
	public void aListOfHomesThatMatchesTheBedroomsSpecificationShouldBe(String string7) {
		searchHome.printHomesByMatchingSpec(string7);  
	 
		
	}

	
	
	@When("I search about home with {int} bathrooms")
	public void i_search_about_home_with_bathrooms(Integer int1) {
		System.out.println("SEARCH BY bedrooms"+int1);
		Bathrooms bathroomsObj=new Bathrooms(int1);
		searchHome.searchByBathrooms(bathroomsObj);  
	}
	
	@Then("A list of homes that matches the bathrooms specification should be {string}")
	public void aListOfHomesThatMatchesTheBathroomsSpecificationShouldBe(String string8) {
		searchHome.printHomesByMatchingSpec(string8);     
	
	}

	
	
	@When("I search about home by allowing pets {string}")
	public void i_search_about_home_by_allowing_pets(String string) {
		System.out.println("SEARCH BY pets"+string);
		Pet petsObj=new Pet(string);
		searchHome.searchByPet(petsObj);	}
	@Then("A list of homes that matches the pets specification should be {string}")
	public void aListOfHomesThatMatchesThePetsSpecificationShouldBe(String string9) {
		searchHome.printHomesByMatchingSpec(string9);   
	
	}

	

	
	@When("I search about home by type is {string}")
	public void i_search_about_home_by_type_is(String string) {
		System.out.println("SEARCH BY type"+string);
		HomeType typeObj=new HomeType(string);
		
		searchHome.searchByType(typeObj);	}
	@Then("A list of homes that matches the type specification should be {string}")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBe(String string10) {
		searchHome.printHomesByMatchingSpec(string10); 	}

	
	
	
	@When("I search about home with {int} months")
	public void i_search_about_home_with_months(Integer int1) {
		System.out.println("SEARCH BY leaselength"+int1);
		LeaseLength leseLengthObj=new LeaseLength(int1);
		searchHome.searchByLeaseLength(leseLengthObj);}
	@Then("A list of homes that matches the leaseLingth specification should be {string}")
	public void aListOfHomesThatMatchesTheLeaseLingthSpecificationShouldBe(String string11) {
		searchHome.printHomesByMatchingSpec(string11); 
	}


	
	@When("I search about home with {string}")
	public void i_search_about_home_with(String string) {
		System.out.println("SEARCH BY amenities"+string);
		searchHome.searchByAmenities(string);}
	
	@Then("A list of homes that matches the amenities specification should be {string}")
	public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBe(String string12) {
		searchHome.printHomesByMatchingSpec(string12); 
}
	  
	
	
	@When("I search about home that the {string}")
	public void iSearchAboutHomeThatThe(String fs) {
		System.out.println("SEARCH BY"+fs);
		searchHome.srearchByMultiFilters(fs);
	}
	@Then("A list of homes that matches the filters specification should be {string}")
	public void aListOfHomesThatMatchesTheFiltersSpecificationShouldBe(String string13) {
		searchHome.printHomesByMatchingSpec(string13);  
	}

	
		
					
		
	/*
 	@When("I search about home that the {string}")
 	
 	
 	Scenario: Search about home with less than a specific price and less than a specific area
    When I search about home that the "price less than 400 and area is 12 "
    Then A list of homes that matches the price and area specification should be "Home [type =APARTMENT ,Material =BRICK ,Placement =CITY  ,pet =NO  Amenities =, ELEVATOR ,Price =230  ,Area =120  NumOfBedrooms =4    NumOFBathrooms =2   LeaseLingth =12 ]"
    
 	
 	

	public void i_search_about_home_that_the(String string) {
	  String[] strings=string.split(" and ");
	  for( int j =0; j<strings.length;j++) {
		   String [] arr= strings[j].split(" ");
		   if(strings[j].startsWith("price less than")) { iSearchAboutHomeWithPriceLessThan(Integer.parseInt(arr[3]));}
		   if(strings[j].startsWith("price between")) { i_search_about_home_with_price_between_and(Integer.parseInt(arr[2]),Integer.parseInt(arr[4]))  ;}
           if(strings[j].startsWith("area less than")) { iSearchAboutHomeWithAreaLessThan(Integer.parseInt(arr[3]));}
           if(strings[j].startsWith("area between")) {i_search_about_home_with_area_more_than_less_than(Integer.parseInt(arr[2]),Integer.parseInt(arr[4])); }
           if(strings[j].startsWith("number of bathrooms is ")) { i_search_about_home_with_bathrooms(Integer.parseInt(arr[4]));}
           if(strings[j].startsWith("number of bedrooms is ")) {i_search_about_home_with_bedrooms(Integer.parseInt(arr[4]));}
           if(strings[j].startsWith("palcement is ")) {iSearchAboutHomeBy(arr[2]);}
           if(strings[j].startsWith("material is ")) {iSearchAboutHomeBy(arr[2]); }
           if(strings[j].startsWith("type is ")) { i_search_about_home_by_type_is(arr[2]);}
           if(strings[j].startsWith("lease length is ")) {i_search_about_home_with_months(Integer.parseInt(arr[3])); }
           if(strings[j].startsWith("allowing pets is ")) { i_search_about_home_by_allowing_pets(arr[3]); }
	       if(strings[j].startsWith("amenities is ")) {i_search_about_home_with(arr[2]);  }
          }
	      for(int i=0;i<selected_homes.size(); i++) {
		  for(int j=i+1;j<selected_homes.size();j++) {
		  if(selected_homes.get(i).equals(selected_homes.get(j))) {
			selected_homes13.add(selected_homes.get(i));
			selected_homes.remove(j);}}}
            selected_homes.clear();
          for(Home b:selected_homes13 ) {
          //System.out.println(b.toString());
		  selected_homes.add(b);}}
		  	 

@Then("A list of homes that matches the price and area specification should be {string}")
public void aListOfHomesThatMatchesThePriceAndAreaSpecificationShouldBe(String string13) {
	for (Home h:selected_homes) {
		
		this.checkoutput.append(h.toString());
		
	}

	assertEquals(checkoutput.toString(),string13);
		System.out.println(this.checkoutput);
	selected_homes.clear();
   
}

		  	
	  

	/*@Then("A list of homes that matches the specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_specification_should_be_returned_and_printed_on_the_console() {
		for (Home h:selected_homes) {
			System.out.println(h.toString());
			
		}
		selected_homes.clear();
		
	

	


	}*/
	
	
	
	
	}


	
	
	
	
	
	
	
	


