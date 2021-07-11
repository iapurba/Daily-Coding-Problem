import java.util.HashMap;

public class DCP007DecodeWays {
  /*
   * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the
   * number of ways it can be decoded.
   * 
   * For example, the message '111' would give 3, since it could be decoded as
   * 'aaa', 'ka', and 'ak'.
   * 
   * You can assume that the messages are decodable. For example, '001' is not
   * allowed.
   */

  public static int countDecodeWaysDP(String s) {
    HashMap<Integer, Integer> cache = new HashMap<>();
    return countDecodeWaysHelper(s, 0, cache);
  }

  // Helper method 
  public static int countDecodeWaysHelper(String s, int i, HashMap<Integer, Integer> cache) {
    if (i >= s.length()) {
      return 1;
    }
    int ways = 0;
    int num1 = Character.getNumericValue(s.charAt(i));
    int num2 = (i != s.length() - 1)
        ? (Character.getNumericValue(s.charAt(i)) * 10) + Character.getNumericValue(s.charAt(i + 1))
        : 0;

    if (num1 > 0 && num1 <= 9) {
      if (cache.containsKey(i + 1)) {
        ways += cache.get(i + 1);
      } else {
        ways += countDecodeWaysHelper(s, i + 1, cache);
        cache.put(i + 1, ways);
      }
    }

    if (num2 >= 10 && num2 <= 26) {
      if (cache.containsKey(i + 2)) {
        ways += cache.get(i + 2);
      } else {
        ways += countDecodeWaysHelper(s, i + 2, cache);
        cache.put(i + 2, ways);
      }
    }
    return ways;
  }

  public static void main(String[] args) {

    System.out.println(countDecodeWaysDP("33"));
    System.out.println(countDecodeWaysDP("9"));
    System.out.println(countDecodeWaysDP("0"));
    System.out.println(countDecodeWaysDP("1125"));
    System.out.println(countDecodeWaysDP("115"));
    System.out.println(countDecodeWaysDP("123"));
  }
}
