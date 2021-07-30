#!/usr/bin/env python3

def encode(s):
    if not s:
        return ""

    result = ""
    current_char = s[0]
    count = 1

    for i in range(1, len(s)):
        if s[i] == current_char:
            count += 1
        else:
            result = result + str(count) + \
                current_char if count > 1 else result + current_char
            current_char = s[i]
            count = 1

    result = result + str(count) + \
        current_char if count > 1 else result + current_char

    return result


def decode(s):
    if not s:
        return ""

    result = ""
    count = 0

    for char in s:
        if char.isdigit():
            count = count * 10 + int(char)
        else:
            result = result + char * count if count > 1 else result + char
            count = 0

    return result


if __name__ == "__main__":

    print(encode("AAAABBBCCDEFF"))
    print(decode("3A2BCD2E"))
