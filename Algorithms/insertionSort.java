/**
 * Insertion Sort Algorithm
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class insertionSort {
    public static void main(String[] args) {
        // the random unsorted array 
        int arr[] = {1, 23, 81, 8, 90, 12, 13, 41, 33, 0};
        insertion_Sort(arr);
        // selection_Sort(arr);
        // after sort
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    // implementing insertion sort algo method
    static void insertion_Sort(int a[]){
       for(int i=0;i<a.length;i++){
            int current = a[i];
            int j = i - 1;
            while( j>= 0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
       }
    }
}