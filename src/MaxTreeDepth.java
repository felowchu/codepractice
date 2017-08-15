public class MaxTreeDepth {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }

    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int dLeft = TreeDepth(root.left);
        int dRight = TreeDepth(root.right);

        return 1 + (dLeft > dRight ? dLeft : dRight);
    }
}
