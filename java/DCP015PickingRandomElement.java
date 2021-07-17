import java.util.Random;

public class DCP015PickingRandomElement {
  /*
   * Given a stream of elements too large to store in memory, pick a random
   * element from the stream with uniform probability.
   */
  static int result = 0;
  static int count = 0;

  public static int pick(int x) {
    count++;
    if (count == 1) {
      result = x;
    } else {
      Random r = new Random();
      int i = r.nextInt(count);

      if (i == count - 1) {
        result = x;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] bigStream = { 1, 2, 3, 4, 5, 6, 7, 8 };
    for (int i = 0; i < bigStream.length; i++) {
      System.out.println("Random number from first " + (i + 1) + " number is " + pick(bigStream[i]));
    }
  }
}
