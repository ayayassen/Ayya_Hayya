package home;

import java.util.ArrayList;
import java.util.List;

import home.Amenities;
import home.Home;
import home.HomeStore;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	public ArrayList<Home> selected_homes=new ArrayList<Home>();
	public ArrayList<Home> selected_homes13=new ArrayList<Home>();
	public HomeStore store=new HomeStore();
	public String s1,s2;
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable table) {
	   
	   
	   
	    List<List<String>> list = table.asLists(String.class);
		for(int i=0; i<list.size(); i++) { 
			s1=list.get(i).get(0);
			s2=list.get(i).get(1);
			store.addHome(s1,s2);
			}
	        System.out.println(" in given statment");     }

		
	
	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("in when statment price less than "+" "+int1.toString());
	  for(Home h:store.homeList) {
		  if(h.getPrice()<int1.intValue()) {selected_homes.add(h);}
	  }
	}
	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String string) {
		 	System.out.println(" in when statment by placement");
			for(Home h:store.homeList) {
			  if(h.getPlacement().equals(string)) {selected_homes.add(h);}}}
		
		   
	
	
	
	@When("I search about home by material is {string}")
	public void iSearchAboutHomeByMaterialIs(String string) {
		System.out.println(" in when statment by material");
		
		for(Home h:store.homeList) {
			  if(h.getMaterial().equals(string)) {
				  selected_homes.add(h);}}}
	
	

	
	
	@When("I search about home with price between {int} and {int}")
	public void i_search_about_home_with_price_between_and(Integer int1, Integer int2) {
		System.out.println("in when statment by price in range");
		  for(Home h:store.homeList) {
			  if(h.getPrice()>int1.intValue()&&h.getPrice()<int2.intValue()) {selected_homes.add(h);}
		  }	}

	
	
	@When("I search about home with area less than {int}")
	public void iSearchAboutHomeWithAreaLessThan(Integer int1) {
		System.out.println("in when statment by area less than "+" "+int1.toString());
		  for(Home h:store.homeList) {
			  if(h.getArea()<int1.intValue()) {selected_homes.add(h);}
		  }
	}

	
	
	@When("I search about home with area more than {int} less than {int}")
	public void i_search_about_home_with_area_more_than_less_than(Integer int1, Integer int2) {
	   
		System.out.println("in when statment by area in range");
		  for(Home h:store.homeList) {
			  if(h.getArea()>int1.intValue()&&h.getArea()<int2.intValue()) {selected_homes.add(h);}
		  }
		
		
	}

	
	
	
	@When("I search about home with {int} bedrooms")
	public void i_search_about_home_with_bedrooms(Integer int1) {
		System.out.println("in when statment by num of bedrooms equal "+" "+int1.toString());
		  for(Home h:store.homeList) {
			  if(h.getBedroom()==int1.intValue()) {selected_homes.add(h);}
		  }
	}

	
	
	@When("I search about home with {int} bathrooms")
	public void i_search_about_home_with_bathrooms(Integer int1) {
		System.out.println("in when statment by num of bedrooms equal "+" "+int1.toString());
		  for(Home h:store.homeList) {
			  if(h.getBathroom()==int1.intValue()) {selected_homes.add(h);}
		  }   
	}

	
	
	@When("I search about home by allowing pets {string}")
	public void i_search_about_home_by_allowing_pets(String string) {
		System.out.println(" in when statment by allowing pets");
		for(Home h:store.homeList) {
			  if(h.getPets().equals(string)) {selected_homes.add(h);}}
	}

	
	@When("I search about home by type is {string}")
	public void i_search_about_home_by_type_is(String string) {
		System.out.println(" in when statment by type");
	      for(Home h:store.homeList) {
			  if(h.getType().equals(string)) {selected_homes.add(h);}}
	}

	
	
	
	@When("I search about home with {int} months")
	public void i_search_about_home_with_months(Integer int1) {
		System.out.println("in when statment by lease length  "+" "+int1.toString());
		  for(Home h:store.homeList) {
			  if(h.getLeaseLength()==int1.intValue()) {selected_homes.add(h);}
		  }
	}

	@When("I search about home with {string}")
	public void i_search_about_home_with(String string) {
		System.out.println("in when statment with amanities"+": "+string);
		String [] sp=string.split(",");
		ArrayList<Amenities> amenitiesO=new ArrayList<Amenities>();
		for(int j=0;j<sp.length;j++){
			amenitiesO.add(new Amenities(sp[j]));}
		
		            for(Home h:store.homeList) {
					if((h.getAmenities().containsAll(amenitiesO))) {
						selected_homes.add(h);}
					int flag=0;
					for(int k=0;k<h.getAmenities().size();k++) {
						System.out.println(h.getAmenities().get(k).Am);
					
						
					for(int j=0;j<amenitiesO.size();j++) {
						System.out.println(amenitiesO.get(j).Am);
						if (h.getAmenities().get(k).Am.equals(amenitiesO.get(j).Am)) {flag+=1;}}
				        if(flag==amenitiesO.size()) {selected_homes.add(h);}}}}
					
			
				
	@When("I search about home that the {string}")
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
          System.out.println(b.toString());
		  selected_homes.add(b);}}
		  	 
		  	
	  

	@Then("A list of homes that matches the specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_specification_should_be_returned_and_printed_on_the_console() {
		for (Home h:selected_homes) {
			System.out.println(h.toString());
			
		}
		selected_homes.clear();
		
	}

	


}


	
	
	
	
	
	
	
	


