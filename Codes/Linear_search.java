//Linear search
//element present in array

public class Linear_search {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int k=5;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == k){
				System.out.println("Element found at Index " +i);
			}
			
		}
		System.out.println("Element not found");
	}
	
}
