package home;

public class MaterialSpec implements GeneralSpec {

	private Material material;

	public MaterialSpec(Material material) {
		this.material = material;
		
	}

	public Material getMaterial() {
		return material;
	}

	public boolean isMatchingSpec(Home h) {
		return h.getMaterial().equals(getMaterial().getMaterialName());
	}

}
