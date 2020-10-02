package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;

public class RemoveAdjacentDuplicateInString {

  public static String removeDuplicates(String S) {

    char[] finalArray = new char[S.length()];
    ArrayList<Character> finalArrayList = new ArrayList<Character>();
    int i = 0;

    for (int j = 0; j < S.length(); j++) {
      char currentChar = S.charAt(j);

      if (i>0 && finalArray[i-1] == currentChar) {
        i--;
      } else {
        finalArray[i] = currentChar;
        i +=1;
      }
    }
    return new String(finalArray, 0, i);
  }
}
