public class array{
	public static void main(String args[]){
		// Array is collections of items at contigious memory locations.
		// and array must contain each elements of same data type
		
		int arr[] = new int[10]; // declation of array with reserving 4*10 bytes of space.
		
		// adding elemnts in the array
		arr[0] = 1;
		arr[1] = 23;
		arr[4] = 12;
		arr[2] = 8;
		arr[3] = 90;
		arr[7] = 33;
		arr[6] = 41;
		arr[5] = 13;
	
		//traversal
		System.out.println("traversing the array");
		traversel(arr);	
		
		//insertion
		System.out.println("inserting 81 in index 2");
		insertion(arr, 2, 81);
		traversel(arr);

		//deletion
		System.out.println("Deleting the element on index 3");
		deletion(arr, 3);
		traversel(arr);

		//Linear Search
		if(linearSearch(arr, 23)){
			System.out.println("Element Found");
		}else{
			System.out.println("Element not found");
		}
	}
	// traverse function
	static void traversel(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//bestCase = worstCase = O(n)
	}
	// insertion function at any index
	static void insertion(int a[],int index,int element){
		for(int i = a.length-1; i>index;i--){
			a[i] = a[i-1]; 
		}
		a[index] = element;
		//bestCase = O(1)
		//worstCase = O(n)
	}
	// deletion function at any index
	static void deletion(int a[], int index){
		for(int i=index;i<a.length-1;i++){
			a[i] = a[i+1];
		}
		// bestCase - O(1)
		// worstCase - O(n)
	}
	// linearSearch function for any element
	static boolean linearSearch(int a[],int element){
		for(int i=0;i<a.length;i++){
			if(a[i] == element){
				return true;
			}
		}
		return false;
		// bestCase - O(1)
		// worstCase - O(n)
	}
}
		
