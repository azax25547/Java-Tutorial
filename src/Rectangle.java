class Rectangle {
    double height;
    double width;

    double area() {
        return height * width;
    }
}

class RectangleDemo {
    public static void main(String args[]) {
        Rectangle rec = new Rectangle();

        double area;
        rec.height = 20;
        rec.width = 10;
        area = rec.area();

        System.out.println("Area is "+ area);
    }

}
