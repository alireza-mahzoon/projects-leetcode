package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {

    List<Character> sList = new ArrayList<>();
    List<Character> tList = new ArrayList<>();
    boolean result = true;

    for (char character : s.toCharArray()) {
      sList.add(character);
    }

    for (char character : t.toCharArray()) {
      tList.add(character);
    }

    for (int i = 0; i < sList.size(); i++) {
      if (!tList.contains(tList.get(i))) {
        result = false;
      }
    }
    
    return result;
  }
}
