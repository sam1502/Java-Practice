//Simple Java code for bubble sort.

public class Bubble_sort {
	
	void sort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]> arr[j+1]){
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
			}
		}
	}
}
	
	void printarray(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+ " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Bubble_sort ob = new Bubble_sort();
		int arr[] = {64,34,14,22,15,78,92};
		ob.sort(arr);
		System.out.println("Sorted Array");
		ob.printarray(arr);
		}
	}
