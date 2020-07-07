package se.almstudio.projects.leetcode.service;

import org.junit.Assert;
import org.junit.Test;

public class MonotonicArrayTest {
  @Test
  public void testMonotonicExpectedTrueOrFalse() {
    int[] numSampleOne = {2,4,2,5,2};
    boolean resultOne = MonotonicArray.monotonic(numSampleOne);
    Assert.assertFalse(resultOne);
    int[] numSampleTwo = {1,3,7};
    boolean resultTwo = MonotonicArray.monotonic(numSampleTwo);
    Assert.assertTrue(resultTwo);
  }
}
