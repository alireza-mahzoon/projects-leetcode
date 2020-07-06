package se.almstudio.projects.leetcode.service;

import org.junit.Assert;
import org.junit.Test;

public class MonotonicArrayTest {
  @Test
  public void testMonotonicExpectedTrueOrFalse() {
    int[] numSampleOne = {1,2,2,3,2};
    boolean resultOne = MonotonicArray.monotonic(numSampleOne);
    Assert.assertFalse(resultOne);
    int[] numSampleTwo = {6,5,4,4};
    boolean resultTwo = MonotonicArray.monotonic(numSampleTwo);
    Assert.assertTrue(resultTwo);
  }
}
