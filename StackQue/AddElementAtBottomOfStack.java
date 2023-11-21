package StackQue;
import java.util.Stack;

public class AddElementAtBottomOfStack {
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        pushAtBottom(4,s);

        while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
        }
    }
}
