package home;


public class HomeType {
public String type;
public HomeType(String s) {
	if(s.equals("APARTMENT")|| s.equals("HOUSE")) {
		type=s;
	}

}
}
