#!/usr/bin/env python3

from typing import List, Tuple


def is_overlaped(a: Tuple, b: Tuple) -> bool:
    start_a, end_a = a
    start_b, end_b = b
    # Interval doesn't overlap if it looks like this
    # [start_a ... end_a] <---> [start_b ... end_b]
    # or this
    # [start_b ... end_b] <---> [start_a ... end_b]

    return not (end_a < start_b or end_b < start_a)


def max_meeting_rooms_bruteforce(intervals: List[Tuple]) -> int:
    current_intervals = {intervals[0]: 1}
    current_max = 0
    for i in range(1, len(intervals)):
        for ci in current_intervals:
            if not is_overlaped(ci, intervals[i]):
                current_intervals.pop(ci)
                break
        current_intervals[intervals[i]] = i

        current_max = max(current_max, len(current_intervals))

    return current_max


def max_meeting_rooms_optimal(intervals: List[Tuple]) -> int:
    starts = sorted([start for start, end in intervals])
    ends = sorted([end for start, end in intervals])

    current_max, current_overlap, i, j = 0, 0, 0, 0

    while i < len(starts) and j < len(ends):
        if starts[i] < ends[j]:
            current_overlap += 1
            current_max = max(current_max, current_overlap)
            i += 1
        else:
            current_overlap -= 1
            j += 1

    return current_max


if __name__ == "__main__":

    print(max_meeting_rooms_bruteforce([(0, 50), (30, 75), (60, 150)]))
    print(max_meeting_rooms_bruteforce(
        [(5, 20), (0, 50), (30, 75), (60, 150), (10, 70)]))

    print(max_meeting_rooms_optimal([(0, 50), (30, 75), (60, 150)]))
    print(max_meeting_rooms_optimal(
        [(5, 20), (0, 50), (30, 75), (60, 150), (10, 70)]))
