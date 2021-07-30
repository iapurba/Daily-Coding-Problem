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

**Problem #13** [Hard]

This problem was asked by Amazon.

Given an integer `k` and a string `s`, find the length of the longest substring that contains at most `k` distinct characters.

For example, given `s = "abcba"` and `k = 2`, the longest substring with `k` distinct characters is `"bcb"`.


**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP013LongestSubstring.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp013_longest_substring.py)

* * *

**Problem #15** [Medium]

This problem was asked by Facebook.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.


**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP015PickingRandomElement.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp015_picking_random_element.py)

* * *

**Problem #16** [Easy]

This problem was asked by Twitter.

You run an e-commerce website and want to record the last `N` `order` ids in a log. Implement a data structure to accomplish this, with the following API:

- `record(order_id)`: adds the `order_id` to the log
- `get_last(i)`: gets the `ith` last element from the log. `i` is guaranteed to be smaller than or equal to `N`.
  
You should be as efficient with time and space as possible.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP016LogDataStructure.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp016_log_data_structure.py)

* * *

**Problem #17** [Hard]

This problem was asked by Google.

Suppose we represent our file system by a string in the following manner:

The string `"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"` represents:

```
dir
    subdir1
    subdir2
        file.ext
```

The directory `dir` contains an empty sub-directory `subdir1` and a sub-directory `subdir2` containing a file `file.ext`.

The string `"dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"` represents:

```
dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
```

The directory `dir` contains two sub-directories `subdir1` and `subdir2`. `subdir1` contains a file `file1.ext` and an empty second-level sub-directory `subsubdir1`. `subdir2` contains a second-level sub-directory `subsubdir2` containing a file `file2.ext`.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is `"dir/subdir2/subsubdir2/file2.ext"`, and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note:

The name of a file contains at least a period and an extension.

The name of a directory or sub-directory will not contain a period.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP017AbsolutePath.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp017_absolute_path.py)

* * *

**Problem #18** [Hard]

This problem was asked by Google.

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

- 10 = max(10, 5, 2)
- 7 = max(5, 2, 7)
- 8 = max(2, 7, 8)
- 8 = max(7, 8, 7)

Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP018MaxOfSubarrays.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp018_max_of_subarrays.py)

* * *

**Problem #20** [Easy]

This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP020LinkedListIntersection.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp020_linked_list_intersection.py)

* * *

**Problem #21** [Easy]

This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given `[(30, 75), (0, 50), (60, 150)]`, you should return `2`.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP020LinkedListIntersection.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp021_minimum_rooms.py)

* * *

**Problem #22** [Medium]

This problem was asked by Microsoft.

Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words `'quick'`, `'brown'`, `'the'`, `'fox'`, and the string `"thequickbrownfox"`, you should return `['the', 'quick', 'brown', 'fox']`.

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either `['bed', 'bath', 'and', 'beyond]` or `['bedbath', 'and', 'beyond']`.

* * *

**Problem #23** [Easy]

This problem was asked by Google.

You are given an `M` by `N` matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

```
[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
```

and start = `(3, 0)` (bottom left) and end = `(0, 0)` (top left), the minimum number of steps required to reach the end is 7, since we would need to go through `(1, 2)` because there is a wall everywhere else on the second row.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP020LinkedListIntersection.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp023_walking_board.py)

* * *

**Problem #26** [Medium]

This problem was asked by Google.

Given a singly linked list and an integer `k`, remove the kth last element from the list. `k` is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.

Do this in constant space and in one pass.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP026RemoveKthLastElement.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp026_remove_kth_last_element.py)

* * *

**Problem #27** [Easy]

This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string `"([])[]({})"`, you should return `true`.

Given the string `"([)]"` or `"((()"`, you should return `false`.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP027BlancedParenthesis.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp027_blanced_parenthesis.py)

* * *

**Problem #29** [Easy]

This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string `"AAAABBBCCDAA"` would be encoded as `"4A3B2C1D2A"`.

Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

**Solution**: [Java](https://github.com/iapurba/Daily-Coding-Problem/blob/main/java/DCP029RunningLengthEncodeDecode.java) | [Python](https://github.com/iapurba/Daily-Coding-Problem/blob/main/python/dcp029_run_length_encode_decode.py)

* * *