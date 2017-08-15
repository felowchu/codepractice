public class MergeList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode merge(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = new ListNode(-1);
        ListNode curNode = head;
        if(list1.val < list2.val){
           curNode.next = list1;
            list1 = list1.next;
            curNode = curNode.next;
        }else{
            curNode.next = list2;
            list2 = list2.next;
            curNode = curNode.next;
        }
        curNode.next = merge(list1, list2);
        return head.next;
    }
}
