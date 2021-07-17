#!/usr/bin/env python3

"""
You run an e-commerce website and want to record the last N 
order ids in a log. Implement a data structure to accomplish this, 
with the following API:

 - record(order_id): adds the order_id to the log
 - get_last(i): gets the ith last element from the log. i is guaranteed 
   to be smaller than or equal to N.
 
You should be as efficient with time and space as possible.
"""


class LogDataStructure:
    def __init__(self, size: int) -> None:
        self.size = size
        self.circular_buffer = [None for i in range(size)]
        self.current_idx = 0

    def record(self, order_id: int) -> None:
        self.circular_buffer[self.current_idx] = order_id
        self.current_idx = (self.current_idx + 1) % self.size
        # print(self.circular_buffer)

    def get_last(self, i: int):
        return self.circular_buffer[(self.current_idx - i + self.size) % self.size]


if __name__=="__main__":
  my_logs = LogDataStructure(6)

  for id in range(1, 5):
    my_logs.record(id)

  print(my_logs.get_last(2))
  print(my_logs.get_last(3))
