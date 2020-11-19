package home;



public class Material {
private String materialName;
public Material(String m) {
	if(m.equals("WOOD")|| m.equals("STONE")||m.equals("BRICK")) {
		
	this.setMaterialName(m);
}

}
public String getMaterialName() {
	return materialName;
}
public void setMaterialName(String materialName) {
	this.materialName = materialName;
}}
