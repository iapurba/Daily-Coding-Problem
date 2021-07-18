#!/usr/bin/env python3

"""
Given an integer k and a string s, find the length of the longest 
substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k 
distinct characters is "bcb".

"""


def longest_substring_with_k_distinct_chars(s: str, k: int) -> str:
    if k == 0:
        return 0

    # Keep a running window
    bounds = (0, 0)
    seen = {}
    max_length = 0

    for i, ch in enumerate(s):
        seen[ch] = i
        if len(seen) <= k:
            lower_bound = bounds[0]  # lower bound remain same
        else:
            key_to_pop = min(seen, key=seen.get)  # pop key with min value
            lower_bound = seen.pop(key_to_pop) + 1

        bounds = (lower_bound, bounds[1] + 1)
        max_length = max(max_length, bounds[1] - bounds[0])

    return max_length


if __name__ == "__main__":
    print(longest_substring_with_k_distinct_chars("abcba", 2))
    print(longest_substring_with_k_distinct_chars("xxxpabcdpqeex", 3))
    print(longest_substring_with_k_distinct_chars("xwxwxwwxpqp", 2))
