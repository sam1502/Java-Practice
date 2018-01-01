//A modified Kaprekar number is a positive whole number  with  digits, such that when we split its square into two pieces - 
//a right hand piece r with d digits and a left hand piece l that contains the remaining d or d-1 digits, 
//the sum of the pieces is equal to the original number (i.e. l + r = n).

package HackerRank;

import java.util.Scanner;

public class ModifiedKaprekarNumbersHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		in.close();
		
		boolean foundNumber = false;
		for(int i = p;i < q; i++){
			if(isNumberKaprekar(i)){
				foundNumber = true;
			}
		}
		if(!foundNumber){
			System.out.println("INVALID RANGE");
		}

	}

	private static boolean isNumberKaprekar(int num) {
		// TODO Auto-generated method stub
		long squareNum = num * num;
		String str = String.valueOf(squareNum);
		String strL = str.substring(0,str.length()/2);
		String strR = str.substring(str.length()/2);
		
		int numL = (strL.isEmpty()) ? 0 : Integer.parseInt(strL);
		int numR = (strR.isEmpty()) ? 0 : Integer.parseInt(strR);
		
		if(numL + numR == num){
			System.out.println(num + " ");
			return true;
		}
		return false;
	}

}
