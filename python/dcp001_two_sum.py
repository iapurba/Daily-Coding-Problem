#!/usr/bin/env python3

from typing import List

"""
Given a list of numbers and a number k, return whether any two 
numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true 
since 10 + 7 is 17.
"""

def two_sum(array: List[int], targer: int) -> bool:
    if not array:
        return False

    seen = set()

    for item in array:
        if item in seen:
            return True
        else:
            # Add second number (target - current) which can be 
            # added to the current number to get the target
            seen.add(targer-item)

    return False


if __name__ == "__main__":
    nums = [10, 15, 3, 7]

    print(two_sum(nums, 17))
    print(two_sum(nums, 19))
