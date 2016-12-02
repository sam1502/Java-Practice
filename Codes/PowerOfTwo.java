//Java program to check if the given number is power of 2 or not.

import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num = in.nextInt();
		
		if(num<0){
			System.out.println("Enter a proper number");
		}
		while(num>1){
			if(num%2!=0){
				System.out.println("Number is not a power of 2");
				
			}
			num = num/2;
			total++;
			
		}
		System.out.println("Number is power of 2");
		System.out.println(total);
			}
		}