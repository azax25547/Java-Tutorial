public class Static {
       private static int a = 10;
       private static int b;

    private static void meth(int x){
        System.out.println("x = "+ x);
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    static {
        b = a * 4;
    }

    public static void main(String[] args) {
        // accessing the static method directly
        meth(42);
    }
}
