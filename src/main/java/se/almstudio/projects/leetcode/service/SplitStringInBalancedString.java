package se.almstudio.projects.leetcode.service;

public class SplitStringInBalancedString {
  public int balancedStringSplit(String s) {
    int countLeft = 0;
    int countRight = 0;
    int countBalance = 0;

    char[] characterArray = s.toCharArray();

    for (char character: characterArray) {
      if (character=='L') {
        countLeft++;
      }
      if (character=='R') {
        countRight++;
      }
      if (countLeft == countRight) {
        countBalance++;
      }
    }
    return countBalance;
  }
}
