import java.util.Arrays;

public class DCP002ProductArray {
  /*
   * Given an array of integers, return a new array such that each element at
   * index i of the new array is the product of all the numbers in the original
   * array except the one at i.
   * 
   * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
   * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
   * be [2, 3, 6].
   * 
   * Follow-up: what if you can't use division?
   */

  public static int[] productArrayExceptSelf(int[] nums) {
    int product = 1;
    int zeroCount = 0;

    for (int num : nums) {
      if (num != 0) {
        product *= num;
      } else {
        zeroCount++;
      }
    }

    if (zeroCount > 1) {
      for (int i = 0; i < nums.length; i++) {
        nums[i] = 0;
      }
    } else if (zeroCount == 1) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0)
          nums[i] = product;
        else
          nums[i] = 0;
      }
    } else {
      for (int i = 0; i < nums.length; i++) {
        // Insted of division we are using power
        nums[i] = (int) (product * Math.pow(nums[i], -1));
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    
    int[] nums1 = { 1, 2, 3, 4, 5 };
    int[] nums2 = { 2, 3, 6, 0 };
    int[] nums3 = { 1, 4, 12, 0, 3, 0 };

    System.out.println(Arrays.toString(productArrayExceptSelf(nums1)));
    System.out.println(Arrays.toString(productArrayExceptSelf(nums2)));
    System.out.println(Arrays.toString(productArrayExceptSelf(nums3)));
  }
}
