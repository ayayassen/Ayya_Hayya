package home;

public class PlacementSpec implements GeneralSpec {

	private Placement placement;

	public PlacementSpec(Placement placement) {
		this.placement = placement;
		
	}

	public Placement getPlacement() {
		return placement;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getPlacement().equals(getPlacement().getPalce());
	}

}
