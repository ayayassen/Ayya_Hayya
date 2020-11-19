package home;

public class PetSpec implements GeneralSpec {

	private Pet petsObj;

	public PetSpec(Pet petsObj) {
		this.petsObj = petsObj;
		
	}

	public Pet getPetsObj() {
		return petsObj;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getPets().equals(getPetsObj().getpetValue());
	}

}
