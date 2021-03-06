package com.Practice;
import java.util.HashSet;

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
		if(checkDuplicates(arr,2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
