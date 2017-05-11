// Program to check if the given input of integer numbers is binary or not.


package JavaConceptOfTheDay;

import java.util.Scanner;

public class isBinary {
	
	public static void isBinary(int num){
		int b = num;
		boolean isBinary = true;
		
		while(b != 0){
			int temp = b % 10;
			if(temp > 1){
				isBinary = false;
			}
			else
				b = b/10; 
			break;
		}
		if(isBinary){
			System.out.println("Binary Number.");
		}
		else{
			System.out.println("Not a binary number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string of numbers : ");
		int a = in.nextInt();
		in.close();
		
		isBinary(a);

	}

}
