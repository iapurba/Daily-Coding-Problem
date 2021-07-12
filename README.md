# Daily-Coding-Problem

This repository contains solutions of `data structure & algorithms` questions
which are send by a popular website named **[Daily Coding Problem](https://www.dailycodingproblem.com/)**.



These solutions are written with **[Java](https://www.java.com/en/)** and **[Python3](https://www.python.org/)**. Find `java` solutions [here](https://github.com/iapurba/Daily-Coding-Problem/tree/main/java) and `python` solutions [here](https://github.com/iapurba/Daily-Coding-Problem/tree/main/python).


![Daily Coding Problem book cover](https://scontent.fccu3-1.fna.fbcdn.net/v/t1.6435-9/53151002_411806812924876_6932070592904429568_n.png?_nc_cat=102&ccb=1-3&_nc_sid=6e5ad9&_nc_ohc=ehmrl1BvwLAAX-P15Es&_nc_ht=scontent.fccu3-1.fna&oh=aba7420fb98a0475415dced8ffc30a81&oe=60F1638D)


**Problem #1** [Easy]

This problem was recently asked by Google.

Given a list of numbers and a number `k`, return whether any two numbers from the list add up to `k`.

For example, given `[10, 15, 3, 7]` and `k` of `17`, return true since `10 + 7` is `17`.

Bonus: Can you do this in one pass?

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP001TwoSum.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp001_two_sum.py)

* * *

**Problem #2** [Hard]

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index `i` of the new array is the product of all the numbers in the original array except the one at `i`.

For example, if our input was `[1, 2, 3, 4, 5]`, the expected output would be `[120, 60, 40, 30, 24]`. If our input was `[3, 2, 1]`, the expected output would be `[2, 3, 6]`.

Follow-up: what if you can't use division?

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP002ProductArray.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp002_product_array.py)

* * *

**Problem #3** [Medium]

This problem was asked by Google.

Given the root to a binary tree, implement `serialize(root)`, which serializes the tree into a string, and `deserialize(s)`, which deserializes the string back into the tree.

For example, given the following `Node` class

```
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```    
  
The following test should pass:

```
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
```

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP003SerializeBinaryTree.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp003_serialize_binary_tree.py)

* * *

**Problem #4** [Hard]

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input `[3, 4, -1, 1]` should give `2`. The input `[1, 2, 0]` should give `3`.

You can modify the input array in-place.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP004MissingPositiveInt.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp004_smallest_positive_int.py)

* * *

**Problem #5** [Hard]

This problem was asked by Jane Street.

`cons(a, b)` constructs a pair, and `car(pair)` and `cdr(pair)` returns the first and last element of that pair. For example, `car(cons(3, 4))` returns `3`, and `cdr(cons(3, 4))` returns `4`.

Given this implementation of cons:

```
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
```

Implement `car` and `cdr`.

**Solution**: [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp005_construct_pair.py)

* * *