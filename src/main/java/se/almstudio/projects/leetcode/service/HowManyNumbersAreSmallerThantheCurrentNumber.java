package se.almstudio.projects.leetcode.service;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] outPut = new int[nums.length];
    for (int i = 0; i<nums.length; i++) {
      int count = 0;
      for (int j = 0; j <nums.length; j++) {
        if (nums[i] > nums[j]) {
          count = count + 1;
        }
      }
      outPut[i] = count;
    }
    return outPut;
  }
}
