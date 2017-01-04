//Binary Search
//element present in array

class bin_search{
	
	int binary_search(int arr[],int left,int right,int k){
		int mid = left+(right-left)/2;
		
		if(right >1)
		{
			if(arr[mid]==k){
				return mid;
			}
			if(arr[mid]>k){
				return binary_search(arr,left,mid-1,k);
			}
			return binary_search(arr,mid+1,right,k);
	}
		return -1;
	
}

	public static void main(String[] args){
		bin_search ob= new bin_search();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int k=4;
		int n=arr.length;
		int result = ob.binary_search(arr,0,n,k);
		if(result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+result);
	}

}
