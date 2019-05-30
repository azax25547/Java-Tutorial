public class MethodOverload {
    void show(){
        System.out.println("No Params");
    }

    void show(int a){
        System.out.println("a : "+ a);
    }

    void show(int a, int b){
        System.out.println("a & b"+ a + " " + b);
    }

    double show(double a){
        return  a*a;
    }

}

class Demo {
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        double result;
        mo.show();
        mo.show(12);
        mo.show(11,23);
        result = mo.show(23.4);
        System.out.println(result);
    }
}