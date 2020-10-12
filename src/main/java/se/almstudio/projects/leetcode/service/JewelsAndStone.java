package se.almstudio.projects.leetcode.service;

import java.util.HashSet;

public class JewelsAndStone {
  public int numJewelsInStones(String J, String S) {

    HashSet<Character> jewels = new HashSet<>();
    for (char character: J.toCharArray()) {
      jewels.add(character);

    }

    int count = 0;

    for (char character: S.toCharArray()) {
      if (jewels.contains(character)) {
        count++;
      }
    }
    return count;
  }
}
