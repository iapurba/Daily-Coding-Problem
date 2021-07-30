#!/usr/bin/env python3

class Node:
    def __init__(self, val, next=None) -> None:
        self.val = val
        self.next = next

    def __str__(self):
        current_node = self
        list_nodes = []

        while current_node:
            list_nodes.append(current_node.val)
            current_node = current_node.next

        return str(list_nodes)


def remove_kth_last_from_linked_list(head: Node, k: int):
    fast, slow = head, head
    # Move fast up by k 
    for _ in range(k):
        fast = fast.next

    prev = None
    # Move both fast and slow until fast reaches end of the list 
    while fast:
        prev = slow
        slow = slow.next
        fast = fast.next

    prev.next = slow.next


if __name__ == "__main__":

    head = Node(1, Node(2, Node(3, Node(4, Node(5, Node(6, Node(7)))))))
    print(head)
    remove_kth_last_from_linked_list(head, 3)
    print(head)
