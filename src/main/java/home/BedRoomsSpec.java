package home;

public class BedRoomsSpec implements GeneralSpec {

	private Bedrooms bedrooms;

	public BedRoomsSpec(Bedrooms bedrooms) {
		this.bedrooms = bedrooms;
		
	}

	public Bedrooms getBedrooms() {
		return bedrooms;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getBedroom()==getBedrooms().getBedRoomsNum();
	}

}
