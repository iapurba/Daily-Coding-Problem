public class DCP012StaircaseClimb {
  /*
   * There exists a staircase with N steps, and you can climb up either 1 or 2
   * steps at a time. Given N, write a function that returns the number of unique
   * ways you can climb the staircase. The order of the steps matters.
   * 
   * For example, if N is 4, then there are 5 unique ways:
   * 
   * 1, 1, 1, 1 2, 1, 1 1, 2, 1 1, 1, 2 2, 2
   * 
   * What if, instead of being able to climb 1 or 2 steps at a time, you could
   * climb any number from a set of positive integers X? For example, if X = {1,
   * 3, 5}, you could climb 1, 3, or 5 steps at a time.
   */

  public static int staircaseClimb(int n) {
    if (n < 0)
      return 0;

    int a = 1;
    int b = 2;

    for (int i = 0; i < (n - 1); i++) {
      int temp = a;
      a = b;
      b = a + temp;
    }
    return a;
  }

  public static int staircaseClimbGeneralize(int n, int[] X) {
    if (n < 0)
      return 0;

    int[] cache = new int[n + 1];
    cache[0] = 1;

    for (int i = 1; i < cache.length; i++) {
      for (int j = 0; j < X.length; j++) {
        cache[i] += (i - X[j]) >= 0 ? cache[i - X[j]] : 0;
      }
    }
    return cache[n];
  }

  public static void main(String[] args) {

    System.out.println(staircaseClimb(5));

    int[] steps = { 1, 2, 3 };
    System.out.println(staircaseClimbGeneralize(4, steps));

  }
}