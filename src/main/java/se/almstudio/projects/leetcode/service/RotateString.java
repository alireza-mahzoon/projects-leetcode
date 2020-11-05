package se.almstudio.projects.leetcode.service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateString {
  public static boolean rotateString(String A, String B) {
    //Solution one
    String C = A + A;
    if (A.length() == B.length() && C.contains(B)) {
      return true;
    } else {
      return false;
    }
  }
}
