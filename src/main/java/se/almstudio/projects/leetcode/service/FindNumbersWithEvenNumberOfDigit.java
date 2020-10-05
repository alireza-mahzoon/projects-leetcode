package se.almstudio.projects.leetcode.service;

public class FindNumbersWithEvenNumberOfDigit {
  public int findNumbers(int[] nums) {
    int length = 0;
    int count = 0;

    for (int i = 0; i<nums.length; i++) {
      length = (int) (Math.log10(nums[i]) + 1);
       if (length%2 == 0) {
         count++;
       }
    }
    return count;
  }
}
