
public class Merge_sort {

	
	public void mergeSort(int arr[], int lowindex, int highindex){
		if(lowindex < highindex){
			int midindex = (lowindex+highindex)/2;
			mergeSort(arr,lowindex,midindex);
			mergeSort(arr,midindex+1,highindex);
			merge(arr,lowindex,midindex,highindex);
		}
	}
	
	void merge(int arr[], int lowindex, int midindex, int highindex){
		int left[] = new int[midindex-lowindex+2];
		
		//copy elements to temp arrays
		for(int i=lowindex;i<=midindex;i++){
			left[i-lowindex] = arr[i];
			}
		left[midindex-lowindex+1] = Integer.MAX_VALUE;
		int[] right = new int[highindex-midindex+1];
		
		for(int i=lowindex;i<=midindex;i++){
			right[i-midindex-1] = arr[i];
		}
		right[highindex - midindex] = Integer.MAX_VALUE;
		int i=0,j=0;
		
		for(int k=lowindex;k<=highindex;k++){
			if(left[i]<= right[i]){
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
		}
	}
	
	static void printArray(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,11,13,5,7,6};
		System.out.println("Given array");
		printArray(arr);
		Merge_sort ob = new Merge_sort();
		ob.mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted array");
		printArray(arr);
		
	}

}
