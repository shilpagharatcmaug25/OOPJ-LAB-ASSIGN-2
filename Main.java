// Superclass
abstract class Shape {
    abstract double area(); // Abstract method
}

// Subclass for Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.printf("Circle Area = %.2f%n", circle.area()); // formatted to 2 decimal places
    }
}