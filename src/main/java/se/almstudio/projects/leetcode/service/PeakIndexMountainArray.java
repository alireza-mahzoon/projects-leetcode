package se.almstudio.projects.leetcode.service;

public class PeakIndexMountainArray {

  public static int peakIndexOfMountainArray(int[] nums) {
    int i;
    int result = 0;

    for (i=1; i<nums.length-1; i++) {
      if (nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
        result = i;
      }
    }
    System.out.println(result);
    return result;
  }
}
