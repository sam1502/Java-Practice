// Java program to print a star pattern.
//    *
//   **
//  ***
// ****
//*****

import java.util.Scanner;

public class RSpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sam = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sam.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
