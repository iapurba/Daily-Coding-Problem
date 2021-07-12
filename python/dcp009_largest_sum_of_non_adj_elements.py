#!/usr/bin/env python3

from typing import List

"""
Given a list of integers, write a function that returns the largest sum of
 non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 
2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?

"""


def largest_sum_of_non_adjacent_elements(nums: List) -> int:
    include = 0
    exclude = 0

    for n in nums:
        temp = include
        include = max(exclude + n, include)
        exclude = temp

    return include


if __name__ == "__main__":

    nums = [2, 4, 6, 2, 5]
    nums2 = [4, -1, -3, 2, -1, 3, 5, 6, 0, 1, -2, 6]

    print(largest_sum_of_non_adjacent_elements(nums))
    print(largest_sum_of_non_adjacent_elements(nums2))
