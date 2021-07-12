#!/usr/bin/env python3

import heapq
import threading

from time import time, sleep

"""
Implement a job scheduler which takes in a function f and an 
integer n, and calls f after n milliseconds.

"""


class Solution:
    def __init__(self) -> None:
        self.functions = []
        heapq.heapify(self.functions)
        self.thread = threading.Thread(target=self._poll)
        self.thread.start()

    def schedule(self, fn, n, *args, **kwargs):
        now = round(time() * 1000)
        heapq.heappush(self.functions, ((n + now), fn, args, kwargs))

    def _poll(self):
        while True:
            now = round(time() * 1000)
            if (len(self.functions) > 0):
                n, fn, args, kwargs = self.functions[0]
                if now > n:
                    fn(*args, **kwargs)
                    heapq.heappop(self.functions)
                sleep(0.01)


if __name__ == "__main__":

    def adder(*nums, **kwargs):
        sum = 0
        for n in nums:
            sum = sum + n
        print("sum = ", sum)
        # print(nums)

    def find_divident(*args, **kwargs):
        divisor = kwargs['divisor']
        quotient = kwargs['quotient']
        remainder = kwargs['remainder']
        print("divident = " + str(divisor * quotient + remainder))

    def lcm_of_two_numbers(*nums, **kwargs):
        num1, num2 = nums
        lcm = num1
        if num1 < num2:
            lcm = num2

        while True:
            if lcm % num1 == 0 and lcm % num2 == 0:
                print("LCM =", lcm)
                break
            else:
                lcm += 1

    job_scheduler = Solution()

    job_scheduler.schedule(adder, 2000, 2, 3, 4)
    job_scheduler.schedule(find_divident, 5000, divisor=4,
                           quotient=6, remainder=1)
    job_scheduler.schedule(lcm_of_two_numbers, 10000, 3, 4)
