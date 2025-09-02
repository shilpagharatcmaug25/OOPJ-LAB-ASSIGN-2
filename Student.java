/*Problem 5: Student Marks Calculator 
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in 
the class. 
Requirements: 
1. Create a class Student with instance variables: name (String), marks (int). 
2. Create static variable totalStudents to count total number of students. 
3. Constructor to initialize student details and increment totalStudents. 
4. Getter and Setter for marks. 
5. Method isPassed() returns true if marks >= 35, false otherwise. 
6. Static method showTotalStudents() prints total students. 
7. In main class, create 3 students, check if they passed, and show total students. */

public class Student{
	
	private String name;
	private int marks;
	
	private static int totalStudents=0;
	
public Student (String name, int marks){
	this.name=name;
	this.marks=marks;
	
	totalStudents++;
}
public int getMarks(){
	return marks;
}

public void setMarks(int marks){
	this.marks=marks;
}

public boolean isPassed(){
	return marks>=35;
}
public static void showTotalStudents(){
	System.out.println("Total number of students are: " +totalStudents);
}
public void displayResult() {
   System.out.println(name + " has " + (isPassed() ? "passed" : "failed") + " with " + marks + " marks.");
    }

public static void main(String args[]){
	Student s1 = new Student("Rahul",78);
	Student s2 = new Student("Pooja",30);
	Student s3 = new Student("Amit",85);	
	
	s1.displayResult();
	s2.displayResult();
	s3.displayResult();
	
	Student.showTotalStudents();
	
}
}

	
	

