/**
 * Example of Constructor
 */
public class Circle {
    double radius;
    final double PI = 3.14;

    // Constructor
    Circle() {
        System.out.println("Constructing.........");
        radius = 5;
    }

    double area() {
        return PI * radius * radius;
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle crc = new Circle();
        double area = crc.area();
        System.out.println("Area of the circle is "+ area);
    }
}

