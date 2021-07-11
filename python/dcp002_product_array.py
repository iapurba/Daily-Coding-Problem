from typing import List

"""
Given an array of integers, return a new array such that each element at
index i of the new array is the product of all the numbers in the original
array except the one at i.
 
For example, if our input was [1, 2, 3, 4, 5], the expected output would be
[120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
be [2, 3, 6].
 
Follow-up: what if you can't use division?
"""


def product_array(array: List[int]) -> List[int]:
    product = 1
    # Assuming the array does not contain any 0
    for i in array:
        product *= i

    for index, item in enumerate(array):
        # Without using division
        array[index] = int(product * pow(item, -1))

    return array


if __name__ == "__main__":
    nums = [10, 15, 3, 7]
    print(product_array(nums))
