public class KthToTail {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode find(ListNode head, int k){
        if(k <= 0) return null;
        ListNode preNode = head;
        for(int i = 1; i < k; i++){
            if(preNode != null){
                preNode = preNode.next;
            }else{
                return null;
            }
        }
        if(preNode == null) return null;
        ListNode curNode = head;
        while(preNode.next != null){
            curNode = curNode.next;
            preNode = preNode.next;
        }
        return curNode;
    }
}
