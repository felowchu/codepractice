import java.util.EmptyStackException;
import java.util.Stack;

public class QueueWithTwoStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else if(!stack1.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else
            throw new EmptyStackException();
    }
}
