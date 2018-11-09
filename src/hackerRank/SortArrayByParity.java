package hackerRank;

/*
 * Given an array A of non-negative integers,
 * return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * 
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 */



import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayByParity {
	
	public static void doThemagic(int arr[]){
		for(int i=0,j=0;j<arr.length;j++){
			if(arr[j] % 2 == 0){
				int temp = arr[i];
				arr[i++] = arr[j];
				arr[j] = temp;
				
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		doThemagic(arr);

	}

}
