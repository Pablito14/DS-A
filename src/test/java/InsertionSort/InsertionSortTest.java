package InsertionSort;

import org.junit.Test;

import static InsertionSort.InsertionSort.insertionSort;
import static org.junit.Assert.*;

public class InsertionSortTest {

  @Test
  public void insertionSortTest() {
    int[] myArr = {6,2,-1,8,1,4,5,0,3,7,9,0};
    int[] sorted = {-1,0,0,1,2,3,4,5,6,7,8,9};
    assertArrayEquals("Should return sorted",sorted, insertionSort(myArr));

  }
}