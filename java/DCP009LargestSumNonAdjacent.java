public class DCP009LargestSumNonAdjacent {
  /*
   * Given a list of integers, write a function that returns the largest sum of
   * non-adjacent numbers. Numbers can be 0 or negative.
   * 
   * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5,
   * 1, 1, 5] should return 10, since we pick 5 and 5.
   */
  
  public static int largestSumOfNonAdjacentNumbers(int[] nums) {
    int include = 0;
    int exclude = 0;

    for (int i = 0; i < nums.length; i++) {
      int temp = include;
      include = Math.max(exclude + nums[i], include);
      exclude = temp;
    }

    return include;
  }

  public static void main(String[] args) {
    int[] nums1 = { 2, 4, 6, 2, 5 };
    int[] nums2 = { -1, 2, 3, 7, -4, -1, 9, 0, 6, 1 };

    System.out.println(largestSumOfNonAdjacentNumbers(nums1));
    System.out.println(largestSumOfNonAdjacentNumbers(nums2));
  }
}
