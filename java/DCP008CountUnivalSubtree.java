public class DCP008CountUnivalSubtree {
  /*
   * A unival tree (which stands for "universal value") is a tree where all nodes
   * under it have the same value.
   * 
   * Given the root to a binary tree, count the number of unival subtrees.
   */

  public static int countUnivalSubtree(TreeNode root) {
    int[] count = countUnivalSubtreeHelper(root);
    return count[0];
  }

  public static int[] countUnivalSubtreeHelper(TreeNode root) {
    /*
     * This method keeps track of unival subtree count and value as we percolate
     * back up. This runs in O(n) time because this function evaluate each node at
     * once as it started as the leave nodes at the tree.
     * 
     * Return an array of length 2, where the first value is unival subtree count
     * and second value is if node itself unival or not. We are returning int value
     * 0:false and 1:true. e.g. [2, 1] => subtree count = 0 and unival = true.
     */

    if (root == null) {
      int[] result = { 0, 1 };
      return result;
    }
    int[] leftCount = countUnivalSubtreeHelper(root.left);
    int[] rightCount = countUnivalSubtreeHelper(root.right);

    int totalCount = leftCount[0] + rightCount[0];
    int[] result = { totalCount, 0 };

    if (leftCount[1] == 1 && rightCount[1] == 1) {
      if (root.left != null && root.left.val != root.val) {
        return result;
      }
      if (root.right != null && root.right.val != root.val) {
        return result;
      }
      result[0] = totalCount + 1;
      result[1] = 1;
      return result;
    }
    return result;
  }

  public static boolean isUnival(TreeNode root) {
    return isUnivalHelper(root, root.val);
  }

  public static boolean isUnivalHelper(TreeNode root, int value) {
    if (root == null) {
      return true;
    }
    if (root.val == value) {
      return isUnivalHelper(root.left, value) && isUnivalHelper(root.right, value);
    }
    return false;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(1);
    root.right.right = new TreeNode(0);
    root.right.left.left = new TreeNode(1);
    root.right.left.right = new TreeNode(1);

    System.out.println(countUnivalSubtree(root));
  }
}
