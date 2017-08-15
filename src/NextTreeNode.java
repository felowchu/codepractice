import java.util.PriorityQueue;

public class NextTreeNode {
    public class TreeLinkNode{
        int val ;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;
        TreeLinkNode(int val){
            this.val = val;
        }
    }

    public TreeLinkNode getNext(TreeLinkNode pNode){
        if(pNode == null)
            return null;

        TreeLinkNode pNext = null;
        if(pNode.right != null){
            pNext = pNode.right;
            while(pNext.left != null){
                pNext = pNext.left;
            }
        }else if(pNode.next != null){
            TreeLinkNode curNode = pNode;
            TreeLinkNode parentNode = pNode.next;
            while(parentNode != null && parentNode.right == curNode){
                curNode = parentNode;
                parentNode = parentNode.next;
            }
            pNext = parentNode;
        }
        return pNext;
    }
}
