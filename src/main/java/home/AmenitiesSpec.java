package home;


import java.util.List;

public class AmenitiesSpec implements GeneralSpec {

	private List<Amenities> amenitiesO;

	public AmenitiesSpec(List <Amenities>  amenitiesO) {
		this.amenitiesO = amenitiesO;
		
	}

	public List <Amenities> getAmenitiesO() {
		return amenitiesO;
	}

	public boolean isMatchingSpec(int flag) {
		return flag==getAmenitiesO().size();
	}

 boolean checkForAllAmen(Home h, int k, int j) {
		return h.getAmenities().get(k).getAmenitiesString().equals(((Amenities) getAmenitiesO().get(j)).getAmenitiesString());
	}

public boolean isMatchingSpec(Home h) {
		return h.getAmenities().containsAll(getAmenitiesO());
	}

	
}
