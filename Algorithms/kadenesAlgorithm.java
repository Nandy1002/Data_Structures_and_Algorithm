/* 
 * This algorithm is used to get the largest subarray sum in a contigious array
 * Time Complexity - O(n)
 * Space Complexity - O(1)  
 */
public class kadenesAlgorithm {
    public static void main(String[] args) {
        // given array
        int a[] = { -1, 2, -2, 5, 7, -3, 1 };
        System.out.println(maxSubArray(a));
    }

    // kadene's algorithm
    static int maxSubArray(int a[]) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
