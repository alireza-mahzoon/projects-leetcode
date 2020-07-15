package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayPartitionOne {

  public static int arrayPairSum(int[] nums) {

    int sum = 0;
    List<Integer> numsList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      numsList.add(nums[i]);
    }
    Collections.sort(numsList);

    for (int i = 0, j = 1; i < numsList.size() - 1; i += 2) {
      sum = numsList.get(i) + sum;
    }
    return sum;
  }
}
