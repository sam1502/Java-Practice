//Multiplication of a matrix.

import java.util.Scanner;

       class MultiplyMatrix
  {
       public static void main(String args[])
  {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the base of square matrix");
       n=sc.nextInt();
       int a[][]=new int[n][n];
       int b[][]=new int[n][n];
       int c[][]=new int[n][n];
       System.out.println("Enter the elements of matrix a");
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   a[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("Enter the elements of matrix b");
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   b[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("Multiplying the matrices....");
       {
    	   for(int i=0;i<n;i++)
    	   {
    		   for(int j=0;j<n;j++)
    		   {
    			   for(int k=0;k<n;k++)
    			   {
    				   c[i][j]=c[i][j]+a[i][k]*b[k][j];
    			   }
    		   }
    	   }
       System.out.println("the product is:");
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   System.out.print(c[i][j]+"   ");
    	   }
    	   System.out.println();
       }
     }
  }
}