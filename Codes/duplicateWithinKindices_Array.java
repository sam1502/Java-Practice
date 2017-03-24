import java.util.HashSet;

//Given an unsorted array that may contain duplicates.
//Also given a number k which is smaller than size of array.
//Write a function that returns true if array contains duplicates within k distance.

public class duplicateWithinKindices_Array {
	
	static boolean checkDuplicates(int arr[], int k){
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i]))
				return true;
			set.add(arr[i]);
			if(i >= k)
				set.remove(arr[i-k]);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,4,6,7,5,6};
		if(checkDuplicates(arr, 3))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
