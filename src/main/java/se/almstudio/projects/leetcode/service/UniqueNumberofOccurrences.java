package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberofOccurrences {
  public boolean uniqueOccurrences(int[] arr) {
    boolean result = true;
    List<Integer> occurrence = new ArrayList<>();
    Map<Integer, Integer> numbers = new HashMap<>();

    for (int value : arr) {
      if (numbers.containsKey(value)) {
        numbers.put(value, numbers.get(value) + 1);
      } else {
        numbers.put(value, 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
      if (!occurrence.contains(entry.getValue())) {
        occurrence.add(entry.getValue());
        result = true;
      } else {
        result = false;
        break;
      }
    }
    return result;
  }
}

