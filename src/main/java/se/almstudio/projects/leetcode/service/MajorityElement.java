package se.almstudio.projects.leetcode.service;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public int majorityElement(int[] nums) {

    Map<Integer, Integer> countElement = new HashMap<>();
    int count = 0;
    int result = 0;

    for (int i =0; i <nums.length; i++) {
      if (countElement.containsKey(nums[i])) {
        countElement.put(nums[i], countElement.get(nums[i]) + 1);
      } else {
        countElement.put(nums[i], 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : countElement.entrySet()) {
      if (entry.getValue() > (nums.length)/2) {
        result = entry.getKey();
      }
    }
    return result;
  }
}
