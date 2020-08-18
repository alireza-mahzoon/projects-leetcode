package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeSortArray {

  public static int[] relativeSortArray(int[] arr1, int[] arr2) {
    //int[] sorted = new int[arr1.length];
    List <Integer> sorted = new ArrayList<>();
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr1.length; j++) {
        if (arr1[j] == arr2[i]) {
          //sorted[j] = arr1[j];
          sorted.add(arr1[j]);
        }
      }
    }

    List<Integer> arrayoneList = new ArrayList<>();
    for(int i =0; i<arr1.length; i++) {
      arrayoneList.add(arr1[i]);
    }

    List<Integer> seprated = new ArrayList<>();

    for (int i = 0; i<arr1.length; i++) {
      if(!sorted.contains(arr1[i])) {
        seprated.add(arr1[i]);
        Collections.sort(seprated);
      }
    }

    List<Integer> finalSorted = new ArrayList<>();
    finalSorted.addAll(sorted);
    finalSorted.addAll(seprated);


    int[] sortedArray = new int[finalSorted.size()];

    for(int i = 0; i < finalSorted.size(); i++) {
      sortedArray[i] = finalSorted.get(i);
    }

    System.out.println(Arrays.toString(sortedArray));
    return sortedArray;
  }
}


