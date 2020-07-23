package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargestElementInAnArray {

  public static int findKthLargest(int[] nums, int k) {

    List<Integer> sortedNums = new ArrayList<>();
    int kthLargest;

    for (int i = 0; i < nums.length; i++) {
      sortedNums.add(0, nums[i]);
    }

    Collections.sort(sortedNums);
    Collections.reverse(sortedNums);
    kthLargest = sortedNums.get(k - 1);
    return kthLargest;
  }
}
