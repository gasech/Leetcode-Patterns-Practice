import java.util.Arrays;

public class MissingNumber {
  public static void main(String[] args) {
    int[] nums = {0,1,3,4};
    System.out.println(whichIsMissing(nums));
  }

  static int whichIsMissing(int[] nums) { 
    Arrays.sort(nums);
    
    for(int i = 0; i < nums.length; i++){
      if(i != nums[i]){
        return i;
      }
    }

    return nums.length;
  }
}
