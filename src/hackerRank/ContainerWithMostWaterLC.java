/*
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */



package hackerRank;

import java.util.Scanner;

public class ContainerWithMostWaterLC {
	
	
	public static int calculateArea(int arr[]){
		int area = 0;
		int left = 0;
		int right = arr.length -1;
		
		while(left < right){
		area = Math.max(area,(right - left) * Math.min(arr[left], arr[right]));
		if(arr[left] < arr[right])
			left++;
		else{
		right--;
		}
	}
		
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		System.out.println(calculateArea(arr));
	}

}
