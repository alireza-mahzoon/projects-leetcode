package se.almstudio.projects.leetcode.service;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SquaresOfSortedArrayTest {
  @Test
  public void testSortedSquaresExpectExpectSquaredArray() {
    int[] numSample = {-4,-1,0,3,10};
    int[] numExpected = {0,1,9,16,100};
    int[] result;
    result = SquaresOfSortedArray.sortedSquares(numSample);

    // Option 1
    // One way to compare arrays
    Assert.assertArrayEquals(numExpected, result);
    // Option 2
    Assert.assertTrue(Arrays.equals(numExpected, result));
    // Option 3
    Assert.assertEquals(numExpected.length, result.length);
    for (int i = 0; i < numExpected.length; i++) {
      Assert.assertEquals(numExpected[i], result[i]);
    }
  }
}
