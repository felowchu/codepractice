public class CopyRandomList {
    public class RandomListNode{
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label){
            this.label = label;
        }
    }

    public RandomListNode clone(RandomListNode pHead){
        //复制next
        RandomListNode curNode = pHead;
        while (curNode != null){
            RandomListNode copNode = new RandomListNode(curNode.label);
            copNode.next = curNode.next;
            curNode.next = copNode;
            curNode = copNode.next;
        }
        //复制random
        curNode = pHead;
        while(curNode != null){
            if(curNode.random != null){
                curNode.next.random = curNode.random.next;
            }
            curNode = curNode.next.next;
        }
        //查分链表
        curNode = pHead;
        RandomListNode copyHead = new RandomListNode(-1);
        RandomListNode copy = copyHead;
        while(curNode != null){
            copy.next = curNode.next;
            copy = copy.next;
            curNode.next = copy.next;
            curNode = copy.next;
        }
        copy.next = null;
        return copyHead.next;
    }
}
