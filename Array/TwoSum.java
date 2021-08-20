package Array;

import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = { 0, 5, 3, 4 };
    int target = 9;

    System.out.println(Arrays.toString(findTwoSum1(nums, target)));
  }

  static int[] findTwoSum1(int[] nums, int target) {
    int[] twoSum = { 0, 0 };

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        if (nums[i] != nums[j] && sum == target) {
          twoSum[0] = i;
          twoSum[1] = j;
          return twoSum;
        }
      }
    }

    return twoSum;
  }

  static int[] findTwoSum2(int[] nums, int target) {
    int[] twoSum = { 0, 0 };

    for (int i = 0; i < nums.length; i++) {

    }

    return twoSum;
  }
}
