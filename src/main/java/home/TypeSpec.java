package home;

public class TypeSpec implements GeneralSpec{

	private HomeType type;

	public TypeSpec(HomeType type) {
		this.type = type;
		
	}

	public HomeType getType() {
		return type;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getType().equals(getType().getType());
	
	}

	
	
}
