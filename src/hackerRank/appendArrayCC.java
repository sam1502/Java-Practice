package hackerRank;

public class appendArrayCC {
	
	public static void append(int arr[],String arr1[]){
		String arr2[] = new String[arr.length];
		
		
		if(arr.length == arr1.length){
		for(int i=0;i<arr.length;i++){
			arr2[i] = arr[i]+arr1[i] + ",";
		}
	}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr2[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		String arr1[] = {"a","b","c"};
		
		append(arr,arr1);

	}

}
