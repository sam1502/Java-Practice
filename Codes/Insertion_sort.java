public class Insertion_sort {
	void sort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	void printarray(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
public static void main(String[] args) {
		Insertion_sort ob = new Insertion_sort();
		int arr[] = {12,11,13,5,6,1,8};
		ob.sort(arr);
		ob.printarray(arr);
	}
}