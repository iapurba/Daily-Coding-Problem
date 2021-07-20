#!/usr/bin/env python3

class ListNode:
    def __init__(self, val) -> None:
        self.val = val
        self.next = None

    def __str__(self) -> str:
        return str(self.val)

def find_length(a):
  if a is None:
    return 0
  return 1 + find_length(a.next)


def linked_list_intersection(a, b):
    length_a, length_b = find_length(a), find_length(b)

    # Keeping two pointers at the head of each list 
    current_a, current_b = a, b

    # Advancing the longer list by their difference 
    if length_a > length_b:
      for _ in range(length_a - length_b):
        current_a = current_a.next
    else:
      for _ in range(length_b - length_a):
        current_b = current_b.next
    
    # From the current pointers length of the list are equal
    # And the intersection must exists here
    while current_a != current_b:
      current_a = current_a.next
      current_b = current_b.next

    return current_a


if __name__ == "__main__":
    # Creating Linked list manually
    a = ListNode(1)
    a.next = ListNode(2)
    a.next.next = ListNode(3)

    b = ListNode(6)
    b.next = ListNode(7)
    b.next.next = ListNode(10)
    # b list intersects a list at this point 
    b.next.next.next = a.next

    print(linked_list_intersection(a, b))
