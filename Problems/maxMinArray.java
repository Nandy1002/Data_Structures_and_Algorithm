import java.util.*;

public class maxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        sumMaxMin(a);
   } 
   // min-max function
   static void sumMaxMin(int a[]){
    int max = a[0];
    int min = a[0];
    int sum = 0;
    for(int i=0; i<a.length; i++){
        if(max<a[i]){
            max = a[i];
        }
        if(min>a[i]){
            min = a[i];
        }
    }
    sum = max + min;
    System.out.println("Max element : "+max);
    System.out.println("Min element : "+min);
    System.out.println("Sum of Max and Min is : "+sum);
   }
}
