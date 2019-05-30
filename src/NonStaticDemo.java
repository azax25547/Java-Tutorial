public class NonStaticDemo {
    {
        System.out.println("Its a non static method");
    }

    NonStaticDemo() {
        System.out.println("Constructor stats its work");
    }

    public static void main(String[] args) {
        System.out.println("Its main method");
        NonStaticDemo a = new NonStaticDemo();
        NonStaticDemo b = new NonStaticDemo();

    }
    {
        System.out.println("Its another non static method");
    }
}
