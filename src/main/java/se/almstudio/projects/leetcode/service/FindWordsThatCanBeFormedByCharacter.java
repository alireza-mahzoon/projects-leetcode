package se.almstudio.projects.leetcode.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsThatCanBeFormedByCharacter {
  public static <list> int countCharacters(String[] words, String chars) {

    int numberOfCharacter = 0;

    List<Character> charsList = new ArrayList<>();
    List<Character> wordList = new ArrayList<>();
    List<String> wordsList = new ArrayList<>(Arrays.asList(words));

    for (int i = 0; i<chars.length(); i++) {
      charsList.add(chars.charAt(i));
    }

    for (String word: words) {
      for (int i = 0; i<word.length(); i++) {
        wordList.add(word.charAt(i));
        if (!charsList.contains(word.charAt(i))) {
          wordsList.remove(word);
          break;
        }
      }
    }

    for (String word: wordsList) {
      numberOfCharacter = word.length() + numberOfCharacter;
    }

    System.out.println(Arrays.toString(wordsList.toArray()));
    System.out.println(numberOfCharacter);

    return numberOfCharacter;
  }
}
