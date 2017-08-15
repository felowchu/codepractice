public class IsBST {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }

    public boolean isBalanced(TreeNode root){
        int[] depth = new int[1];
        return isBalanced0(root, depth);
    }

    public boolean isBalanced0(TreeNode root, int[] depth){
        if(root == null){
            depth[0] = 0;
            return true;
        }
        int[] dLeft = new int[1];
        int[] dRight = new int[1];
        if(isBalanced0(root.left, dLeft) && isBalanced0(root.right, dRight)){
            int diff = dLeft[0] - dRight[0];
            if(diff <= 1 && diff >= -1){
                depth[0] = 1 + (dLeft[0] > dRight[0] ? dLeft[0] : dRight[0]);
                return true;
            }
        }
        return false;
    }
}
