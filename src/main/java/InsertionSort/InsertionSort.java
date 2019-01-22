package InsertionSort;

public class InsertionSort {

  //returns a new array from the input
  public static int[] insertionSort(int[] unsortedArray){

    //loop through the whole array (except the first)
    for(int i = 1; i < unsortedArray.length; i++){
      int j = i - 1;
      int temp = unsortedArray[i];

      while (j >= 0 && temp < unsortedArray[j]){
          unsortedArray[j + 1] = unsortedArray[j];
          j = j - 1;
      }
      unsortedArray[j + 1] = temp;
    }
    return unsortedArray;
  }
}
