import java.util.ArrayList;

public class AllPathWithSum {
    public class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target){
       ArrayList<Integer> path = new ArrayList<>();
        if(root == null)
            return result;
        find(root, target, path);
        return result;
    }

    public void find(TreeNode root, int target, ArrayList<Integer> path){
        path.add(root.val);
        if(root.left != null){
            find(root.left, target-root.val, path);
        }
        if(root.right != null){
            find(root.right, target-root.val, path);
        }
        if(target == root.val && root.left == null && root.right == null){
            result.add(new ArrayList<>(path));
        }
        path.remove(path.size()-1);
    }
}
