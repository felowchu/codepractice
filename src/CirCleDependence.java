import java.util.Scanner;

public class CirCleDependence {
    public static class ListNode{
        String str;
        ListNode next = null;
        ListNode(String  str){
            this.str = str;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()){
                ListNode head = null;
                ListNode cur = null;
                while(sc.hasNextLine()) {
                    String node = sc.nextLine();
                    node = node.trim();
                    String val1 = node.substring(1, node.indexOf(","));
                    String val2 = node.substring(node.indexOf(" ")+1, node.lastIndexOf("}"));
                    if (head != null) {
                        ListNode temp1 = new ListNode(val1);
                        ListNode temp2 = new ListNode(val2);
                        cur.next = temp1;
                        temp1.next = temp2;
                        cur = temp2;
                    } else {
                        head = new ListNode(val1);
                        cur = head;
                        ListNode next = new ListNode(val2);
                        cur.next = next;
                        cur = cur.next;
                    }
                    if(node.charAt(node.length() - 1) != ','){
                        break;
                    }
                }
                ListNode entry = listEntry(head);

                ListNode curNode = head;

                while(curNode != null && curNode != entry){
                    if(curNode.next == null){
                        System.out.println("{"+curNode.str+", false}");
                        System.exit(1);
                    }
                    System.out.println("{"+curNode.str+", false},");
                    curNode = curNode.next;
                }
                while(curNode.next != entry){
                    System.out.println("{"+curNode.str+", true},");
                    curNode = curNode.next;
                }
                System.out.println("{"+curNode.str+", true}");
            }
    }

    public static ListNode listEntry(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode p1 = pHead;
        ListNode p2= pHead;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                p2 = pHead;
                while (p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if(p1 == p2)
                    return p1;
            }
        }
        return null;
    }
}
