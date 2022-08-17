/*
 * Given an unsorted array A of size N that contains only non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 * In case of multiple subarrays, return the subarray which comes first on
 * moving from left to right.
 * 
 * Example 1:
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements from 2nd position to 4th positionis 12.
 * 
 * Example 2:
 * Input:
 * N = 10, S = 15
 * Output: 1 5
 * Explanation: The sum of elements from 1st position to 5th position is 15.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 */
//{ Driver Code Starts
    import java.util.*;
    
    class Main{
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int t = sc.nextInt();
   
                for (int i = 0; i < t; i++) {
                    int n = sc.nextInt();
                    int s = sc.nextInt();
   
                    int[] m = new int[n];
                    for (int j = 0; j < n; j++) {
                        m[j] = sc.nextInt();
                    }
                    
                    Solution obj = new Solution();
                    ArrayList<Integer> res = obj.subarraySum(m, n, s);
                    for(int ii = 0;ii<res.size();ii++)
                        System.out.print(res.get(ii) + " ");
                    System.out.println();
                }
            }
        }
    
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to find a continuous sub-array which adds up to a given number.
        ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
        {
            ArrayList<Integer> position = new ArrayList<>();
            int i = 0, j = 0;
            int sum = 0;
            while (j < n) {
            if (sum < s && i < n) {
                sum = sum + arr[i];
               if (sum == s) {
                   position.add(j+1);
                   position.add(i+1);
                   break;
               }
               i += 1;
            } else {
               sum = 0;
               j += 1;
               i = j;
           }
           if(j>=n) position.add(-1);
       }
           return position;
        }
    }