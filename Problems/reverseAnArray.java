public class reverseAnArray {
    public static void main(String[] args) {
        //declaration of an array with size of 5 elements
        int arr[] = new int[5];
        
        //adding elements in the array
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 45;
        arr[4] = 56;
        
        //traverse before reversing
        System.out.println("The array before reversing : ");
        traverse(arr);
        
        //traverse after reversing
        System.out.println("The array after reversing");
        reverse(arr);
        traverse(arr);
    }
    // traverse function
    static void traverse(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    // reverse function
    static int[] reverse(int a[]){
        int temp;
        for(int i=0; i<a.length/2; i++){
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }
}
