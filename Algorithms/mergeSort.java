/*
 * Merge Sort Algorithm
 * Worst Case Time complexity - O(nlogn)
 * Average Case Time complexity - O(nlogn)
 * Note:- We need to use two method here one for sort and another for merging (based on devide and conquer algo)
 */

public class mergeSort {
    public static void main(String[] args) {
        // the random unsorted array 
        int arr[] = {1, 23, 81, 8, 90, 12, 13, 41, 33, 2};
        merge_sort(arr,0,arr.length - 1);
        // after sort
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    // using recursion mergeSort algo (devide algo)
    public static void merge_sort(int[] arr, int low, int high) {
        if(low<high){
            int mid = (low+high)/2;
            merge_sort(arr, low, mid);
            merge_sort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    // mergeing the devided parts after sorting (conquer algo)
    private static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high-low+1];
        int k = 0;
        int i = low;
        int j = mid + 1;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        for(i=0,j=low;i<temp.length;i++,j++){
            arr[j] = temp[i];
        }
    }
}
