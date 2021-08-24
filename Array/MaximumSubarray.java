package Array;

import java.io.*;
import java.util.*;

public class MaximumSubarray {
  public static void main(String[] args) {
    int[] nums = { 2, -3, 2, 4};
    findMaximumSubarray1(nums);
  }

  static int findMaximumSubarray1(int[] nums){
    int bestSum = Integer.MIN_VALUE;
    int maxValue = 0;
    
    for(int i = 0; i < nums.length; i++){
      
      for(int j = i; j < nums.length; j++){
        maxValue = j;
      }
    }
  
    return 0;
  }
}
