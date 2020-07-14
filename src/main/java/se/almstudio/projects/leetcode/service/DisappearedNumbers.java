package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumbers {
  public static List<Integer> findDisappearedNumbers(int[] nums) {

    Set<Integer> numsList = new HashSet<>();
    List<Integer> notEqualElements = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      numsList.add(nums[i]);
    }

    for (int i = 1; i <= nums.length; i++) {
      if (!numsList.contains(i)) {
        notEqualElements.add(i);
      }
    }
    System.out.println(notEqualElements);
    return notEqualElements;
  }
}
