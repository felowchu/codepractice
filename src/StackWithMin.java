import java.util.Stack;

public class StackWithMin {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node){
        stack.push(node);
        if(min.isEmpty() || node < min.peek()){
            min.push(node);
        }else{
            min.push(min.peek());
        }
    }

    public void pop(){
        stack.pop();
        min.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        return min.peek();
    }
}
