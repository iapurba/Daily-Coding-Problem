import java.util.Deque;
import java.util.LinkedList;

public class DCP018MaxOfSubarrays {
  public static void maxOfSubarrays(int[] array, int k) {
    if (array.length < k || k == 0) {
      return;
    }
    Deque<Integer> q = new LinkedList<>();
    // Preprocessing the deque
    // Keeping the only indices that matter
    for (int i = 0; i < k; i++) {
      if (q.size() != 0 && array[q.peekLast()] <= array[i]) {
        q.pollLast();
      }
      q.addLast(i);
    }

    for (int i = k; i < array.length; i++) {
      System.out.println(array[q.peekFirst()]);

      // Invariant loop to keep the queue orderd
      while (q.size() != 0 && q.peekFirst() <= (i - k)) {
        q.pollFirst();
      }
      while (q.size() != 0 && array[q.peekLast()] < array[i]) {
        q.pollLast();
      }
      q.addLast(i);
    }
    System.out.println(array[q.peekFirst()]);
  }

  public static void main(String[] args) {
    maxOfSubarrays(new int[] { 10, 5, 2, 7, 8, 7 }, 3);
    System.out.println();
    maxOfSubarrays(new int[] { 1, 2, 3, 4, 3, 2, 1 }, 20);
    System.out.println();
    maxOfSubarrays(new int[] { 10, 5, 2, 7, 8, 7 }, 3);
  }
}