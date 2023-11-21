package StackQue;
import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4); 
        reverseStack(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
