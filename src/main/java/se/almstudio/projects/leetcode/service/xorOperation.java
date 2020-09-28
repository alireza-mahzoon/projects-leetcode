package se.almstudio.projects.leetcode.service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class xorOperation {
  public static int xorOperation(int n, int start) {

    List<Integer> numbers = new ArrayList<>();
    int countXOR = 0;

    for (int i = 0; i<n; i++) {
      numbers.add(i, start + 2*i);
      countXOR = numbers.get(i) ^ countXOR;
    }

    return countXOR;
  }
}
