#!/usr/bin/env python3

from queue import Queue

"""
Given the root to a binary tree, implement serialize(root), 
which serializes the tree into a string, and deserialize(s), which 
deserializes the string back into the tree.
"""


class TreeNode:
    def __init__(self, val: int) -> None:
        self.val = val
        self.left: TreeNode = None
        self.right: TreeNode = None


def serialize(root: TreeNode) -> str:
    if not root:
        return "null,"

    left_serialize = serialize(root.left)
    right_serialize = serialize(root.right)

    return str(root.val) + "," + left_serialize + right_serialize


def deserialize(s: str) -> TreeNode:
    nodes = Queue()
    for item in s.split(","):
        nodes.put(item)

    return deserialize_helper(nodes)


# Helper function to convert a string representaion to tree node recusively
def deserialize_helper(nodes: Queue) -> TreeNode:
    value_for_node = nodes.get()

    if value_for_node == "null":
        return None

    newNode = TreeNode(int(value_for_node))
    newNode.left = deserialize_helper(nodes)
    newNode.right = deserialize_helper(nodes)

    return newNode


if __name__ == "__main__":
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.right.left = TreeNode(4)
    root.right.right = TreeNode(5)

    print(serialize(root))

    deserialized_root = deserialize(serialize(root))

    assert (deserialized_root.right.left.val == root.right.left.val)
