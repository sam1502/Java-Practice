package com.Practice;

//Given a sorted list of integers, square the elements and give the output in sorted order.


import java.util.Arrays;

public class SortedListofSquaresCC {
	
	public static void Squares(int arr[]){
		int length = arr.length;
		int arr1[] = new int[length];
		int j=0;
		for(int i=0;i<length;i++){
			arr1[j] = arr[i] * arr[i];
			j++;
		}
		Arrays.sort(arr1);
		for(j=0;j<arr1.length;j++){
			System.out.println(arr1[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3,-1,0,2,4};
		Squares(arr);
	}

}
