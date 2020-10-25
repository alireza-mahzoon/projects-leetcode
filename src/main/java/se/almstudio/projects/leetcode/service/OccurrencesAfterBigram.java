package se.almstudio.projects.leetcode.service;


import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {

  public static String[] findOcurrences(String text, String first, String second) {

    List<String> resultList = new ArrayList<>();
    String[] splits = text.split(" ");

    for (int i = 0; i < splits.length -2; i++) {
      if((splits[i].equals(first) ) && (splits[i+1].equals(second))) {
        resultList.add(splits[i+2]);
      }
    }

    String[] resultArray = new String[resultList.size()];

    for(int i = 0; i<resultArray.length; i++) {
      resultArray[i] = resultList.get(i);
    }

    for (String x : resultArray) {
      System.out.println(x);
    }
    return resultArray;
  }
}
