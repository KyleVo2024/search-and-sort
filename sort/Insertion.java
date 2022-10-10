package sort;

import java.util.Arrays;

/**
 * Write a description of class Insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Insertion
{
  
  /**
   * Returns the sorted array
   */
  public static int[] sort(int[] arr) {
    // Your algorithm goes here!
    int[] arr2 = arr;
    int savePoint = 0;
    int i1 = 0;
    int i0 = 0;
    int[] done; 
    for (int i=1; i<arr2.length; i++) {
      if (arr2[i] < arr2[i-1]) {
        savePoint = i;
        i1 = arr2[i];
        i0 = arr2[i-1] ;
        arr2[i] = i0;
        arr2[i-1] = i1;
        if (i == 1)
        {
            i=i-1;
        }
        else
        {
            i=i-2;    
        }
      }
    }
    done = arr2;
    return done;
  }
  
  public static void main(String[] args) {
    //int [] arr = {10,9,8,7,6,5,4,3,2,1};
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};    
    
    // Test the sort
    testSort(sort(arr));
  }
  
  public static void testSort(int[] arr) {
    for (int i=0; i<arr.length-1; i++) {
      if (arr[i] > arr[i+1]) {
        System.out.println("FAIL at index "+i);
        System.out.println(Arrays.toString(arr));
        return;
      }
    }
    System.out.println("SUCCESS!");
  }

}
