import java.util.HashMap;
import java.util.Map;

public class DCP013LongestSubstring {
  /*
   * Given an integer k and a string s, find the length of the longest substring
   * that contains at most k distinct characters.
   * 
   * For example, given s = "abcba" and k = 2, the longest substring with k
   * distinct characters is "bcb".
   */

  public static int longestSubstringWithKDistinctChars(String s, int k) {
    if (k == 0) {
      return 0;
    }

    int[] bounds = { 0, 0 };
    Map<Character, Integer> seen = new HashMap<>();
    int maxLength = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      seen.put(ch, i);
      int lowerBound = bounds[0];

      if (seen.size() > k) {
        int min = Integer.MAX_VALUE;
        Character key_to_pop = null;

        for (Map.Entry<Character, Integer> entry : seen.entrySet()) {
          if (entry.getValue() < min) {
            min = entry.getValue();
            key_to_pop = entry.getKey();
          }
        }
        lowerBound = seen.remove(key_to_pop) + 1;
      }
      bounds[0] = lowerBound;
      bounds[1] = bounds[1] + 1;
      maxLength = Math.max(maxLength, bounds[1] - bounds[0]);
    }
    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println(longestSubstringWithKDistinctChars("abcba", 2));
    System.out.println(longestSubstringWithKDistinctChars("xxxpvxtysz", 3));
    System.out.println(longestSubstringWithKDistinctChars("acdczzzx", 3));
  }
}
