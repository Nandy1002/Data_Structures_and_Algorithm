/*
 * Partition Algorithm
 */

import java.util.Scanner;

class test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            // adding elements in the array
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            // print the index of the pivot of arr array
            System.out.println(partition(arr,0,arr.length-1));

            //array after partition is complete
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }    
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
}
