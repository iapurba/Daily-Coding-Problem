public class DCP004MissingPositiveInt {
  /*
   * Given an array of integers, find the first missing positive integer in linear
   * time and constant space. In other words, find the lowest positive integer
   * that does not exist in the array. The array can contain duplicates and
   * negative numbers as well.
   */

  public static int findSmallestPositiveInteger(int[] nums) {
    int c = 0;
    // Arranging the array in a way where one element sit in it's respective
    // position. We are using 0 based index so 1 goes to index of 0 and 2 to 1
    while (c != nums.length) {
      if (nums[c] > 0 && nums[c] < nums.length && (nums[c] != c + 1) && nums[c] != nums[nums[c] - 1]) {
        swap(nums, c, nums[c] - 1);
      } else {
        c++;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (i + 1 != nums[i]) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }

  // Helper method to swap to elements in an array
  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {

    int[] nums1 = { 3, 4, -1, 1 };
    int[] nums2 = { 0, 1, 3, 1, 2, 4, 8, 5, 6, 11, -3, -12, 0 };

    System.out.println(findSmallestPositiveInteger(nums1));
    System.out.println(findSmallestPositiveInteger(nums2));
  }
}
