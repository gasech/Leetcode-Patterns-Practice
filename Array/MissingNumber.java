package Array;

import java.util.Arrays;

public class MissingNumber {
  public static void main(String[] args) {
    int[] nums = {0,1,3,4};
    System.out.println(whichIsMissing(nums));
  }
  
  /* 
    Primeira solução, loopa pela array nums e verifica se o index é igual ao número,
    se não for então ele pega o index e assume que esse é o numero que está faltando
    na array
  */

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
