#!/usr/bin/env python3

"""
Implement an autocomplete system. That is, given a query string s 
and a set of all possible query strings, return all strings in the set that 
have s as a prefix.

For example, given the query string de and the set of strings 
[dog, deer, deal], return [deer, deal].

"""

from typing import List


class TrieNode:
    def __init__(self) -> None:
        self.children = {}
        self.end_of_word = False


class Trie:
    def __init__(self) -> None:
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        current = self.root
        for ch in word:
            if (ch not in current.children):
                current.children[ch] = TrieNode()

            current = current.children.get(ch)
        current.end_of_word = True

    def search(self, word: str) -> bool:
        current = self.root
        for ch in word:
            if ch not in current.children:
                return False

            current = current.children.get(ch)

        return current.end_of_word


def autocomplete(wordlist: List, prefix: str) -> List:
    if not wordlist or not prefix:
        return []

    # Initialize a prefix tree (trie) and result array
    trie = Trie()
    result = []

    for word in wordlist:
        trie.insert(word)

    current = trie.root

    for ch in prefix:
        if ch not in current.children:
            return

        current = current.children.get(ch)

    # Put the words with the given prefix to the result array 
    autocomplete_helper(current, result, prefix)
    return result


# Helper function to built and put words into reslt array
def autocomplete_helper(root: TrieNode, list: List, prefix: str) -> None:
    if root.end_of_word:
        list.append(prefix)

    if not root.children:
        return

    for ch in root.children.keys():
        autocomplete_helper(root.children.get(ch), list, (prefix+ch))


if __name__ == "__main__":

    print(autocomplete(["cat", "cap", "dog", "football", "fat"], "ca"))
    print(autocomplete(["dog", "deer", "deal"], "de"))
    print(autocomplete(None, "de"))
    print(autocomplete(["python",], None))
