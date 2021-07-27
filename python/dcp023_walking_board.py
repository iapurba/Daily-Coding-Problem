#!/usr/bin/env python3

from queue import Queue
from typing import List


# Helper function to check if a cordinator is walkable or not
def walkable(board, row, col) -> bool:
    if row < 0 or row >= len(board):
        return False
    if col < 0 or col >= len(board):
        return False

    return not board[row][col]


# Helper funtion to get all the walkable cords of a given cordinator
def walkable_neighbours(board, row, col) -> List[tuple]:
    return [(r, c) for r, c in
            [(row, col-1),
             (row-1, col),
             (row, col + 1),
             (row+1, col)] if walkable(board, r, c)]


def shortest_path(board, start, end) -> int:
    seen = set()
    queue = Queue()

    queue.put((start, 0))

    while not queue.empty():
        cords, count = queue.get()

        if cords == end:
            return count

        seen.add(cords)

        neighbours = walkable_neighbours(board, cords[0], cords[1])

        for neighbour in neighbours:
            if neighbour not in seen:
                queue.put((neighbour, count + 1))


if __name__ == "__main__":

    board = [[False, False, False, False],
             [True, True, False, True],
             [False, False, False, False],
             [False, False, False, False]]

    print(shortest_path(board, (0, 3), (3, 3)))
