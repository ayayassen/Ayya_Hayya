package home;

public class BelowAreaSpec implements GeneralSpec {

	private Area area;

	public BelowAreaSpec(Area area) {
		this.area = area;
		
	}

	public Area getArea() {
		return area;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getArea()<getArea().getArea();
	}

}
