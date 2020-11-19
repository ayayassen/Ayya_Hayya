package home;


public class HomeType {
private String type;
public HomeType(String s) {
	if(s.equals("APARTMENT")|| s.equals("HOUSE")) {
		setType(s);
	}

}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
}
