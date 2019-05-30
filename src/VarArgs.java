public class VarArgs {
    static void vaTest(int ...n){
        System.out.println("Number of args are: "+ n.length + "Contents.");
        int sum = 0;
        for (int x:n){
            sum += x;
        }
        System.out.println(sum + " ");
    }

    static void test(boolean ...val){
        for(boolean v:val){
            System.out.println("Values are:" + v);
        }
    }

    public static void main(String[] args) {

        vaTest(1,2,3,4,5);
        test(true,false,true,true);
        vaTest();
    }
}
