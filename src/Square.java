/**
 * Program for parameterized method to class
 */
public class Square {
    double sides;

    double area() {
        return sides * sides;
    }
    void setValue(double side) {
        sides = side;
    }
}

class SquareDemo {
    public static void main(String[] args) {
        Square sq1 = new Square();
        Square sq2 = new Square();

        double area;

        sq1.setValue(10);
        sq2.setValue(50);

        area = sq1.area();
        System.out.println("Area is "+ area);
        area = sq2.area();
        System.out.println("Area is "+ area);
    }
}
