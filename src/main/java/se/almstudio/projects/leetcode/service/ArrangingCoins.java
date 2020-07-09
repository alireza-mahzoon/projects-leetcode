package se.almstudio.projects.leetcode.service;

public class ArrangingCoins {

  public static void staircase(int[] nums) {
    int count = 0;
    for(int i = 0; i<nums.length; i++) {
      for(int j = 0; j<i; j++) {
        if(count<nums.length)
          System.out.print("*");
        count++;
      }
      System.out.println();
    }
  }
}
