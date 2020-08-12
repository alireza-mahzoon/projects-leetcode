package se.almstudio.projects.leetcode.service;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllDuplicatesInAnArray {

  public static List<Integer> findDuplicates(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int number : nums) {
      int count = 1;
      if (counts.containsKey(number)) {
        count = counts.get(number) + 1;
      }
      counts.put(number, count);
    }
    List<Integer> result = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
      if (entry.getValue() == 2) {
        result.add(entry.getKey());
      }
    }
    System.out.println(result);
    return result;
  }

//  public static List<Integer> findDuplicates2(int[] nums) {
//    Map<Integer, Integer> counts = new HashMap<>();
//    for (int number : nums) {
//      counts.put(number, counts.getOrDefault(number, 0) + 1);
//    }
//    return counts.entrySet().stream().filter(entry -> entry.getValue() == 2).map(Map.Entry::getKey).collect(Collectors.toList());
//  }
}
