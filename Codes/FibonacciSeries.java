//Fibonacci series program in Java.

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,third = 0,i;
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		System.out.println(first);
		System.out.println(second);
		
		for(i=1;i<num;i++){
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			}
		}
	}
