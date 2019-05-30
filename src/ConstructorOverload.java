public class ConstructorOverload {
    double width;
    double height;

    ConstructorOverload() {
       this.width = 20;
        this.height =10;
    }

    ConstructorOverload(double w, double h){
        this.width = w;
        this.height = h;
    }

    ConstructorOverload(double var){
        this.width = this.height = var;
    }

    double area(){
        return width * height;
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        ConstructorOverload co1 = new ConstructorOverload();
        ConstructorOverload co2 = new ConstructorOverload(10,20);
        ConstructorOverload co3 = new ConstructorOverload(10);
        System.out.println("The area is " + co1.area());
        System.out.println("The area is " + co2.area());
        System.out.println("The area is " + co3.area());
    }
}


