import java.util.HashSet;

public class DCP001TwoSum {
  /*
   * Given a list of numbers and a number k, return whether any two numbers from
   * the list add up to k.
   * 
   * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
   * 17.
   * 
   * Bonus: Can you do this in one pass?
   */

  public static boolean twoSum(int[] nums, int target) {
    HashSet<Integer> seen = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (seen.contains(nums[i])) {
        return true;
      } else {
        // Storing the second number which can be added
        // with the current number to add up to the target
        seen.add(target - nums[i]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 10, 15, 3, 7 };

    System.out.println(twoSum(nums, 17)); // true
    System.out.println(twoSum(nums, 19)); // false
  }
}