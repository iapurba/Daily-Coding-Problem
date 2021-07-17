#!/usr/bin/env python3

"""
Given an integer k and a string s, find the length of the longest 
substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k 
distinct characters is "bcb".

"""


def longest_substring_with_k_distinct_chars(s: str, k: int) -> str:

    longest = ""

    for i in range(len(s)):
        sub_str = ""
        seen = set()
        for j in range(i, len(s)):
            if s[j] not in seen:
                seen.add(s[j])
                print(seen)
                if len(seen) > k:
                    if len(sub_str) > len(longest):
                        longest = sub_str
                else:
                    sub_str += s[j]
            else:
                sub_str += s[j]
        print(sub_str)

    return longest


if __name__ == "__main__":
    print(longest_substring_with_k_distinct_chars("abcccc", 2))
