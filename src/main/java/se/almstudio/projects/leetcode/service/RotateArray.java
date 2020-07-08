package se.almstudio.projects.leetcode.service;

import java.util.Arrays;

public class RotateArray {

  public static int[] rotate(int[] nums, int k) {
    int numResult[]=new int[nums.length];
    for ( int i = 0; i <nums.length; i++) {
      if(i<k) {
        numResult[i] = nums[nums.length+i-k];
      }
      if(i>=k) {
        numResult[i] = nums[i-k];
      }
    }
    return numResult;
  }
}
