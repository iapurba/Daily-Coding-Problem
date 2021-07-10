import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DCP003SerializeBinaryTree {
  /*
   * Given the root to a binary tree, implement serialize(root), which serializes
   * the tree into a string, and deserialize(s), which deserializes the string
   * back into the tree.
   */

  public static String serialize(TreeNode root) {
    if (root == null) {
      return "null,";
    }

    String leftSerialize = serialize(root.left);
    String rightSerialize = serialize(root.right);

    return root.val + "," + leftSerialize + rightSerialize;
  }

  public static TreeNode deserialize(String s) {
    Queue<String> nodes = new LinkedList<>();
    nodes.addAll(Arrays.asList(s.split(",")));
    return deserializeHelper(nodes);
  }

  public static TreeNode deserializeHelper(Queue<String> nodes) {
    String valueForNode = nodes.poll();

    if (valueForNode.equals("null")) {
      return null;
    }

    TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode));
    newNode.left = deserializeHelper(nodes);
    newNode.right = deserializeHelper(nodes);

    return newNode;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    String s = serialize(root);
    TreeNode d = deserialize(s);

    System.out.println(s);

    // Node val from original tree
    int before = root.right.left.val;

    // Node val from deserilized tree
    int after = d.right.left.val;

    System.out.println(before == after);
  }

  // Tree representation
  //   1
  //  / \
  // 2   3
  //    / \
  //   4   5
}