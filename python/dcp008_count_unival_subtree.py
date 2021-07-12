#!/usr/bin/env python3

"""
A unival tree (which stands for "universal value") is a tree where all 
nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1

"""


class TreeNode:
    def __init__(self, val) -> None:
        self.val = val
        self.left = self.right = None


def count_unival_subtree(root: TreeNode) -> int:
    count, is_unival = count_unival_subtree_helper(root)
    return count


# Helper functions
def count_unival_subtree_helper(root: TreeNode):
    if(root is None):
        return 0, True

    left_count, is_left_unival = count_unival_subtree_helper(root.left)
    right_count, is_right_unival = count_unival_subtree_helper(root.right)

    total_count = left_count + right_count

    if is_left_unival and is_right_unival:
        if root.left and root.left.val != root.val:
            return total_count, False
        if root.right and root.right.val != root.val:
            return total_count, False
        return total_count + 1, True

    return total_count, False


def is_unival(root: TreeNode) -> bool:
    return is_unival_helper(root, root.val)


def is_unival_helper(root: TreeNode, value: int) -> bool:
    if root is None:
        return True

    if (root.val == value):
        return is_unival_helper(root.left, value) and is_unival_helper(root.right, value)


if __name__ == "__main__":

    root = TreeNode(0)
    root.left = TreeNode(1)
    root.right = TreeNode(0)
    root.right.left = TreeNode(1)
    root.right.right = TreeNode(0)
    root.right.left.left = TreeNode(1)
    root.right.left.right = TreeNode(1)

    print(count_unival_subtree(root))
