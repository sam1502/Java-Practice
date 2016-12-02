//Java program to check if the given number is palindrome or not.

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = in.nextInt();
		int temp = num;
		int sum=0;
		
		while(num>0){
		int r = num%10;
		sum = (sum*10)+r;
		num = num/10;
		}
	
		if(temp == sum){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
			
		}
	}

}
