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

**Problem #5** [Medium]

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

**Problem #6** [Hard]

This problem was asked by Google.

An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding `next` and `prev` fields, it holds a field named `both`, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an `add(element)` which adds the element to the end, and a `get(index)` which returns the node at index.

If using a language that has no pointers (such as Python), you can assume you have access to `get_pointer` and `dereference_pointer` functions that converts between nodes and memory addresses.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP006XORLinkedList.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp006_xor_linked_list.py)

* * *

**Problem #7** [Medium]

This problem was asked by Facebook.

Given the mapping `a = 1, b = 2, ... z = 26`, and an encoded message, count the number of ways it can be decoded.

For example, the message `'111'` would give `3`, since it could be decoded as `'aaa'`, `'ka'`, and `'ak'`.

You can assume that the messages are decodable. For example, `'001'` is not allowed.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP007DecodeWays.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp007_decode_ways.py)

* * *

**Problem #8** [Easy]

This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

```
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
 ```

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP008CountUnivalSubtree.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp008_count_unival_subtree.py)

* * *

**Problem #9** [Hard]

This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be `0` or negative.

For example, `[2, 4, 6, 2, 5]` should return `13`, since we pick `2`, `6`, and `5`. `[5, 1, 1, 5]` should return `10`, since we pick `5` and `5`.

Follow-up: Can you do this in O(N) time and constant space?



**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP009LargestSumNonAdjacent.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp009_largest_sum_of_non_adj_elements.py)

* * *

**Problem #10** [Medium]

This problem was asked by Apple.

Implement a job scheduler which takes in a function `f` and an integer `n`, and calls `f` after `n` milliseconds.



**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP010JobScheduler.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp010_job_scheduler.py)

* * *

**Problem #11** [Medium]

This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string `s` and a set of all possible query strings, return all strings in the set that have `s` as a prefix.

For example, given the query string `de` and the set of strings `[dog, deer, deal]`, return `[deer, deal]`.

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.


**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP011AutocompleteSystem.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp011_autocomplete_system.py)

* * *

**Problem #12** [Hard]

This problem was asked by Amazon.

There exists a staircase with `N` steps, and you can climb up either `1` or `2` steps at a time. Given `N`, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if `N` is `4`, then there are `5` unique ways:

- 1, 1, 1, 1
- 2, 1, 1
- 1, 2, 1
- 1, 1, 2
- 2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers `X`? For example, if `X = {1, 3, 5}`, you could climb `1`, `3`, or `5` steps at a time.


**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP012StaircaseClimb.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp012_staircase_climb.py)

* * *

**Problem #15** [Medium]

This problem was asked by Facebook.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.


**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP015PickingRandomElement.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp015_picking_random_element.py)

* * *

