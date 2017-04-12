//Given a list of integers, find the highest product you can get from three of the integers.
// O(n3)
// O(n log n)


package com.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class MaxProduct3IC {
	
	//O(n3)
	
public static void MaxProduct(int arr[])
	{
		int n = arr.length;
		int prod = 0;
		int product = arr[0] * arr[1] * arr[2];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(i != j && j != k && i != k)
						prod = arr[i] * arr[j] * arr[k];
					if(prod > product){
						//System.out.println(arr[i]+ " " + arr[j] + " " +arr[k]);
						product = prod;
					}
				}
			}
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		MaxProduct(arr);

	}
	
	//O(nlog n)
	/*
	public static void MaxProduct(ArrayList<Integer> al){
		int n = al.size();
		Collections.sort(al);
		Collections.reverse(al);
		int product = al.get(0) * al.get(1) * al.get(2);
		System.out.println(product);
	}


public static void main(String args[]){
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(5);
	al.add(3);
	al.add(4);
	
	MaxProduct(al);
}
*/
}
