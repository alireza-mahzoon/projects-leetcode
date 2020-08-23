package se.almstudio.projects.leetcode.service;

public class RunningSumof1dArray {
  public int[] runningSum(int[] nums) {
    int[] outPut = new int[nums.length];
    int count = 0;
    for (int i = 0; i<nums.length; i++) {
      count = (count + nums[i]);
      outPut[i] = count;
    }
    return outPut;
  }
}
