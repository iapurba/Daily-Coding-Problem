#!/usr/bin/env python3

import ctypes


def dereference_pointer(id):
    return ctypes.cast(id, ctypes.py_object).value


def get_pointer(node):
    return id(node)


class Node:
    def __init__(self, val) -> None:
        self.val = val
        self.both = 0

    def __str__(self) -> str:
        return str(self.val)


class XORLinkedList:
    def __init__(self) -> None:
        self.head = self.tail = None

    def add(self, element) -> None:
        node = Node(element)
        if self.head is None:
            self.head = self.tail = node
        else:
            node.both = get_pointer(self.tail)
            self.tail.both = self.tail.both ^ get_pointer(node)
            self.tail = node

    def get(self, idx) -> Node:
        head = self.head
        prev = 0
        for i in range(idx):
            next = head.both ^ prev
            if next:
                prev = get_pointer(head)
                head = dereference_pointer(next)

        return head


if __name__ == "__main__":

    xll = XORLinkedList()

    xll.add("1")
    xll.add("2")
    xll.add("3")
    xll.add("4")

    assert xll.get(1).val == "2"
    assert xll.get(2).val == "3"
