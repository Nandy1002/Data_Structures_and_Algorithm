/*
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in
 * ascending order.
 * 
 * Input:
 * N = 5
 * arr[]= {0 2 1 2 0}
 * Output: 
 * 0 0 1 2 2
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * link - https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 */
//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public void sort012(int a[], int n)
    {
        Arrays.sort(a);
    }
}

//{ Driver Code Starts.

class GFG2 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends