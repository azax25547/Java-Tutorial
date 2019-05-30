public class Test2 {
    /**
     * This program illustrates how to return an object
     */
    int a;

    Test2(int i){
        this.a = i;
    }

    Test2 incByTen() {
        Test2 temp = new Test2(this.a + 10);
        return temp;
    }
}

class TestDemo {
    public static void main(String[] args) {
        Test2 obj = new Test2(10);
        Test2 obj2;

        obj2 = obj.incByTen();
        System.out.println(obj.a);
        System.out.println(obj2.a);
    }
}