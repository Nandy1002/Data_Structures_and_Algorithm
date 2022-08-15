public class array{
	public static void main(String args[]){
		// Array is collections of items at contigious memory locations.
		// and array must contain each elements of same data type
		
		int arr[] = new int[10]; // declation of array with reserving 4*10 bytes of space.
		
		arr[1] = 23;
		arr[4] = 12;
		arr[2] = 8;
		arr[3] = 90;
		arr[7] = 33;
		//traversal 
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
		
