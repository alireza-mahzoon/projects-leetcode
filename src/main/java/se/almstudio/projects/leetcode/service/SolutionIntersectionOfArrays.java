package se.almstudio.projects.leetcode.service;

import java.util.*;

public class SolutionIntersectionOfArrays {
  public static int[] intersection(int[] nums1, int[] nums2) {
    
    Map<Integer, Integer> result = new HashMap<>();
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if (nums2[j] == nums1[i]) {
          result.put(nums2[j],nums1[i]);
        }
      }
    }

    int[] resultArray = new int[result.size()];
    List<Integer> resultList = new ArrayList<>();
    for (Integer i : result.values()) {
      resultList.add(result.get(i));
    }

    for (int i = 0; i<result.size(); i++) {
      resultArray[i] = resultList.get(i);
    }
    return resultArray;



    /*
    Set<Integer> set = new HashSet<>();
    for (int i : nums1) {
      set.add(i);
    }

    List<Integer> result = new ArrayList<>();

    for (int i : nums2) {
      if(set.contains(i)){
        result.add(i);
        set.remove(i);
      }
    }

    int[] ints = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      ints[i]=result.get(i);
    }
    System.out.println(Arrays.toString(ints));
    return ints;

     */
  }
}
