package home;

import java.util.List;

public  class MultiFiltersSpec {

	private String[] filters;
	List<Home> homeList;
	private Home h1;
	private Home h2;
	

	

	public MultiFiltersSpec(String[] filters) {
		this.filters = filters;
		
	}

	public String[] getFs() {
		return filters;
	}

	boolean isPriceFilter(int i) {
		return getFs()[i].startsWith("price less than");
	}

	boolean isPriceRangeFilter(int i) {
		return getFs()[i].startsWith("price between");
	}

	boolean isAreaFilter(int i) {
		return getFs()[i].startsWith("area less than");
	}

	boolean isAreaRangeFilter(int i) {
		return getFs()[i].startsWith("area between");
	}

	boolean isBathroomsFilter(int i) {
		return getFs()[i].startsWith("number of bathrooms is ");
	}

	boolean isBedRoomsFilter(int i) {
		return getFs()[i].startsWith("number of bedrooms is ");
	}

	boolean isPalcementFilter(int i) {
		return getFs()[i].startsWith("palcement is ");
	}

	boolean isMaterialFilter(int i) {
		return getFs()[i].startsWith("material is ");
	}

	boolean isTypeFilter(int i) {
		return getFs()[i].startsWith("type is ");
	}

	boolean isLeaseLengthFilter(int i) {
		return getFs()[i].startsWith("lease length is ");
	}

	boolean isPetsFilter(int i) {
		return getFs()[i].startsWith("allowing pets is ");
	}

	boolean isAmenitiesFilter(int i) {
		return getFs()[i].startsWith("amenities is ");
	}

	void checkFilters(SearchHome searchHome, int i) {
		String [] arr= getFs()[i].split(" ");
		   if(isPriceFilter(i)) {searchHome.searchByPriceLess(new Price(Integer.parseInt(arr[3])));}
		    if(isPriceRangeFilter(i)) {searchHome.searchByPriceBetween(new Price(Integer.parseInt(arr[2])),new Price(Integer.parseInt(arr[4])))  ;}
		    if(isAreaFilter(i)) {searchHome.searchByAreaLess(new Area(Integer.parseInt(arr[3])));}
		    if(isAreaRangeFilter(i)) {searchHome.searchByAreaBetween(new Area(Integer.parseInt(arr[2])),new Area(Integer.parseInt(arr[4]))); }
		    if(isBathroomsFilter(i)) {searchHome.searchByBathrooms(new Bathrooms(Integer.parseInt(arr[4])));}
		   if(isBedRoomsFilter(i)) {searchHome.searchByBedrooms(new Bedrooms(Integer.parseInt(arr[4])));}
		    if(isPalcementFilter(i)) {searchHome.searchByPlacement(new Placement(arr[2]));}
		   if(isMaterialFilter(i)) {searchHome.searchByMaterial(new Material(arr[2])); }
		   if(isTypeFilter(i)) {searchHome.searchByType(new HomeType(arr[2]));}
		   if(isLeaseLengthFilter(i)) {searchHome.searchByLeaseLength(new LeaseLength(Integer.parseInt(arr[3]))); }
		   if(isPetsFilter(i)) {searchHome.searchByPet(new Pet(arr[3])); }
		    if(isAmenitiesFilter(i)) {searchHome.searchByAmenities(arr[2]);  }
		    homeList=searchHome.getSelectedHomes();
	}

	
	public Home getH1() {
		return h1;
	}

	public void setH1(Home h1) {
		this.h1 = h1;
	}

	
	public Home getH2() {
		return h2;
	}

	public void setH2(Home h2) {
		this.h2 = h2;
	}

	public boolean isMatchingSpec() {
		return getH1().equals(getH2());
	}


}
