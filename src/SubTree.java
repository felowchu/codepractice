public class SubTree {
    public class TreeNode{
        int val = 0;
        TreeNode left =null;
        TreeNode right = null;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public boolean hasSubTree(TreeNode root1, TreeNode root2){
        if(root2 == null)
            return false;
        return isSubTree(root1, root2);
    }

    public boolean isSubTree(TreeNode root1, TreeNode root2){
        if(root1 == null) return false;
        if(root1.val != root2.val || !isEqual(root1, root2)){
            return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
        }
        return true;
    }

    public boolean isEqual(TreeNode root1, TreeNode root2){
        if(root2 == null) return true;
        if(root1 == null) return false;
        if(root1.val != root2.val) return false;
        return isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
    }
}
