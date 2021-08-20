package Array;

import java.util.Arrays;

public class MaximumSubarray {
  public static void main(String[] args) {
    int[] nums = { 5, 4, -1, 7, 8 };
    findMaximumSubarray(nums);
  }

  static int findMaximumSubarray(int[] nums){
    System.out.println(Arrays.toString(nums));
    
    int num1 = -2;
    int num2 = 4;
    int sum = num1 + num2;

    System.out.println(sum);

    return 0;
  }
}
