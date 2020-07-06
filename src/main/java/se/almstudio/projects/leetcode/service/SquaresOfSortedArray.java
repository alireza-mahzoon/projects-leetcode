package se.almstudio.projects.leetcode.service;

import java.util.Arrays;

public class SquaresOfSortedArray {
  public static int[] sortedSquares(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * numbers[i];
    }
    Arrays.sort(numbers);
    return numbers;
  }
}
