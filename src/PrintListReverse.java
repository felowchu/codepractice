import java.util.ArrayList;
import java.util.Stack;

public class PrintListReverse {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> result = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();

        ListNode head = listNode;
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop().val);
        }
        return result;
    }
}
