/*
 * Given an array arr[] and an integer K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array. It is given
 * that all array elements are distinct.
 * 
 * Input:
 * N = 6
 * arr[] = 7 10 4 3 20 15
 * K = 3
 * Output : 7
 * Explanation :
 * 3rd smallest element in the given
 * array is 7.
 * 
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(log(n))
 * Constraints:
 * 1 <= N <= 105
 * 1 <= arr[i] <= 105
 * 1 <= K <= N
 * 
 * Your Task:
 * You don't have to read input or print anything. Your task is to complete the function
 *  kthSmallest() which takes the array arr[], integers l and r denoting the starting and
 * ending index of the array and an integer K as input and returns the Kth smallest element.
 * 
 * Source - https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
 */
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            PrintWriter out = new PrintWriter(System.out);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int arr[] = new int[n];

                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();

                int k = sc.nextInt();
                Solution ob = new Solution();
                out.println(ob.kthSmallest(arr, 0, n - 1, k));
            }
            out.flush();
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    // partition function
    static public int partition(int a[],int low, int high){
        int pivot = a[high]; // the last element of the array is pivot
        int pi = low,temp; // setting pivotindex (pi) as start = 0
        // traverse the array till the end
        for(int i=low;i<high;i++){
            // if ith element is small than pivot element then swap the pivot index with 
            // the ith element and increment pivot index by 1, otherwise just incrementing i
            if(a[i]<pivot){
                temp = a[pi];
                a[pi] = a[i];
                a[i] = temp;
                pi++;
            }
        }
        // when the loop ended swap the last element with the pivotindex
        temp = a[high];
        a[high] = a[pi];
        a[pi] = temp;
        
        //returning the pivotindex
        return pi;
    }
    public int kthSmallest(int[] arr, int low, int high, int k) {
        int kthsmallindex = partition(arr, low, high);
        // if the pivotindex is equal to k then thats the answer index
        if(kthsmallindex == k){
            return arr[kthsmallindex];
        } else if(kthsmallindex > k){
            // if pivotindex is grater than kth index then return the partition
            // from low to pivotindex - 1
            return kthSmallest(arr, low, kthsmallindex-1, k);
        } else { 
            // if pivotindex is smaller than kth index then return the partition
            // from pivotindex + 1 to high
            return kthSmallest(arr, kthsmallindex+1, high, k);
        }
    }
}
