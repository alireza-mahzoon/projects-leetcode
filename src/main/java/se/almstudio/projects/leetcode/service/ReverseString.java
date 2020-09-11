package se.almstudio.projects.leetcode.service;

public class ReverseString {
  public static void reverseString(char[] array) {
    for(int i=0; i<array.length/2; i++){
      char temp = array[i];
      array[i] = array[array.length-i-1];
      array[array.length-i-1] = temp;
    }
  }
}
