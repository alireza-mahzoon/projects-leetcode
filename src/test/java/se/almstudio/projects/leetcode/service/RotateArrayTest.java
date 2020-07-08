package se.almstudio.projects.leetcode.service;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

  @Test
  public void testRotateArrayExpectRotateArray() {
    int[] numSample = {1,2,3,4,5,6,7};
    int [] resultOneExpected = {7,1,2,3,4,5,6};
    int [] resultTwoExpected = {6,7,1,2,3,4,5};
    int [] resultThreeExpected = {5,6,7,1,2,3,4};
    int[] resultOne;
    int[] resultTwo;
    int[] resultThree;

    resultOne = RotateArray.rotate(numSample, 1);
    resultTwo = RotateArray.rotate(numSample, 2);
    resultThree = RotateArray.rotate(numSample, 3);

    Assert.assertArrayEquals(resultOneExpected, resultOne);
    Assert.assertArrayEquals(resultTwoExpected, resultTwo);
    Assert.assertArrayEquals(resultThreeExpected, resultThree);
  }
}
