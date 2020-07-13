package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLuckyInteger {
  public static int findLucky(int[] arr) {

    int luckyNumber = -1;

    List<Integer> numbers = new ArrayList<>();
    List<Integer> resultList = new ArrayList<>();
    List<Integer> luckyNumbersList = new ArrayList<>();
    int result;

    for (int i=0; i<arr.length; i++) {
      numbers.add(arr[i]);
    }

    for(int i = 0; i<arr.length; i++) {
      result = Collections.frequency(numbers,numbers.get(i));
      if(result==numbers.get(i)) {
        luckyNumbersList.add(numbers.get(i));
      }
    }

    System.out.println(luckyNumbersList);

    if(luckyNumbersList.size()>=1){
      luckyNumber = Collections.max(luckyNumbersList);
    }

    System.out.println(luckyNumber);
    return luckyNumber;
  }
}
