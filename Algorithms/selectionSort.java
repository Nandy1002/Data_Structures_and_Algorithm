/*
 * Selection Sort Algorithm - 
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 */
public class selectionSort {
    public static void main(String[] args) {
        // the random unsorted array 
        int arr[] = {1, 23, 81, 8, 90, 12, 13, 41, 33, 0};
        selection_Sort(arr);
        // selection_Sort(arr);
        // after sort
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    // Implementing selection sort algorithm 
    static void selection_Sort(int a[]){
        int min = 0;        
        for(int i=0;i<a.length;i++){
            for(int j = i+1;j<a.length-1;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}