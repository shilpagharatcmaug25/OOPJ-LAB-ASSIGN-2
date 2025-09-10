public class ShapeArea{

public void calculateArea(int side){

int area=side*side;

System.out.println("Area of Square:" + area);

}
public void calculateArea(int length, int breadth){

int area=length*breadth;
System.out.println("Area of Rectangle :" + area);
}
public void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }
	
public static void main(String args[]){

ShapeArea shape=new ShapeArea();

shape.calculateArea(5);           
shape.calculateArea(4,6);        
shape.calculateArea(3.1);      
    }
}