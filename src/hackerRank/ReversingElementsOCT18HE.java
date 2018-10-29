package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversingElementsOCT18HE {
	
	
	public static void reverseArray(int l,int r,int[] arr){
//		for(int i=l;i<r;i++){
//			int temp = arr[i];
//			arr[i] = arr[r];
//			arr[r] = temp;
//		}
		
		
		arr[l] = (arr[l] + arr[r]) - (arr[r] = arr[l]);
		System.out.println(maxSumSubarray(arr));
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	
	
	public static int maxSumSubarray(int arr[]){
		int max_so_far = arr[0];
		int max_ending_here = 0;
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			max_ending_here = max_ending_here + arr[i];
			if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
			}
			if(max_ending_here < 0){
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sizeOfArray = in.nextInt();
		int queries = in.nextInt();
		int[] arr = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			arr[i] = in.nextInt();
		}
		
		for(int i=0;i<queries;i++){
			int l = in.nextInt();
			int r = in.nextInt();
			reverseArray(l-1,r-1,arr);
		}
		in.close();

	}

}
