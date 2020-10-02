package home;


import java.util.ArrayList;

public class HomeStore {
public String st1;
public String st2;
public ArrayList<Home> homeList=new ArrayList<Home>();
public String[] numbers;
public String[] words;






public void addHome(String s1,String s2) {
this.st1=s1;
this.st2=s2;
words=st1.split("_");
numbers=st2.split("_");

Home h=new Home(words[0],words[1],words[2],words[3],words[4],numbers[0],numbers[1],numbers[2],numbers[3],numbers[4]);
homeList.add(h)	;
}





}
