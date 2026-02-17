class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        StringBuilder subPath = new StringBuilder();
        binaryPaths(root, path, subPath);
        return path;
    }
    public void binaryPaths(TreeNode root,List<String> path,StringBuilder subPath) {
        int len = subPath.length();
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            subPath.append(root.val);
            path.add(new String(subPath));
            subPath.setLength(len);
            return;
        }
        subPath.append(root.val).append("->");
        binaryPaths(root.left, path, subPath);
        binaryPaths(root.right, path, subPath);
        subPath.setLength(len);
    }
}