package se.almstudio.projects.leetcode.service;

public class SumOfAllOddLengthSubarrays {
  public int sumOddLengthSubarrays(int[] arr) {

    int n = arr.length;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        for (int k = i; k <= j; k++) {
          if ((j - i + 1) % 2 != 0) {
            sum = arr[k] + sum;
          }
        }
      }
    }
    return sum;
  }
}
