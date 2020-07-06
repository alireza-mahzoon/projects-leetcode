package se.almstudio.projects.leetcode.service;

import java.sql.Array;

public class MonotonicArray {


  private static final int DESCENDING = -1;
  private static final int EQUAL = 0;
  private static final int ASCENDING = 1;
  public static boolean monotonic(int[] nums) {
    boolean finalResult;
    if (nums.length <3) {
      return true;
    }
    int lastResult = 0;
    for (int i = 1; i < nums.length; i++) {
      int result = 0;
      if (nums[i-1] > nums[i] ) {
        result = ASCENDING;
      } else if (nums[i-1] < nums[i]) {
        result = DESCENDING;
      } else {
        result = 0;
      }
      if (i == 1) {
        lastResult = result;
        continue;
      }
      if (result == 0) {
        continue;
      }
      if (result != lastResult) {
        return false;
      }
      lastResult = result;
    }
    return finalResult;
  }
}


