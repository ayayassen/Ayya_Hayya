package home;

public class BathRoomsSpec implements GeneralSpec {

	private Bathrooms bathrooms;

	public BathRoomsSpec(Bathrooms bathrooms) {
		this.bathrooms = bathrooms;
		
	}

	public Bathrooms getBathrooms() {
		return bathrooms;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getBathroom()==getBathrooms().getBathRoomsNum();
	}

}
