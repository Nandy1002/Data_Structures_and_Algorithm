/**
 * Dutch National Flag Sort or Sort 012 algorithm
 * this algorithm only apply for the array which has ony 3 elements
 */
public class DNFsort {
    public static void main(String[] args) {
        // the unsorted array of 0 1 2
        int arr[] = { 1, 0, 2, 0, 1, 0, 1, 1, 2, 0 };
        dnfSort(arr);
        // after sort
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    // swapping function for array
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Dutch National Flag Algorithm
    static void dnfSort(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
}