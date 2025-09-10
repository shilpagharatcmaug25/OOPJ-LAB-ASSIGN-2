abstract class Shape{

abstract void draw();

}

class Circle extends Shape{

int radius;

Circle(int radius) {
        this.radius = radius;
    }
@Override
    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}
class Rectangle extends Shape {
    int length, breadth;

    // Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement draw method
    @Override
    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}
public class ShapesArea {
    public static void main(String[] args) {
        // Sample Input
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 10);

        // Sample Output
        circle.draw();
        rectangle.draw();
    }
}