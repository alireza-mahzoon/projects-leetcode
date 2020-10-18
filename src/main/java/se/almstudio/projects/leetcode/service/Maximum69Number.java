package se.almstudio.projects.leetcode.service;

public class Maximum69Number {
  public static int maximum69Number(int num) {
    int length = String.valueOf(num).length();
    int[] numArray = new int[length];
    int Q = num;
    int R;
    int count = 0;
    int result = 0;
    while (Q != 0) {
      R = Q % 10;
      Q = Q / 10;
      numArray[length - count - 1] = R;
      count++;
    }

    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] == 6) {
        numArray[i] = 9;
        break;
      }
    }

    for (int i = 0; i < numArray.length; i++) {
      result = numArray[i] * (int) Math.pow(10, numArray.length - i - 1) + result;
    }
    return result;
  }
}
