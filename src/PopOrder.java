import java.util.Stack;

public class PopOrder {

    public boolean isPopOrder(int[] pushA, int[] popA){
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < pushA.length; i++){
            if(pushA[i] != popA[j]){
                stack.push(pushA[i]);
            }else {
                j++;
                while(!stack.isEmpty() && j < popA.length && popA[j] == stack.peek()){
                    j++;
                    stack.pop();
                }
            }
            if(j == popA.length){
                return true;
            }
        }
        return false;
    }
}
