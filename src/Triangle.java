/**
 * Example of Parameterized Constructor
 */

public class Triangle {
    double firstSide;
    double secondSide;
    double thirdSide;

    Triangle(double first, double sec, double third) {
        firstSide = first;
        secondSide = sec;
        thirdSide = third;
    }

    double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}

class TriangleDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,20,30);
        System.out.print("Perimeter of the circle is "+ triangle.perimeter());
    }
}
