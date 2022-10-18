package sort;

import java.util.Arrays;

/**
 * Write a description of class Quick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selection
{
  
  /**
   * Returns the sorted array
   */
  public static int[] sort(int[] arr) {
    // Your algorithm goes here!
    int arr2 [] = arr;
    int winner = arr2[0];
    int holder;
    int postion= 0;
    for (int i=0; i<arr2.length-1; i++) {
        for (int a=i; a<arr2.length-1; a++) {
            if(arr2 [a+1] < arr2 [a] && arr2 [a+1] < winner){
                winner = arr2 [a+1]; 
                postion = a+1;
            }
        }
        holder = arr [i];
        for (int k=postion; k>postion+i; k--) {
            arr2 [k] = arr [k-1];
        }
        arr[i+1] = holder;
        arr2 [i] = winner; 
        winner = arr2 [i+1];
    }
    return arr2;
  }
  
  public static void main(String[] args) {
    int [] arr = {10,9,8,7,6,5,4,3,2,1};
    int[] arr2 = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};
    // 1,4,3,2,1
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
    for (int i=0; i<arr.length-1; i++) {
        System.out.print(arr[i]+",");
    }
  }
}
