package home;

import java.util.ArrayList;
import java.util.List;

public class HomeStore {

private List<Home> homeList=new ArrayList<>();


public void addHome(String s1,String s2) {
String st1=s1;
String st2=s2;
String[] words=st1.split("_");
String[] numbers=st2.split("_");

Home h=new Home(words[0],words[1],words[2],words[3],words[4]);
h.completeConst(numbers[0],numbers[1],numbers[2],numbers[3],numbers[4]);

getHomeList().add(h)	;
}






public List<Home> getHomeList() {
	return  homeList;
}






public void setHomeList(List<Home> homeList) {
	this.homeList = homeList;
}





}
