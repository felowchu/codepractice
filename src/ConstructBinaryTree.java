public  class ConstructBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static void main(String[] args){
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        System.out.println(reConstructBinaryTree(pre, in).val);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in){
        return construct(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    public static TreeNode construct(int[] pre, int ps, int pe, int[] in, int is, int ie){
        if(ps == pe ){
            if(pre[ps] == in[is])
                return new TreeNode(pre[ps]);
             else
                throw new IllegalArgumentException("输入参数不合法");
        }

        if((pe - ps) != (ie - is))
            throw new IllegalArgumentException("输入参数不合法");

        int value = pre[ps];
        int index = is;
        while(in[index] != value && index <= ie) index++;
        if(index > ie) throw new IllegalArgumentException("输入参数不合法");
        int leflen = index - is;
        TreeNode root = new TreeNode(value);
        if(leflen > 0)
            root.left = construct(pre, ps+1, ps+leflen, in, is, index-1);
        if(ie - is - leflen > 0)
            root.right = construct(pre, ps+leflen+1, pe, in, index+1, ie);
        return root;
    }
}
