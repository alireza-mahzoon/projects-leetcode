package se.almstudio.projects.leetcode.service;

import java.util.Arrays;

public class RotateArray {

  public static void rotate(int[] nums, int k) {
    for (int i = 0; i < nums.length; i++ ) {
      if (i<=k) {
        nums[i] = nums[i+k];
      }
      else if (i>k) {
        nums[i] = nums[i-k+1];
      }
    }
    System.out.println(Arrays.toString(nums));
  }

  int[] numSample = {1,2,3,4,5,6,7};
  int kSample = 3;


}
