/*Problem 9: School Fee System 
Scenario: 
A school wants to initialize the tuition fee for all students once at program start. Each student has name 
and class. Use static blocks to set the fee and setters/getters to update/access student information. 
Tasks: 
1. Create a Student class. 
2. Use a static block to initialize tuitionFee to 30000. 
3. Create instance variables: name (String) and className (String). 
4. Create setters and getters for name and className. 
5. Print student details including tuition fee. 
Input Example: 
Student1: Name="Anjali", Class="10th" 
Student2: Name="Vikram", Class="12th"*/

class Student1{

private String name;
private String className;
private static int tuitionFee=30000;

public Student1(String name,String className){
	this.name=name;
	this.className=className;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public String getClassName(){
return className;
}

public void setClassName(String className){
this.className=className;}

public int getTutionfee(){
	return tuitionFee;
}

public void Printstudentdetails(){
	System.out.println("Name:" +name);
	System.out.println("Class:" +className);
	System.out.println("-------------------");
	
}
public static void main(String args[]){
	Student1 s1=new Student1("Anjali" ,"12th");
	s1.Printstudentdetails();
	
	
	Student1 s2=new Student1("Vikram" ,"10th");
	s2.Printstudentdetails();
	
}
}

