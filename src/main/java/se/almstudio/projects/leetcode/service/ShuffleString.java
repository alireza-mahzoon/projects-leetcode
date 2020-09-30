package se.almstudio.projects.leetcode.service;

public class ShuffleString {
  public static String restoreString(String s, int[] indices) {

    String finalWord = "";
    char[] finalWordArray = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      finalWordArray[indices[i]] = s.charAt(i);
    }

    for (int i = 0; i<finalWordArray.length; i++) {
      finalWord = finalWord +finalWordArray[i];
    }

    return finalWord;
  }
}
