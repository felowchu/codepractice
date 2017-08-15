public class ReverseList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverse(ListNode head){
        if(head == null) return head;
        ListNode preNode = null;
        ListNode curNode = head;
        while(curNode.next != null){
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        curNode.next = preNode;
        return curNode;
    }
}
