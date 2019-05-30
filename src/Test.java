class Test {
    /**
     * This Program illustrates how to pass
     * Object as an argument and compare different instances of one class
     */
    int a,b;

    Test(int a, int b){
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test that){
        if(that.a == this.a && this.b == that.b) return true;
        else return false;
    }
}

class TestObj {
    public static void main(String[] args) {
        Test test1 = new Test(5,6);
        Test test2 = new Test(5,6);
        Test test3 = new Test(-1,-1);

        System.out.println("test == test2 : " + test1.equalTo(test2));
        System.out.println("test == test3 : " + test1.equalTo(test3));
    }
}
