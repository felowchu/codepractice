import java.util.ArrayDeque;
import java.util.ArrayList;

public class PrintBST {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }

    public ArrayList<Integer> printFromTopToBottom(TreeNode root){
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        queue.addLast(root);
        while(!queue.isEmpty()){
            TreeNode curNode = queue.pollFirst();
            list.add(curNode.val);
            if(curNode.left != null){
                queue.offerLast(curNode.left);
            }
            if(curNode.right != null){
                queue.offerLast(curNode.right);
            }
        }
        return list;
    }
}
