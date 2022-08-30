/*
 * Bubble Sort Algorithm
 * Time Complexity - O(n^2)
 * Space Complexity -  O(1)
 */
public class bubbleSort {
    public static void main(String[] args) {
         // the unsorted array of 0 1 2
         int arr[] = { 1, 3, 5, 8, 10, 13, 22, 34 };
         bubble_sort(arr);
         // after sort
         for (int e : arr) {
             System.out.print(e + " ");
         }
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
