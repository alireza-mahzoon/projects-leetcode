package se.almstudio.projects.leetcode.service;

import org.junit.Assert;
import org.junit.Test;

public class PeakIndexMountainArrayTest {

  @Test
  public void testPeakIndexOfMountainArrayExpectElementIndex() {

    int[] numSampleOne = {0,1,0};
    int[] numSampleTwo = {0,2,1,0};
    int resultOneExpected = 1;
    int resultTwoExpected =1;
    int resultOne;
    int resultTwo;

    resultOne = PeakIndexMountainArray.peakIndexOfMountainArray(numSampleOne);
    resultTwo = PeakIndexMountainArray.peakIndexOfMountainArray(numSampleTwo);

    Assert.assertEquals(resultOneExpected, resultOne);
    Assert.assertEquals(resultTwoExpected, resultTwo);
  }
}
