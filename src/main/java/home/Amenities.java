package home;


import java.util.ArrayList;
public class Amenities {
	public String[] A={"AIRCOBDITIONING", "BALCONY", "ELEVATOR", "FIREPLACE", "GARAGEPARKING", "SWIMMINGPOOL"};
	String Am;
	public Amenities(String s) {
		for(int i=0;i<5;i++) {
			if(A[i].equals(s)) {Am=s;}
		}
	}

}
