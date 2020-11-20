package home;


import java.util.ArrayList;
import java.util.List;

public class Home {
	private int price;
	private int area;
	private int numofBedrooms;
	private int numofBathrooms;
	private int leaseLength;
	private HomeType type;
	private Pet pet;
	private Material material;
	private Placement placement;
	private  ArrayList<Amenities> amenities=new ArrayList<>();
	

	public Home(String type,String material,String place ,String pet,String listString) {
	     this.type=new HomeType(type);
	     this.material=new Material(material);
	     this.placement=new Placement(place);
	     this.pet=new Pet(pet);	
		 String []lLString=listString.split(",");
		 for(int i=0;i<lLString.length;i++) {this.amenities.add(new Amenities(lLString[i]));}
	     
	}
	
	
	public void completeConst(String price,String area,String nobed,String nobath,String leaselength ) {
		
		this.price=Integer.parseInt(price);
		 this.area=Integer.parseInt(area);
		 this.numofBedrooms=Integer.parseInt(nobed);
		 this.numofBathrooms=Integer.parseInt(nobath);
		 this.leaseLength=Integer.parseInt(leaselength);
	
		
		
	}
	public int getBedroom() {

	return numofBedrooms;
}
	public int getPrice() {
		return price;
	}
	public int getArea() {
		return area;
	}
	public String getPlacement() {
		return placement.getPalce();
	}
	public String getMaterial() {
		return material.getMaterialName();
	}
	
public String toString(){
	StringBuilder a=new StringBuilder();
	for(int n=0;n<amenities.size();n++) {
	a.append(", "+amenities.get(n).getAmenitiesString());
			}
			
	return "Home [type ="+type.getType()+" ,Material ="+material.getMaterialName()+" ,Placement ="+placement.getPalce()+"  ,pet ="+pet.getpetValue()+"  Amenities ="+a.toString()+" ,Price ="+price+"  ,Area ="+area+"  NumOfBedrooms ="+numofBedrooms+"    NumOFBathrooms ="+numofBathrooms+"   LeaseLingth ="+leaseLength+" ]";
}
public int getBathroom() {
	
	return numofBathrooms;
}
public String getPets() {
	
	return pet.getpetValue();
}
public String getType() {
	
	return type.getType();
}
public int getLeaseLength() {
	
	return leaseLength;
}
public List<Amenities> getAmenities() {

	return this.amenities;
}



}
