#!/usr/bin/env python3

"""
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, 
count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be 
decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' 
is not allowed.

"""


def count_decode_ways(s: str) -> int:
    return count_decode_ways_helper(s, 0, {})


# Recursive helper funtion
def count_decode_ways_helper(s: str, i: int, cache: dict) -> int:
    if (i >= len(s)):
        return 1

    ways = 0
    num1 = int(s[i])
    num2 = int(s[i:i+2]) if (i != len(s) - 1) else 0

    if 0 < num1 <= 9:
        if (i + 1) in cache:
            ways += cache[i+1]
        else:
            ways += count_decode_ways_helper(s, i + 1, cache)
            cache[i+1] = ways

    if 10 <= num2 <= 26:
        if (i+2) in cache:
            ways += cache[i+2]
        else:
            ways += count_decode_ways_helper(s, i + 2, cache)
            cache[i+2] = ways

    return ways


if __name__ == "__main__":

    print(count_decode_ways('123'))
    print(count_decode_ways('1125'))
    print(count_decode_ways('1235'))
    print(count_decode_ways('0'))
    print(count_decode_ways('11111'))
