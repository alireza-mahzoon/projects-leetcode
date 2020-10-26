package se.almstudio.projects.leetcode.service;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsFromString {
  public static String removeVowel(String s) {
    Set<Character> vowels = new HashSet<>();
    vowels.add('e');
    vowels.add('a');
    vowels.add('u');
    vowels.add('i');
    vowels.add('o');

    StringBuilder result = new StringBuilder();

    for (Character x: s.toCharArray()) {
      if (!vowels.contains(x)) {
        result.append(x);
      }
    }
    return result.toString();
  }
}
