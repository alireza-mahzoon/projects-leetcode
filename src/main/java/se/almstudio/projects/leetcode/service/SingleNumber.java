package se.almstudio.projects.leetcode.service;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public int singleNumber(int[] nums) {
    int result = 0;

    Map<Integer, Integer> numbersCount = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numbersCount.containsKey(nums[i])) {
        numbersCount.put(nums[i], numbersCount.get(nums[i]) + 1);
      } else {
        numbersCount.put(nums[i], 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
      if (entry.getValue() == 1) {
        result = entry.getKey();
      }
    }
    return result;
  }
}
