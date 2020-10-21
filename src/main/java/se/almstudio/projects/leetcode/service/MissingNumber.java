package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
  public static int missingNumber(int[] nums) {

    int missingNumber = 0;
    List<Integer> numsList = new ArrayList<>();

    for (int num : nums) {
      numsList.add(num);
    }

    for (int i = 0 ; i <=nums.length; i++) {
      if (!numsList.contains(i)) {
        missingNumber = i;
      }
    }
    return missingNumber;
  }
}
