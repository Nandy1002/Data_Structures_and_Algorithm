public class binSearchArray {
    public static void main(String[] args) {
        // testCase array
        int a[] = { 1, 3, 5, 8, 10, 13, 22, 34 };
        // testCase key
        int key = 3;
        //calling out binarySearch Method
        System.out.println(binarySearch(a, key, 0, a.length - 1));
    }
    // implementing the binary Search method using recursion
    // time complexity O(logN)
    static int binarySearch(int a[], int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low <= high) {
            if (a[mid] == key) {
                return mid;
            }
            if (a[mid] < key) { 
                return binarySearch(a, key, mid + 1, high);
            } else {
                return binarySearch(a, key, low, mid - 1);
            }
        } else {
            return -1;
        }
    }
}
