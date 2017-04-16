/**
 * Created by vallep on 4/16/2017.
 *
 */

class Stack {
    private int stck[] = new int[10];
    private int tos;

    // initialize top of stack using the below constructor
    Stack() {
        tos = -1;
    }

    // push an item onto the stack
    void push(int item) {
        if(tos == 9)
            System.out.println("Stack is full");
        else {
            System.out.println("Adding to Stack[" + tos + "]");
            stck[++tos] = item;
        }
    }

    // pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack overflow");
            return 0;
        }
        else {
            System.out.println("Removing from Stack[" + tos + "]");
            return stck[tos--];
        }
    }
}

public class StackTest {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers onto the stack
        for(int i=0; i < 10; i++) mystack1.push(i);
        for(int i=10; i < 20; i++) mystack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1: ");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}