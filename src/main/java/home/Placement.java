package home;


public class Placement {
private String palce;
public Placement(String place) {
	if(place.equals("CITY")|| place.equals("VILLAGE")) {
		
	this.setPalce(place);
	
}
}
public String getPalce() {
	return palce;
}
public void setPalce(String palce) {
	this.palce = palce;
}}
