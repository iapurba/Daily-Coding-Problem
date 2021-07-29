#!/usr/bin/env python3

def isBalanced(s: str) -> bool:
    stack = []
    pair = {'(': ')', '{': '}', '[': ']'}

    for ch in s:
        # For left brackets push right brackets
        if (ch in pair.keys()):
            stack.append(pair[ch])
        else:
            # Unmatch right char
            if len(stack) == 0:
                return False
            # Ensure a match
            if (ch != stack[-1]):
                return False

            # Good match, pop
            stack.pop()

    return len(stack) == 0


if __name__ == "__main__":
    print(isBalanced("((){[]})"))
    print(isBalanced(""))
    print(isBalanced("[[["))
