package se.almstudio.projects.leetcode.service;

import java.sql.Array;

public class MonotonicArray {

  /* Solution 1
  public static boolean monotonic(int[] numbers) {
    if (numbers.length < 3) {
      return true;
    }
    int lastResult = 0;
    for (int i = 1; i < numbers.length; i++) {
      int result = Integer.compare(numbers[i-1], numbers[i]);
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
    return true;
  }

   */

  /* Solution 2
  public static boolean monotonic(int[] numbers) {
    boolean increasing = true;
    boolean decreasing = true;

    for (int i=0 ; i<numbers.length-1; i++) {
      if (numbers[i] > numbers[i+1]) increasing = false;
      if (numbers[i] < numbers[i+1]) decreasing = false;
    }
    return decreasing || increasing;
  }

   */
  private static final int DESCENDING = -1;
  private static final int EQUAL = 0;
  private static final int ASCENDING = 1;
  public static boolean monotonic(int[] nums) {
    boolean finalResult;
    if (nums.length <3) {
      return true;
    }
    int lastResult = 0;
    int result;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i-1] < nums[i] ) {
        result = ASCENDING;
      } else if (nums[i-1] > nums[i]) {
        result = DESCENDING;
      } else {
        result = EQUAL;
      }
      if (i == 1) {
        lastResult = result;
        continue;
      }
      if (result == 0) {
        continue;
      }
      if(result != lastResult) {
        return false;
      }
      lastResult = result;
    }
    return true;
  }
}


