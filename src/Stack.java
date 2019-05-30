public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item){
        if(this.tos == 9){
            System.out.println("Stack is full");
        }else{
            this.stck[++this.tos] = item;
        }
    }

    void pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
        }else{
            System.out.println(this.stck[tos--]);
        }
    }

}

class StackTest {
    public static void main(String[] args) {
        Stack stck1 = new Stack();

        for(int i = 0; i < 10; i++){
            stck1.push(i);
        }



        stck1.pop();

//        for(int i = 0; i < 10; i++)
//            System.out.println(stck1.stck[i]);
    }
}
