public class Box {
    double width;
    double height;
    double depth;

    // Constructor with Object
    Box(Box ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    Box(double len) {
        this.width = this.height = this.depth = len;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }
}

class BoxWeight extends Box {

    double weight;

    BoxWeight(double w, double h, double d, double m) {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight(10,20,15,34.3);
        BoxWeight bw2 = new BoxWeight(2,3,4,0.076);

        double vol = bw.volume();
        System.out.println(vol);
        double vol1 = bw2.volume();
        System.out.println(vol1);
    }
}
