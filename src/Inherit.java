public class Inherit {
    int i,j;
    void show() {
        System.out.println("i and j are "+ i +" " +j);
    }
}

class B extends Inherit {
    int k;
    void showk() {
        System.out.println("K :" +k);
    }

    void sum() {
        System.out.println(" Sum is :" +(i+j+k));
    }
}
class SimpleInhertance {
    public static void main(String[] args) {
        Inherit a = new Inherit();
        B b = new B();
        a.i = 10;
        a.j = 20;
        a.show();
        b.i = 10;
        b.j =20;
        b.k = 10;
        b.sum();
    }
}
