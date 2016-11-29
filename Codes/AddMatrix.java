//Simple java code for addition of matrix.

import java.util.*;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = in.nextInt();
		System.out.println("Enter the number of columns");
		int columns = in.nextInt();
		int [][] matrix = new int[rows][columns];
		int [][] matrix2 = new int[rows][columns];
		
		System.out.println("Enter the first Matrix");		//1st Matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				matrix[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Enter the second Matrix");		//2nd Matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				matrix2[i][j] = in.nextInt();
			}
		}
		int [][] matrix3 = new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				matrix3[i][j] = matrix[i][j]+matrix2[i][j];	//Addition of Matrix
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix3[i][j]);
			}
		}
		
		

	}

}
