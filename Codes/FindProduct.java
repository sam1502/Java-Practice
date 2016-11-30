//You have been given an array A of size N
//consisting of positive integers.
//You need to find and print the product of all the number in this array Modulo (10^9+7)

import java.util.*;
class FindProduct {
	public static void main(String args[]) {
		long mod=(long)Math.pow(10,9)+7;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x;
		long product=1;
		for(x=0;x<n;x++)
		{
			product=product*scan.nextLong()%mod;
		}
		System.out.println(product);
		} 
}