package hackerRank;

/*
 * Implement function that has a string parameter str, 
 * and returns the same string in lowercase.
 */


import java.util.Scanner;

public class ToLowerCase {
	
	//can be done using ascii values too
	//convert the string character to char compare it to the 
	//ascii value of equivalent alphabet and add 32 to it.
	
	private static String convert(String UC){
		String LC = "";
		LC = UC.toLowerCase();
		return LC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String UC = in.next();
		
		System.out.println(convert(UC));

	}

}
