package home;


import java.util.ArrayList;

public class Home {
	private int price;
	private int area;
	private int num_of_bedrooms;
	private int num_of_bathrooms;
	private int lease_length;
	private HomeType type;
	private Pet pet;
	private Material material;
	private Placement placement;
	private  ArrayList<Amenities> amenities=new ArrayList<Amenities>();
	
	
	public Home(String type,String material,String place ,String pet,String  L,String price,String area,String nobed,String nobath,String leaselength ) {
	     this.type=new HomeType(type);
	     this.material=new Material(material);
	     this.placement=new Placement(place);
	     this.pet=new Pet(pet);	
		 String []LL=L.split(",");
		 for(int i=0;i<LL.length;i++) {this.amenities.add(new Amenities(LL[i]));}
	     this.price=Integer.parseInt(price);
		 this.area=Integer.parseInt(area);
		 this.num_of_bedrooms=Integer.parseInt(nobed);
		 this.num_of_bathrooms=Integer.parseInt(nobath);
		 this.lease_length=Integer.parseInt(leaselength);
	
	}
	public int getBedroom() {
	// TODO Auto-generated method stub
	return num_of_bedrooms;
}
	public int getPrice() {
		return price;
	}
	public int getArea() {
		return area;
	}
	public String getPlacement() {
		return placement.palce;
	}
	public String getMaterial() {
		return material.material;
	}
	
public String toString(){
	StringBuffer a=new StringBuffer();
	for(int n=0;n<amenities.size();n++) {
	a.append(", "+amenities.get(n).Am);
			}
			
	return "Home [type ="+type.type+" ,Material ="+material.material+" ,Placement ="+placement.palce+"  ,pet ="+pet.pet+"  Amenities ="+a.toString()+" ,Price ="+price+"  ,Area ="+area+"  NumOfBedrooms ="+num_of_bedrooms+"    NumOFBathrooms ="+num_of_bathrooms+"   Leaselingth ="+lease_length+" ]";
}
public int getBathroom() {
	// TODO Auto-generated method stub
	return num_of_bathrooms;
}
public String getPets() {
	// TODO Auto-generated method stub
	return pet.pet;
}
public String getType() {
	// TODO Auto-generated method stub
	return type.type;
}
public int getLeaseLength() {
	// TODO Auto-generated method stub
	return lease_length;
}
public ArrayList<Amenities> getAmenities() {
	// TODO Auto-generated method stub
	return this.amenities;
}



}
