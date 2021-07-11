public class DCP009LargestSumNonAdjacent {
  
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
