class Solution {
  private int diam = 0;

  public int dfs(TreeNode node) {
      if (node == null) return 0;

      int left = dfs(node.left);
      int right = dfs(node.right);
      diam = Math.max(diam, left + right);

      return 1 + Math.max(left, right);
  }

  public int diameterOfBinaryTree(TreeNode root) {
      dfs(root);

      return diam;
  }
}
