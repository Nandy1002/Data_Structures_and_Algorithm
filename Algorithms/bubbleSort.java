/*
 * Bubble Sort Algorithm
 * Time Complexity - O(n^2)
 * Space Complexity -  O(1)
 */
public class bubbleSort {
    public static void main(String[] args) {
         // the random unsorted array of 0 1 2
         int arr[] = {1, 23, 81, 8, 90, 12, 13, 41, 33, 0};
         bubble_sort(arr);
         // after sort
         for (int e : arr) {
             System.out.print(e + " ");
         }
         System.out.println();
     }
     // bubble sort algorithm method implementation
     static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length - i - 1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
     }
}
