package home;

public class PriceRangeSpec implements GeneralSpec {

	private Price priceL;
	private Price priceH;

	public PriceRangeSpec(Price priceL, Price priceH) {
		this.priceL = priceL;
		this.priceH = priceH;
		
	}

	public Price getPriceL() {
		return priceL;
	}

	public Price getPriceH() {
		return priceH;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getPrice()>getPriceL().getPrice()&&h.getPrice()<getPriceH().getPrice();
	}

}
