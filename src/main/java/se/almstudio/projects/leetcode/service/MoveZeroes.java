package se.almstudio.projects.leetcode.service;

import java.util.Arrays;

public class MoveZeroes {
  public static void moveZeroes(int[] nums) {
    int index = 0;

    for (int i = 0; i<nums.length; i++) {
      if (nums[i] != 0) {
        nums[index++] = nums[i];
      }
    }

    while (index<nums.length) {
      nums[index++] = 0;
    }

    System.out.println(Arrays.toString(nums));
  }
}



