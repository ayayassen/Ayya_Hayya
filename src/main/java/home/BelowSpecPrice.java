package home;

public class BelowSpecPrice implements GeneralSpec {

	private Price price;

	public Price getPrice() {
		return price;
	}

	

	public BelowSpecPrice(Price price) {
		this.price = price;
		
	}
 
public boolean isMatchingSpec(Home h) {
		return h.getPrice()<getPrice().getPrice();
	}
}
