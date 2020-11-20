package home;




import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class SearchHome {


	private List<Home> selectedHomes;
	private List<Home> selectedHomes13;
	private HomeStore store;
	private String s1;
	private String s2;
	private StringBuilder checkOutput=new StringBuilder();

	private static WebEmailService webESerivce=new WebEmailService();
	
	
public static void setEmailservice(WebEmailService emailService) {
		
	setWebESerivce(emailService);
		
		
	}

	public SearchHome() {
		 List<Home> selHome= new ArrayList<>();
	setSelectedHomes(selHome);
	 List<Home> selHome13= new ArrayList<>();
	setSelectedHomes13(selHome13);
	setStore(new HomeStore());
		
	}
	
	public void storeHome() {
		this.store.addHome(s1, s2);
		
	}
	
	
	
	public void searchByPriceLess(Price price) {
		GeneralSpec spec=new BelowSpecPrice(price);
	   bySpec(spec);
	   
	   }

	
	public void searchByPlacement(Placement placement) {
		GeneralSpec spec= new PlacementSpec(placement);
		bySpec(spec);
		 
	}
	
	
	

	public void searchByMaterial(Material material) {
		GeneralSpec spec=new MaterialSpec(material);
		bySpec(spec);
		 
	}
	
	
	

	public void searchByPriceBetween(Price priceL,Price priceH ) {
		GeneralSpec spec=new PriceRangeSpec(priceL,priceH);
		bySpec(spec);
	}
	
	

	public void searchByAreaLess(Area area) {
		GeneralSpec spec=new BelowAreaSpec(area);
		bySpec(spec);
		 
	}
	
	
private void bySpec(GeneralSpec spec) {
	
		  for(Home h:store.getHomeList()) {
			  if(spec.isMatchingSpec(h)) {selectedHomes.add(h);}}
		
	}

	public void searchByAreaBetween(Area areaL,Area areaH ) {
		GeneralSpec spec=new AreaRangeSpec(areaL,areaH);
		bySpec(spec);
	}

	public void searchByBedrooms(Bedrooms bedrooms) {
		GeneralSpec spec=new BedRoomsSpec(bedrooms);
		bySpec(spec);
		}

	public void searchByBathrooms(Bathrooms bathrooms) {
		GeneralSpec spec=new BathRoomsSpec(bathrooms);
		bySpec(spec);
	}

	public void searchByType(HomeType type) {
		GeneralSpec spec=new TypeSpec(type);
		bySpec(spec);
	    webESerivce.sendEmail();

		}

	public void searchByPet(Pet petsObj) {
		GeneralSpec spec=new PetSpec(petsObj);
		bySpec(spec);}

	public void searchByLeaseLength(LeaseLength leaseLength) {
		GeneralSpec spec=new LeaseLengthSpec(leaseLength);
		bySpec(spec);}

	public void searchByAmenities(String amenities) {

		String [] sp=amenities.split(",");
		ArrayList<Amenities> amenitiesO=new ArrayList<>();
		AmenitiesSpec specAme=new AmenitiesSpec(amenitiesO);
		GeneralSpec spec=new AmenitiesSpec(amenitiesO);
		for(int j=0;j<sp.length;j++){
			amenitiesO.add(new Amenities(sp[j]));}
		
		            for(Home h:store.getHomeList()) {
					bySpec(spec);
					int flag=0;
					for(int k=0;k<h.getAmenities().size();k++) {
					
						
					for(int j=0;j<amenitiesO.size();j++) {
						if (specAme.checkForAllAmen(h, k, j)) {flag+=1;}}
				        if(specAme.isMatchingSpec(flag)) {selectedHomes.add(h);}}}}

	
	public void srearchByMultiFilters(String fs) {
		
		String[] filters=fs.split(",");
		MultiFiltersSpec specMulti=new MultiFiltersSpec(filters);
		for(int i=0;i<specMulti.getFs().length;i++) {  
			specMulti.checkFilters(this, i);
	 
		}
		for(int i=0;i<selectedHomes.size(); i++) {specMulti.setH1(selectedHomes.get(i));
			  for(int j=i+1;j<selectedHomes.size();j++) {
				  specMulti.setH2(selectedHomes.get(j));
			  if(specMulti.isMatchingSpec()) {
				selectedHomes13.add(specMulti.getH1());
				selectedHomes.remove(specMulti.getH2());}}}
	            selectedHomes.clear();
	          for(Home b:selectedHomes13 ) {
			  selectedHomes.add(b);}
	}

	public void printHomesByMatchingSpec(String string) {
		for (Home h:selectedHomes) {
			this.checkOutput.append(h.toString());
			}

		assertEquals(this.checkOutput.toString(),string);
		
		
		this.selectedHomes. clear();
		  
		}
	
	

	public List<Home> getSelectedHomes() {
		return selectedHomes;}

	public void setSelectedHomes(List<Home> selectedHomes) {
		this.selectedHomes = selectedHomes;}

	
	public void setSelectedHomes13(List<Home> selectedHomes13) {
		this.selectedHomes13 = selectedHomes13;
	}

	

	public void setStore(HomeStore store) {
		this.store = store;
	}

	

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public StringBuilder getCheckoutput() {
		return checkOutput;
	}

	


	public void setS2(String s2) {
		this.s2 = s2;
	}

	


	
	public static void setWebESerivce(WebEmailService webESerivce) {
		SearchHome.webESerivce = webESerivce;
	}
	
	
}
