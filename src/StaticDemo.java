public class StaticDemo {
    // static block of code
    static {
        System.out.println("This is a static block");
    }

    private static void hello(){
        System.out.println("This is a static method");
    }

    private void hell() {
        System.out.println("This is anon static method");
    }

    public static void main(String[] args) {
        // Declaration of Static methods which belongs to the class
        StaticDemo.hello();
//        new StaticDemo().hello();
        hello();
        // Declaration of non-static method which belongs to object
        new StaticDemo().hell();
    }
}
