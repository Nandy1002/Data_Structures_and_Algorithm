/*
 * Quick Sort Algorithm
 * Worst Case Time complexity - O(n^2)
 * Average Case Time complexity - O(nlogn)
 * Note:- Worst case occurs when pivot is always the smallest or the largest element.
 */

public class quickSort {
    public static void main(String[] args) {
        // the random unsorted array of 0 1 2
        int arr[] = {1, 23, 81, 8, 90, 12, 13, 41, 33, 2};
        quick_sort(arr,0,arr.length - 1);
        // after sort
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // make a partition wtih the pivot as the last element and return the new index
    public static int partition(int arr[], int low, int high){
        // pivot
    int pivot = arr[high]; 
      
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
          
        // If current element is smaller 
        // than the pivot
        if (arr[j] < pivot) 
        {
              
            // Increment index of 
            // smaller element
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
    }

    // quick sort algorithm method implementation
    public static void quick_sort(int[] arr, int low, int high) {
        if (low < high) 
    {
          
        // pi is partitioning index, arr[p]
        // is now at right place 
        int pi = partition(arr, low, high);
  
        // Separately sort elements before
        // partition and after partition
        quick_sort(arr, low, pi - 1);
        quick_sort(arr, pi + 1, high);
    }
    } 

}
