package com.Practice;

import java.util.Scanner;

public class ApplyingCurveToGradesCC {
	
	static void applyCurve(int arr[], int raise){
		int n = arr.length;
		System.out.println("Grades after applying the curve are: ");
		for(int i=0;i<n;i++){
			if(arr[i] >= 100){
				System.out.println(arr[i]);
			}
			else{
				arr[i] = arr[i]+raise;
				if(arr[i] >= 100 ){
					System.out.println("100");
				}
				else
					System.out.println(arr[i]);
			}
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of Grade Array : ");
		int n = in.nextInt();
		int Garr[] = new int[n];
		System.out.println("Enter the Grades : ");
		for(int i=0;i<n;i++){
			Garr[i] = in.nextInt();
		}
		System.out.println("Enter the curve to be applied: ");
		int raise = in.nextInt();
		applyCurve(Garr,raise);
	}
	

}
