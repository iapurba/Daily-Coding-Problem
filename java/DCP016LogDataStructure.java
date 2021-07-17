// import java.util.Arrays;

public class DCP016LogDataStructure {
  /*
   * You run an e-commerce website and want to record the last N order ids in a
   * log. Implement a data structure to accomplish this, with the following API:
   * 
   * record(order_id): adds the order_id to the log get_last(i): gets the ith last
   * element from the log. i is guaranteed to be smaller than or equal to N. You
   * should be as efficient with time and space as possible.
   */

  private int size;
  private int[] circularBuffer;
  private int currentIdx;

  public DCP016LogDataStructure(int size) {
    this.size = size;
    this.circularBuffer = new int[size];
    this.currentIdx = 0;
  }

  public void record(int orderId) {
    circularBuffer[currentIdx] = orderId;
    currentIdx = (currentIdx + 1) % size;
    // System.out.println(Arrays.toString(circularBuffer));
  }

  public int getLast(int i) {
    return circularBuffer[(currentIdx - i + size) % size];
  }

  public static void main(String[] args) {
    DCP016LogDataStructure myLogs = new DCP016LogDataStructure(5);
    for (int i = 1; i <= 7; i++) {
      myLogs.record(i);
    }

    System.out.println(myLogs.getLast(2));
    System.out.println(myLogs.getLast(3));
  }
}
