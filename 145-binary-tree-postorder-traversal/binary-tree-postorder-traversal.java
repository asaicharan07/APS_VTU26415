class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        postorder(root, res);
        return res;
    }

    static void postorder(TreeNode root, List<Integer> res){
        if(root==null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}