/*Problem 1: Counter for Cups 
Scenario: You are keeping track of how many cups of tea are prepared in your home. 
Requirements: 
1. Create a class TeaCup with instance variable: teaType (String). 
2. Create a static variable totalCups to count all cups created. 
3. Constructor should initialize teaType and increment totalCups. 
4. Create getter for teaType. 
5. Create a static method showTotalCups() to print total cups.*/

public class TeaCup{

private String teaType;
private static int totalCups=0;

public TeaCup (String teaType){
	this.teaType=teaType;
	totalCups++;
}

public String getTeaType(){
	return teaType;
}

public static void showTotalCups(){
	System.out.println("Total cups preapred:-" +totalCups);
}
public static void main(String args[]){
	
TeaCup cup1=new TeaCup("Masala Tea");
TeaCup cup2=new TeaCup("Green Tea");
TeaCup cup3=new TeaCup("Ginger Tea");

System.out.println("cup1:" +cup1.getTeaType());
System.out.println("cup2:" +cup2.getTeaType());
System.out.println("cup3:" +cup3.getTeaType());

TeaCup.showTotalCups();
}
}
