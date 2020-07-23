package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray {
  public static int[] sortArray(int[] nums) {

    List<Integer> numsList = new ArrayList<>();
    int[] sortedNums = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      numsList.add(i, nums[i]);
    }

    Collections.sort(numsList);

    for (int i = 0; i < nums.length; i++) {
      sortedNums[i] = numsList.get(i);
    }
    return sortedNums;
  }
}
