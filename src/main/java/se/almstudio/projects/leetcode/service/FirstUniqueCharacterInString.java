package se.almstudio.projects.leetcode.service;

public class FirstUniqueCharacterInString {
  public static int firstUniqueChar(String s) {
    for (int i = 0; i < s.length(); i++) {
      boolean duplicateElement = false;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j) && (i != j)) {
          duplicateElement = true;
          break;
        }
      }
      if (!duplicateElement) return i;
    }
    return -1;
  }
}
