package se.almstudio.projects.leetcode.service;

import java.util.Arrays;

public class SortArrayByParity {

  public static int[] sortArrayByParity(int[] A) {

    int[] sortArrayByParity;

    int countEven = 0;
    int countOdd = 0;
    int counterEven = 0;
    int counterOdd = 0;

    for(int i = 0; i < A.length; i++) {
      if(A[i]%2==0) {
        countEven++;
      }
    }

    for(int i = 0; i < A.length; i++) {
      if(A[i]%2!=0) {
        countOdd++;
      }
    }

    int[] sortEven = new int[countEven];
    int[] sortOdd = new int[countOdd];

    for (int i = 0 ; i<A.length; i++) {
      if(A[i]%2 == 0) {
        sortEven[counterEven] = A[i];
        counterEven++;
      }
    }

    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 != 0) {
        sortOdd[counterOdd] = A[i];
        counterOdd++;
      }
    }

//   System.arraycopy(sortEven, 0, sortArrayByParity, 0, sortEven.length);
//   System.arraycopy(sortOdd, 0, sortArrayByParity, sortEven.length, sortOdd.length);

    sortArrayByParity = concat(sortEven, sortOdd);

    System.out.println(countEven);
    System.out.println(countOdd);
    System.out.println(Arrays.toString(sortEven));
    System.out.println(Arrays.toString(sortOdd));
    System.out.println(Arrays.toString(sortArrayByParity));

    return sortArrayByParity;
  }

  public static int[] concat(int[] array1, int[] array2) {
    int array1Length = array1.length;
    int array2Length = array2.length;
    int[] concat = new int[array1Length + array2Length];

    System.arraycopy(array1,0, concat, 0, array1Length);
    System.arraycopy(array2,0, concat, array1Length, array2Length);

    return concat;
  }
}
