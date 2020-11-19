package home;



public class Amenities {
	private String[] amenitiesList={"AIRCOBDITIONING", "BALCONY", "ELEVATOR", "FIREPLACE", "GARAGEPARKING", "SWIMMINGPOOL"};
	private String amenitiesString;
	public Amenities(String s) {
		for(int i=0;i<5;i++) {
			if(amenitiesList[i].equals(s)) {setAmenitiesString(s);}
		}
	}
	public String getAmenitiesString() {
		return amenitiesString;
	}
	public void setAmenitiesString(String amenitiesSstring) {
		amenitiesString = amenitiesSstring;
	}

}
