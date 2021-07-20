#!/usr/bin/env python3

"""
Given an array of integers and a number k, where 1 <= k <= length of 
the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: 
[10, 7, 8, 8], since:

    - 10 = max(10, 5, 2)
    - 7 = max(5, 2, 7)
    - 8 = max(2, 7, 8)
    - 8 = max(7, 8, 7)

Do this in O(n) time and O(k) space. You can modify the input array 
in-place and you do not need to store the results. You can simply 
print them out as you compute them.
"""

from collections import deque


def max_of_subarrays(lst, k):
    if not lst or len(lst) < k or k == 0:
        return

    q = deque()

    # Preprocessing the queue,
    # Remember the queue contains the indecies that matter
    for i in range(k):
        while q and lst[i] >= lst[q[-1]]:
            q.pop()
        q.append(i)

    # Main loop
    for i in range(k, len(lst)):
        print(lst[q[0]])

        # Loop invariant to keep our queue always ordered
        while q and q[0] <= i - k:
            q.popleft()

        while q and lst[q[-1]] < lst[i]:
            q.pop()

        q.append(i)

    print(lst[q[0]])


if __name__ == "__main__":
    print(max_of_subarrays([10, 5, 2, 7, 8, 7], 0))

    print(max_of_subarrays([10, 9, 8, 7, 6, 5, 4, 3], 3))
