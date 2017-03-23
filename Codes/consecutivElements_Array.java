//Given an unsorted array of numbers, write a function that returns true if array consists of consecutive numbers.

public class consecutivElements_Array {
	
	int getMin(int arr[], int n){
		int min = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	int getMax(int arr[], int n){
		int max = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	
	boolean areConsecutive(int arr[], int n){
		if(n<1)
			return false;
		
		int min = getMin(arr, n);
		int max = getMax(arr, n);
		
		if(max - min + 1 == n){
			boolean visited[] = new boolean[n];
			int i;
			for(i=0;i<n;i++){
				if(visited[arr[i] - min] != false)
					return false;
				
				visited[arr[i] - min] = true;
			}
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consecutivElements_Array cea = new consecutivElements_Array();
		int arr[] = {5,6,1,3,2,4};
		int n = arr.length;
		
		if(cea.areConsecutive(arr, n) == true)
			System.out.println("Array Elements are consecutive");
		else
			System.out.println("Array Elements are not consecutive");

	}

}
