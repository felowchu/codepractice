public class ConvertTreeToList {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    TreeNode tail = null;
    public TreeNode convert(TreeNode pRootOfTree){
        if(pRootOfTree == null)
            return pRootOfTree;
        sort(pRootOfTree);
        TreeNode head = tail;
        while(head.left != null){
            head = head.left;
        }
        return head;
    }

    public void sort(TreeNode pRootOfTree){
        if(pRootOfTree.left != null){
           sort(pRootOfTree.left);
        }
        if(tail != null){
            tail.right = pRootOfTree;
            pRootOfTree.left = tail;
            tail = tail.right;
        }else {
            tail = pRootOfTree;
        }
        if(pRootOfTree.right != null){
            sort(pRootOfTree.right);
        }
    }
}
