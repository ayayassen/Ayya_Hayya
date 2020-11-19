package home;

public class AreaRangeSpec implements GeneralSpec {

	private Area areaL;
	public Area getAreaL() {
		return areaL;
	}

	public Area getAreaH() {
		return areaH;
	}

	 public boolean isMatchingSpec(Home h) {
		return (h.getArea()>getAreaL().getArea())&&(h.getArea()<getAreaH().getArea());
	}

	private Area areaH;

	public AreaRangeSpec(Area areaL, Area areaH) {
		this.areaL = areaL;
		this.areaH = areaH;
		
	}

}
