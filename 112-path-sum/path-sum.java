class Solution {
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int t) {
        helper(root, t);
        return ans;
    }
    private void helper(TreeNode root, int t){
        if(root == null) return;
        if(t == root.val && root.left == null && root.right == null) ans = true;
        helper(root.left, t-root.val);
        helper(root.right, t-root.val);
    }
}