package se.almstudio.projects.leetcode.service;

import java.util.Arrays;

public class RotateArray {

  public static int[] rotate(int[] nums, int k) {

    for (int i = 0; i<k; i++) {
      int last,j;
      last = nums[nums.length -1];
      for (j= nums.length -1; j>0; j--) {
        nums[j] = nums[j-1];
      }
      nums[0] = last;
    }
    return nums;
  }
}
