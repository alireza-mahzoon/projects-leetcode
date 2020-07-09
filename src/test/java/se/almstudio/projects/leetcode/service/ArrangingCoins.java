package se.almstudio.projects.leetcode.service;

public class ArrangingCoins {

  public static void staircase(int[] nums) {
    for(int i = 0; i<nums.length; i++) {
      for(int j=1; j<=i+1; j++) {
        System.out.println("*");
      }
    }
  }
}
